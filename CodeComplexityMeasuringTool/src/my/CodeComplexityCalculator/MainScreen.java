/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Imali
 */
public class MainScreen extends javax.swing.JFrame {

    //Declare varriables
    
    String choosetxt;
    int cout = 0;
    int countIndex = 0;
    
    ArrayList<String> classes = new ArrayList<String>();
    ArrayList<Integer> directInheritence = new ArrayList<Integer>();
    ArrayList<Integer> IndirectInheritence = new ArrayList<Integer>();
   
    ArrayList<String> all = new ArrayList<String>();
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectProgrammingLangDropDownBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userInputTxtBox = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectProgrammingLangDropDownBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C++" }));
        selectProgrammingLangDropDownBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProgrammingLangDropDownBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Programming Language");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Code Complexity Calculator");

        userInputTxtBox.setColumns(20);
        userInputTxtBox.setRows(5);
        jScrollPane1.setViewportView(userInputTxtBox);

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inheritance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Size");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Complexity of a program due to:");

        jButton5.setText("Variables");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Methods");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Control Structures");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Coupling");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectProgrammingLangDropDownBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton9))
                                            .addComponent(jButton8))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectProgrammingLangDropDownBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userInputTxtBox.setText("");
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        choosetxt = f.getAbsolutePath();
        
        System.out.println(choosetxt);
        try{
            Scanner scanner = new Scanner(new File(choosetxt));
            //Get the Line count of lines in the code
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                userInputTxtBox.setText(userInputTxtBox.getText() + "\n" + line  );
                cout++;
	
                String[] words = line.split(" " ) ;
              
                printFunction(words);
                
            }
            scanner.close();
             fillArray( classes.size());
            for(int count = 0 ; count < classes.size() ; count++){
                getAmount(classes.get(count)); //serachInderectInheritence(classes.get(count));
             }
             for(int countC = 0 ; countC < classes.size() ; countC++){
                if ( IndirectInheritence.get(countC) != 0){
                     IndirectInheritence.set(countC , IndirectInheritence.get(countC) -1 );
                }
                    
             }
             //serachInderectInheritence(classes.get(1));
            System.out.println(classes);
            System.out.println(directInheritence );
            System.out.println(all);
             System.out.println(IndirectInheritence);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

     public void printFunction(String agrWord[]) {
        String sentence = "";
        for ( int i = 0 ; i < agrWord.length ; i++) {
           
            if(agrWord[i].equals("class") || agrWord[i].equals("Class")  ) {
               classes.add(agrWord[i+1]);
                for ( int j = 0 ; j < agrWord.length ; j++) {
                          sentence =  sentence + " " + agrWord[j];
                     }
                     all.add(sentence);
                if(agrWord[i+2].equals("extends") ) {      
                    //directInheritence.add(String.valueOf((Integer.parseInt( directInheritence.get(countIndex) ) + 1)) );
                    directInheritence.add(1);
                    
                     
                }
                else {
                     directInheritence.add(0);
                }
               
                countIndex++;
                
            }
       		
	}
   
   
   }
   
   public void fillArray(int i) {
       for(int x = 0 ; x < i ; x++){
           IndirectInheritence.add(0);
       }
   }
   
   int counter = 0;
   
 
   
   int count3 = 0;
   public void getAmount(String s) {
      
       for(int a  = 0 ; a < all.size() ; a++){
            String[] words2 = all.get(a).split(" " ) ; 
             for(int b  = 0 ; b < words2.length ; b++){
                 if(words2[b].equals("class") || words2[b].equals("Class")) {
                       if(words2[b+1].equals(s)) {
                           
                           
                            if(words2[b+2].equals("extends")) {
                                
                                IndirectInheritence.set(count3 , 
                                     IndirectInheritence.get(count3) + 1
                                );
                                getAmount(words2[b+3]);
                            }else {
                                count3++;
                            }
                            
                       }
                 }
             }
       }
       
      
       
       
   }
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InheritanceResultScreen resultScreen = new InheritanceResultScreen(0 , 1 , 2 , 3 , 4 ,classes , directInheritence , IndirectInheritence );
        resultScreen.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              userInputTxtBox.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    private void selectProgrammingLangDropDownBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProgrammingLangDropDownBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectProgrammingLangDropDownBoxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // control structure
        Cstructure csn = new Cstructure();
        csn.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        VariableComplexity v =new VariableComplexity();
        v.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectProgrammingLangDropDownBox;
    private javax.swing.JTextArea userInputTxtBox;
    // End of variables declaration//GEN-END:variables
}
