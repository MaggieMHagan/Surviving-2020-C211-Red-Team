//Red Team - Lance, Maggie and Abi

package GUI;

public class BadOutcome3 extends javax.swing.JFrame {

    /**
     * Creates new form BadOutcome1
     */
    public BadOutcome3() {
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

        panel1 = new java.awt.Panel();
        outcomeImage = new javax.swing.JTextArea();
        outcomeText = new javax.swing.JTextArea();
        tryAgain = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        readMe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SURVIVING 2020");

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setPreferredSize(new java.awt.Dimension(700, 400));

        outcomeImage.setEditable(false);
        outcomeImage.setBackground(new java.awt.Color(0, 0, 0));
        outcomeImage.setColumns(20);
        outcomeImage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        outcomeImage.setForeground(new java.awt.Color(204, 0, 51));
        outcomeImage.setRows(5);
        outcomeImage.setText("   ________________\n  |   |,\"       `. |       | \n  |   /             \\      |\n  |   |              |      |\n  |O _\\   />   /_ ,   |   ___ _\n  |_(_)'.____.'(_)_    |  (\")__(\")\n  [___|[=]__[=]|___]  //    \\\\\n\n");
        outcomeImage.setBorder(null);

        outcomeText.setEditable(false);
        outcomeText.setBackground(new java.awt.Color(0, 0, 0));
        outcomeText.setColumns(20);
        outcomeText.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        outcomeText.setForeground(new java.awt.Color(204, 0, 51));
        outcomeText.setRows(5);
        outcomeText.setText("The PlayStation 5 just sold out... :(");
        outcomeText.setToolTipText("");
        outcomeText.setBorder(null);

        tryAgain.setBackground(new java.awt.Color(0, 0, 0));
        tryAgain.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        tryAgain.setForeground(new java.awt.Color(204, 0, 51));
        tryAgain.setLabel("Try Again");
        tryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainActionPerformed(evt);
            }
        });

        quit.setBackground(new java.awt.Color(0, 0, 0));
        quit.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        quit.setForeground(new java.awt.Color(204, 0, 51));
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(tryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outcomeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(outcomeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        File.setText("File");

        readMe.setText("Read Me");
        File.add(readMe);

        jMenuBar1.add(File);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainActionPerformed
        new TitleScreen().setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_tryAgainActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
          new HighScoreScreen().setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_quitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void showBadOutcome3() {
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
            java.util.logging.Logger.getLogger(BadOutcome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BadOutcome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BadOutcome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BadOutcome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BadOutcome3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextArea outcomeImage;
    private javax.swing.JTextArea outcomeText;
    private java.awt.Panel panel1;
    private javax.swing.JButton quit;
    private javax.swing.JMenuItem readMe;
    private javax.swing.JButton tryAgain;
    // End of variables declaration//GEN-END:variables
}
