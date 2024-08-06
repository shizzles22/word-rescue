/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author shainatodi
 */
public class wordRescue extends javax.swing.JFrame {

    /**
     * Creates new form wordRescue
     */
    //private User currUser;
    public wordRescue() {

        //currUser = newUser;
        MusicPlayer musicPlayer = new MusicPlayer();
        String selectedMusic = "/music/Defusing the Bomb.wav";
        musicPlayer.loadMusic(selectedMusic);
        musicPlayer.playMusic();

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

        enter_button = new javax.swing.JButton();
        welcome_button = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        enter_button.setBackground(Color.getHSBColor(119, 195, 189));
        enter_button.setOpaque(true);
        enter_button.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        enter_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-game-controller-22.png"))); // NOI18N
        enter_button.setText("Enter Game");
        enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(enter_button);
        enter_button.setBounds(330, 440, 270, 60);

        welcome_button.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        welcome_button.setForeground(new java.awt.Color(255, 255, 255));
        welcome_button.setText("Welcome to:");
        getContentPane().add(welcome_button);
        welcome_button.setBounds(410, 70, 70, 64);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/welcome_page.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_buttonActionPerformed
        this.dispose();
        try {
            new ProfilesFrame().setVisible(true);// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(wordRescue.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(wordRescue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enter_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                wordRescue wr = new wordRescue();
                wr.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel welcome_button;
    // End of variables declaration//GEN-END:variables
}
