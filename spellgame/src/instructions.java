/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shainatodi
 */
public class instructions extends javax.swing.JFrame {

    /**
     * Creates new form instructions
     */
    private User currUser;
    public instructions(User newUser) {
        currUser = newUser;
        initComponents();
        setSize(880, 540);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("How to play?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 80, 123, 31);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Krungthep", 2, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("To play the game, click on the ‘play’ button in the main menu. You’re the bomb diffuser! \nSelect the right wire (the right spelling of the prompted word) before the timer runs out to increase your score and \nproceed to the next level! You have 3 lives, which means you can choose the wrong word (which will cause the \nbomb to explode) 3 times before your game ends. \n\nThe game consists of 4 levels of increasing difficulty, along with a challenge level! \nOn completing each level, you'll be prompted to save your progress and proceed to the next level. \nMake sure to save to show up on our leaderboard!\n\nTo see your and other players' scores, click ‘scoreboard’ in the main menu. \nTo adjust music, and volume, go to ‘settings’ in the main menu. \nOnce you are done playing, you can go to the main menu and click ‘quit’.\n\nThe back button is located at the top right corner of every page.\n\nIf you are an existing user, click on existing user on the profiles page. \nOr else, click on 'create new user' and then go navigate back to your user profile in existing user.  \nIf you are an instructor or debugger, enter the password provided to you at the login page.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 140, 720, 350);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-back-24.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(838, 10, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/game_background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 970, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton1.setActionCommand("back");
        String cmd = evt.getActionCommand();
         if (cmd.equals("back")) {
            dispose();

            new menu(currUser).setVisible(true);}          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}