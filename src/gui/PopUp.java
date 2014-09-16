/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controller;
import gameLogic.Director;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author manutero
 */
public class PopUp extends javax.swing.JFrame {

  /**
   * Creates new form PopUp
   * @param choices
   */
  public PopUp(final List<Director> choices) {
    this.choices = createListModel(choices);
    initComponents();
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jSplitPane2 = new javax.swing.JSplitPane();
    jScrollPane1 = new javax.swing.JScrollPane();
    selectionList = new javax.swing.JList();
    selectionButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Selección del Staff");
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setPreferredSize(new java.awt.Dimension(200, 350));
    setResizable(false);
    setSize(new java.awt.Dimension(200, 350));
    setType(java.awt.Window.Type.POPUP);

    jSplitPane2.setDividerLocation(290);
    jSplitPane2.setDividerSize(3);
    jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

    selectionList.setModel(this.choices);
    selectionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane1.setViewportView(selectionList);

    jSplitPane2.setTopComponent(jScrollPane1);

    selectionButton.setText("Seleccionar");
    selectionButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        selectionButtonActionPerformed(evt);
      }
    });
    jSplitPane2.setRightComponent(selectionButton);

    getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void selectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionButtonActionPerformed
    
  }//GEN-LAST:event_selectionButtonActionPerformed

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
      java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PopUp(new LinkedList<>()).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSplitPane jSplitPane2;
  private javax.swing.JButton selectionButton;
  private javax.swing.JList selectionList;
  // End of variables declaration//GEN-END:variables

  // --------------------

  private DefaultListModel choices;
  private Controller controller;

  public void setController(Controller controller) {
    this.controller = controller;
  }

  private DefaultListModel createListModel(final List<Director> choices) {
    DefaultListModel response = new DefaultListModel();
    int i = 0;
    for (Director director : choices) {
      response.add(i, director);
    }
    return response;
  }

  public void launch() {

    // runtime configuration
    setVisible(true);
  }

}
