package gui;

import controller.Controller;
import gameLogic.staff.Director;
import gameLogic.staff.ScriptWriter;
import javax.swing.ImageIcon;
import utils.GuiHelper;

/**
 *
 * @author manutero
 */
public class MainFrame extends javax.swing.JFrame {

  /**
   * Creates new form MainFrame
   */
  public MainFrame() {
    initComponents();
  }

  //FIXME: delete this method, just call setVisible from controller the "runtime" conf could be done in design mode
  public void launch() {
    dateLabel.setText(gameLogic.GameConstans.STARTING_DATE);
    moneyLabel.setText(String.valueOf(gameLogic.GameConstans.STARTING_MONEY));
    ImageIcon defaultImage = new ImageIcon(GuiHelper.getPortrait("DEFAULT_THUMBNAIL"));
    directorThumbnail.setIcon(defaultImage);
    writerThumbnail.setIcon(defaultImage);

    setVisible(true);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jPanel4 = new javax.swing.JPanel();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jFrame1 = new javax.swing.JFrame();
    jFrame2 = new javax.swing.JFrame();
    toolBar = new javax.swing.JToolBar();
    moneyLabel = new javax.swing.JLabel();
    dolarLabel = new javax.swing.JLabel();
    dateLabel = new javax.swing.JLabel();
    mainTabbedPane = new javax.swing.JTabbedPane();
    tab1Pane = new javax.swing.JSplitPane();
    jPanel1 = new javax.swing.JPanel();
    directorSelectionPane = new javax.swing.JPanel();
    final javax.swing.JLabel fixLabel1 = new javax.swing.JLabel();
    directorName = new javax.swing.JLabel();
    final javax.swing.JLabel fixLabel2 = new javax.swing.JLabel();
    directorRating = new javax.swing.JLabel();
    final javax.swing.JLabel fixLabel3 = new javax.swing.JLabel();
    directorSalary = new javax.swing.JLabel();
    directorThumbnail = new javax.swing.JLabel();
    directorButton = new javax.swing.JButton();
    GuionistSelectionPane = new javax.swing.JPanel();
    final javax.swing.JLabel fixLabel4 = new javax.swing.JLabel();
    writerName = new javax.swing.JLabel();
    final javax.swing.JLabel fixLabel5 = new javax.swing.JLabel();
    writerRating = new javax.swing.JLabel();
    final javax.swing.JLabel fixLabel6 = new javax.swing.JLabel();
    writerSalary = new javax.swing.JLabel();
    writerThumbnail = new javax.swing.JLabel();
    writerButton = new javax.swing.JButton();
    heroSelectionPane = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 81, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 418, Short.MAX_VALUE)
    );

    jButton2.setText("jButton2");

    jButton3.setText("jButton3");

    javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
    jFrame1.getContentPane().setLayout(jFrame1Layout);
    jFrame1Layout.setHorizontalGroup(
      jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jFrame1Layout.setVerticalGroup(
      jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
    jFrame2.getContentPane().setLayout(jFrame2Layout);
    jFrame2Layout.setHorizontalGroup(
      jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jFrame2Layout.setVerticalGroup(
      jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Movie Maker"); // NOI18N
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    toolBar.setRollover(true);

    moneyLabel.setText("jLabel1");
    moneyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        moneyLabelMouseEntered(evt);
      }
    });
    toolBar.add(moneyLabel);

    dolarLabel.setText("$   ");
    toolBar.add(dolarLabel);

    dateLabel.setText("jLabel1");
    toolBar.add(dateLabel);

    getContentPane().add(toolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 20));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

    directorSelectionPane.setBackground(java.awt.Color.white);
    directorSelectionPane.setLayout(new java.awt.GridBagLayout());

    fixLabel1.setText("Director: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    directorSelectionPane.add(fixLabel1, gridBagConstraints);

    directorName.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    directorSelectionPane.add(directorName, gridBagConstraints);

    fixLabel2.setText("Valoración: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    directorSelectionPane.add(fixLabel2, gridBagConstraints);

    directorRating.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    directorSelectionPane.add(directorRating, gridBagConstraints);

    fixLabel3.setText("Salario: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    directorSelectionPane.add(fixLabel3, gridBagConstraints);

    directorSalary.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    directorSelectionPane.add(directorSalary, gridBagConstraints);

    directorThumbnail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    directorThumbnail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/portraits/DEFAULT_THUMBNAIL.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    directorSelectionPane.add(directorThumbnail, gridBagConstraints);

    directorButton.setText("Contratar");
    directorButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        directorButtonActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 61, 11, 2);
    directorSelectionPane.add(directorButton, gridBagConstraints);

    jPanel1.add(directorSelectionPane);

    GuionistSelectionPane.setBackground(java.awt.Color.white);
    GuionistSelectionPane.setLayout(new java.awt.GridBagLayout());

    fixLabel4.setText("Guionista: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    GuionistSelectionPane.add(fixLabel4, gridBagConstraints);

    writerName.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    GuionistSelectionPane.add(writerName, gridBagConstraints);

    fixLabel5.setText("Valoración: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    GuionistSelectionPane.add(fixLabel5, gridBagConstraints);

    writerRating.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    GuionistSelectionPane.add(writerRating, gridBagConstraints);

    fixLabel6.setText("Salario: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    GuionistSelectionPane.add(fixLabel6, gridBagConstraints);

    writerSalary.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    GuionistSelectionPane.add(writerSalary, gridBagConstraints);

    writerThumbnail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/portraits/DEFAULT_THUMBNAIL.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    GuionistSelectionPane.add(writerThumbnail, gridBagConstraints);

    writerButton.setText("Contratar");
    writerButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        writerButtonActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 61, 11, 2);
    GuionistSelectionPane.add(writerButton, gridBagConstraints);

    jPanel1.add(GuionistSelectionPane);

    heroSelectionPane.setBackground(java.awt.Color.white);

    javax.swing.GroupLayout heroSelectionPaneLayout = new javax.swing.GroupLayout(heroSelectionPane);
    heroSelectionPane.setLayout(heroSelectionPaneLayout);
    heroSelectionPaneLayout.setHorizontalGroup(
      heroSelectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 176, Short.MAX_VALUE)
    );
    heroSelectionPaneLayout.setVerticalGroup(
      heroSelectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 60, Short.MAX_VALUE)
    );

    jPanel1.add(heroSelectionPane);

    tab1Pane.setLeftComponent(jPanel1);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 430, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 440, Short.MAX_VALUE)
    );

    tab1Pane.setRightComponent(jPanel2);

    mainTabbedPane.addTab("STAFF", tab1Pane);

    getContentPane().add(mainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 640, 450));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void writerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writerButtonActionPerformed
    controller.scriptWriterButton();
  }//GEN-LAST:event_writerButtonActionPerformed

  private void directorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorButtonActionPerformed
    controller.directorButton();
  }//GEN-LAST:event_directorButtonActionPerformed

  private void moneyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyLabelMouseEntered
    controller.moneyInfo();
  }//GEN-LAST:event_moneyLabelMouseEntered


  /**
   * @param args the command line arguments
   */
  public static void _main(String args[]) {
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
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new MainFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel GuionistSelectionPane;
  private javax.swing.JLabel dateLabel;
  private javax.swing.JButton directorButton;
  private javax.swing.JLabel directorName;
  private javax.swing.JLabel directorRating;
  private javax.swing.JLabel directorSalary;
  private javax.swing.JPanel directorSelectionPane;
  private javax.swing.JLabel directorThumbnail;
  private javax.swing.JLabel dolarLabel;
  private javax.swing.JPanel heroSelectionPane;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JFrame jFrame1;
  private javax.swing.JFrame jFrame2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JTabbedPane mainTabbedPane;
  private javax.swing.JLabel moneyLabel;
  private javax.swing.JSplitPane tab1Pane;
  private javax.swing.JToolBar toolBar;
  private javax.swing.JButton writerButton;
  private javax.swing.JLabel writerName;
  private javax.swing.JLabel writerRating;
  private javax.swing.JLabel writerSalary;
  private javax.swing.JLabel writerThumbnail;
  // End of variables declaration//GEN-END:variables

  //--------------------------------------------------
  //
  private Controller controller;

  public void setController(Controller controller) {
    this.controller = controller;
  }

  public void setMoney(double money) {
    moneyLabel.setText(String.valueOf(money));
  }

  public void setDate(String date) {
    dateLabel.setText(date);
  }
  
  public void displayDirector(Director d) {
    directorName.setText(d.getName());
    directorRating.setText(String.valueOf(d.getRating()));
    directorSalary.setText(String.valueOf(d.getSalary()));
    directorThumbnail.setIcon(new ImageIcon(GuiHelper.getPortrait(d.getThumbnail())));
    directorButton.setText("Despedir");
  }

  public void displayNoDirector() {
    directorName.setText("-");
    directorRating.setText("-");
    directorSalary.setText("-");
    ImageIcon defaultImage = new ImageIcon(GuiHelper.getPortrait("DEFAULT_THUMBNAIL"));
    directorThumbnail.setIcon(defaultImage);
    directorButton.setText("Contratar");
  }

  public void displayNoScriptWriter() {
    writerName.setText("-");
    writerRating.setText("-");
    writerSalary.setText("-");
    ImageIcon defaultImage = new ImageIcon(GuiHelper.getPortrait("DEFAULT_THUMBNAIL"));
    writerThumbnail.setIcon(defaultImage);
    writerButton.setText("Contratar");
  }

  public void displayScriptWriter(ScriptWriter w) {
    writerName.setText(w.getName());
    writerRating.setText(String.valueOf(w.getRating()));
    writerSalary.setText(String.valueOf(w.getSalary()));
    writerThumbnail.setIcon(new ImageIcon(GuiHelper.getPortrait(w.getThumbnail())));
    writerButton.setText("Despedir");
  }

}
