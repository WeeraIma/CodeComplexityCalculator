/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Imali
 */

  

public class InheritanceResultScreen extends javax.swing.JFrame {

    ArrayList<Integer> ClassesCount = new ArrayList<Integer>();
     ArrayList<Integer> Ti = new ArrayList<Integer>();
      ArrayList<Integer> Ci = new ArrayList<Integer>();
      
      ArrayList<String> classes = new ArrayList<String>();
     ArrayList<Integer> DirectInheritence = new ArrayList<Integer>();
      ArrayList<Integer> IndirectInheritence = new ArrayList<Integer>();
      
      int index1 , index2 , index3 , index4 , index5;

    public InheritanceResultScreen( int index1 , int index2 , int index3 , int index4 , int index5 , ArrayList<String> classes , ArrayList<Integer> directInheritence ,  ArrayList<Integer> IndirectInheritence) {
          initComponents();
          this.classes = classes ;
          this.DirectInheritence = directInheritence;
          this.IndirectInheritence = IndirectInheritence;
          
        DefaultTableModel table = (DefaultTableModel) resultTable.getModel();
         
         for( int x = 0 ; x < classes.size() ; x++) {
             ClassesCount.add(x+1);
         }
         table.addColumn("Count" ,ClassesCount.toArray());
         table.addColumn("Class" ,classes.toArray());
         table.addColumn("DirectInheritence" ,directInheritence.toArray());
         table.addColumn("IndirectInheritence" ,IndirectInheritence.toArray());
         
         for(int y = 0 ; y < classes.size() ; y++) {
            Ti.add(directInheritence.get(y) + IndirectInheritence.get(y));
        }
         table.addColumn("Ti" ,Ti.toArray());
        for(int h = 0 ; h < classes.size() ; h++) {
           if(Ti.get(h) == 0) {
               Ci.add(Ti.get(h) * index1);
           }
            if(Ti.get(h) == 1) {
               Ci.add(Ti.get(h) * index2);
           }
             if(Ti.get(h) == 2) {
               Ci.add(Ti.get(h) * index3);
           }
              if(Ti.get(h) == 3) {
               Ci.add(Ti.get(h) * index4);
           }
            if(Ti.get(h) >= 4) {
               Ci.add(Ti.get(h) *index5);
           }
        }
         table.addColumn("Ci" ,Ti.toArray());
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("InheritedResultScreen"); // NOI18N
        setPreferredSize(null);

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(resultTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Report");

        jButton3.setText("Change Allocated Values for Weights");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Complexity of a program statement due to Inheritance ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(60, 60, 60)
                                .addComponent(jButton2)
                                .addGap(75, 75, 75)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainScreen nextScreen = new MainScreen();
        nextScreen.setVisible(true);

        this.dispose();//to close the current jframe 
    }//GEN-LAST:event_jButton1ActionPerformed

    //Weight Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        InheritanceWeights iw = new InheritanceWeights(classes , DirectInheritence , IndirectInheritence );
        iw.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_jButton3ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
