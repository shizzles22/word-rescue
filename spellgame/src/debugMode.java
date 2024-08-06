
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author siddh device
 */
public class debugMode extends javax.swing.JFrame{
    /**
     * Creates new form debugMode
     */
    private User currUser;
    private boolean infiniteLives;
    private boolean infiniteTimer;
    private boolean instructorMode;
    public debugMode() {
        currUser = new User("Developer");
        currUser.setDeveloper(true);
        infiniteLives = false;
        infiniteTimer = false;
        instructorMode = false;
        initComponents();
        setSize(880,540);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton infButtonLives = new javax.swing.JButton();
        javax.swing.JButton infButtonTimer = new javax.swing.JButton();
        javax.swing.JButton instructorButton = new javax.swing.JButton();
        levelSelector = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        infButtonLives.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        infButtonLives.setText("Infinite Lives");
        infButtonLives.setBackground(Color.GRAY);
        infButtonLives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infButtonLivesActionPerformed(evt);
            }
        });
        getContentPane().add(infButtonLives);
        infButtonLives.setBounds(140, 170, 261, 60);

        infButtonTimer.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        infButtonTimer.setText("Infinite Timer");
        infButtonTimer.setBackground(Color.GRAY);
        infButtonTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infButtonTimerActionPerformed(evt);
            }
        });
        getContentPane().add(infButtonTimer);
        infButtonTimer.setBounds(140, 290, 261, 60);

        instructorButton.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        instructorButton.setText("Skip Question");
        instructorButton.setBackground(Color.GRAY);
        instructorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(instructorButton);
        instructorButton.setBounds(470, 170, 260, 60);

        levelSelector.setBackground(Color.GRAY);
        levelSelector.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        levelSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level Selector", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5" }));
        levelSelector.setBackground(Color.GRAY);
        levelSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelSelectorActionPerformed(evt);
            }
        });
        getContentPane().add(levelSelector);
        levelSelector.setBounds(470, 290, 260, 60);

        confirmButton.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        confirmButton.setText("OK");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButton);
        confirmButton.setBounds(400, 480, 72, 23);

        jLabel1.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Modifier:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 70, 220, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/game_background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 900, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void infButtonLivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infButtonLivesActionPerformed
        this.infiniteLives = !this.infiniteLives;
        currUser.setModifiers(0);
    }//GEN-LAST:event_infButtonLivesActionPerformed

    private void infButtonTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infButtonTimerActionPerformed
        this.infiniteTimer = !this.infiniteTimer;
        currUser.setModifiers(1);
    }//GEN-LAST:event_infButtonTimerActionPerformed

    private void instructorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorButtonActionPerformed
        this.instructorMode = !this.instructorMode;
        currUser.setModifiers(2);
        
    }//GEN-LAST:event_instructorButtonActionPerformed

    private void levelSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelSelectorActionPerformed
        String selectedValue = levelSelector.getSelectedItem().toString();
        int selectedLevel = selectedValue.charAt(6) - '0';
        if(selectedLevel > 10){
            chooseLevel(1);
        }
        else{
            chooseLevel(selectedLevel);
        }
        
    }//GEN-LAST:event_levelSelectorActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        try {
            playGame userPlayGame = new playGame(currUser, currUser.getLevel());
            userPlayGame.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(debugMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    public boolean getLivesModifier(){
        return this.infiniteLives;
    }
    public boolean getTimerModifier(){
        return this.infiniteTimer;
    }
    public boolean getInstructorModifier(){
        return this.instructorMode;
    }
    public User getUser(){
        return this.currUser;
    }
    
    private void chooseLevel(int newLevel){
        currUser.setLevel(newLevel);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> levelSelector;
    // End of variables declaration//GEN-END:variables
}
