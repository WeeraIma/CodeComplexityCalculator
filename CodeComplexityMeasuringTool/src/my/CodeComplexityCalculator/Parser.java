/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

/**
 *
 * @author Pancha27
 */


import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.Range;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.VoidType;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Parser {

    static HashMap<Integer, Cs> csHashMap = new HashMap<>();
    static HashMap<Integer, Cv> cvHashMap = new HashMap<>();
    static HashMap<Integer, Cm> cmHashMap = new HashMap<>();
    static int lineCount = 0;
   
    static List<String> lines = new ArrayList();
    public static String sourceStr;
    public static void init(String source) {

        StringBuilder contentBuilder = new StringBuilder();

        String filePath = "test/MyClass.java";
        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> {
                contentBuilder.append(s).append("\n");
                lines.add(s);
                csHashMap.put(lineCount, new Cs());
                cvHashMap.put(lineCount, new Cv());
                cmHashMap.put(lineCount, new Cm());
                lineCount++;
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        sourceStr = contentBuilder.toString();
        parse(sourceStr);
        csHashMap.forEach((integer, cs) -> {
            System.out.println(cs);
        });
        cvHashMap.forEach((integer, cv) -> {
            System.out.println(cv);
        });
        cmHashMap.forEach((integer, cm) -> {
            System.out.println(cm);
        });
    }

    private static void parse(String source) {
        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> compilationUnitParseResult = parser.parse(source);
        CompilationUnit compilationUnit = compilationUnitParseResult.getResult().orElse(null);
        compilationUnit.getChildNodes().forEach(Parser::visit);

    }

    private static void visit(Node node) {
        if (node instanceof Parameter) {
            if (((Parameter) node).getType() instanceof  PrimitiveType) {
                addNpdtp(node);
            } else {
                addNcdtp(node);
            }
            return;
        } else if (node instanceof ExpressionStmt) {
            Node node1 = (node.getParentNode().orElse(null)).getParentNode().orElse(null);
            if (!isControlStruc(node1)) {
                Expression expr = ((ExpressionStmt) node).getExpression();
                if (expr instanceof VariableDeclarationExpr) {
                    addNOp(node);

                    VariableDeclarator var = ((VariableDeclarationExpr) expr).getVariables().get(0);
                    if (var.getInitializer().orElse(null) instanceof IntegerLiteralExpr) {
                        addNnv(node);

                        if (var.getType() instanceof PrimitiveType) {
                            // add to Npdtv
                            addNpdtv(node);
                        } else {
                            addNcdtv(node);
                        }
                    }
                }
                addWvs(node);
                return;
            }
        } else if (node instanceof ClassOrInterfaceDeclaration) {
            addNKw(node);
        } else if (node instanceof SimpleName) {
            addNId(node);
        } else if (node instanceof Modifier) {
            addNKw(node);
        } else if (node instanceof VoidType) {
            addNKw(node);
        } else if (node instanceof UnaryExpr) {
            addNOp(node);
        } else if (node instanceof AssignExpr) {
            addNOp(node);
        } else if (node instanceof BinaryExpr) {
            addNOp(node);
        } else if (node instanceof FieldAccessExpr) {
            node.getChildNodes().forEach(Parser::addNOp);
        } else if (node instanceof VariableDeclarationExpr) {
            addNOp(node);
        } else if (node instanceof IntegerLiteralExpr) {
            addNnv(node);
        } else if (node instanceof StringLiteralExpr) {
            addNSl(node);
        } else if (node instanceof VariableDeclarator) {
            Node parentNode = node.getParentNode().orElse(null).getParentNode().orElse(null);
            if (!isControlStruc(parentNode)) {
                addWvs(node);
            }
        } else if (node instanceof MethodDeclaration) {
            if (((MethodDeclaration) node).getType() instanceof  PrimitiveType) {
                addWmrt(node);
            } else if (!(((MethodDeclaration) node).getType() instanceof VoidType)) {
                addWmrt(node);
            }
        }
        node.getChildNodes().forEach(Parser::visit);

    }

    public static boolean isControlStruc(Node node) {
        return (node instanceof ForStmt || node instanceof SwitchExpr || node instanceof WhileStmt);
    }

    public static void addNId(Node node) {
        Range range = node.getRange().orElse(null);
        Cs cs = csHashMap.get(range.begin.line - 1);
        cs.setnId(cs.getnId() + 1);
    }

    public static void addNKw(Node node) {
        Range range = node.getRange().orElse(null);
        Cs cs = csHashMap.get(range.begin.line - 1);
        cs.setnKW(cs.getnKW() + 1);
    }

    public static void addNOp(Node node) {
        Range range = node.getRange().orElse(null);
        Cs cs = csHashMap.get(range.begin.line - 1);
        cs.setnOp(cs.getnOp() + 1);
    }

    public static void addNnv(Node node) {
        Range range = node.getRange().orElse(null);
        Cs cs = csHashMap.get(range.begin.line - 1);
        cs.setnNv(cs.getnNv() + 1);
    }

    public static void addNSl(Node node) {
        Range range = node.getRange().orElse(null);
        Cs cs = csHashMap.get(range.begin.line - 1);
        cs.setnSl(cs.getnSl() + 1);
    }

    public static void addWvs(Node node) {
        Range range = node.getRange().orElse(null);
        Cv cv = cvHashMap.get(range.begin.line - 1);
        cv.setWvs(cv.getWvs() + 1);
    }

    public static void addNpdtv(Node node) {
        Range range = node.getRange().orElse(null);
        Cv cv = cvHashMap.get(range.begin.line - 1);
        cv.setNpdtv(cv.getNpdtv() + 1);
    }

    public static void addNcdtv(Node node) {
        Range range = node.getRange().orElse(null);
        Cv cv = cvHashMap.get(range.begin.line - 1);
        cv.setNcdtv(cv.getNcdtv() + 1);
    }

    public static void addWmrt(Node node) {
        Range range = node.getRange().orElse(null);
        Cm cm = cmHashMap.get(range.begin.line - 1);
        cm.setWmrt(cm.getWmrt() + 1);
    }

    public static void addNpdtp(Node node) {
        Range range = node.getRange().orElse(null);
        Cm cm = cmHashMap.get(range.begin.line - 1);
        cm.setNpdtp(cm.getNpdtp() + 1);
    }

    public static void addNcdtp(Node node) {
        Range range = node.getRange().orElse(null);
        Cm cm = cmHashMap.get(range.begin.line - 1);
        cm.setNcdtp(cm.getNcdtp() + 1);
    }
}
