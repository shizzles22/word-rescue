/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import org.json.simple.parser.ParseException;

/**
 *
 * @author shainatodi
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
   private User currUser;
   private MusicPlayer currMusic;
    public menu(User newUser) {
        
       
        initComponents();
        setSize(880, 540); 

        currUser = newUser;
        setUsername(currUser.getName());
        
        Action playAction = new AbstractAction("Play Game") {
        @Override
        public void actionPerformed(ActionEvent e) {
            play();
        }
        };
        
        Action quitAction = new AbstractAction("Quit") {
        @Override
        public void actionPerformed(ActionEvent e) {
            quit();
        }
        };
     
     
     String key1 = "Play Game";
     String key2 = "Quit";

             
     play_button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0), key1);
    play_button.getActionMap().put(key1, playAction);
    
     quit_button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0), key2);
    quit_button.getActionMap().put(key2, quitAction);
     
    }
    //for testing only
    public User getUser(){
        return this.currUser;
    }
    private void quit(){
        System.exit(0);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    private void play(){
       try {
           new playGame(currUser, currUser.getLevel()).setVisible(true);          
           this.dispose();
       } catch (IOException ex) {
           Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
    private void setUsername(String username) {
        userName.setText("Welcome, " + username); // Update the label with the username
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        instructions_button = new javax.swing.JButton();
        play_button = new javax.swing.JButton();
        settings_button = new javax.swing.JButton();
        scoreboard_button = new javax.swing.JButton();
        quit_button = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        instructions_button.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        instructions_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-instructions-22.png"))); // NOI18N
        instructions_button.setText("Instructions");
        instructions_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructions_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(instructions_button);
        instructions_button.setBounds(230, 130, 420, 50);

        play_button.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        play_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-game-controller-22.png"))); // NOI18N
        play_button.setText("Play Game");
        play_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(play_button);
        play_button.setBounds(230, 200, 420, 50);

        settings_button.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        settings_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-settings-22.png"))); // NOI18N
        settings_button.setText("Settings");
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(settings_button);
        settings_button.setBounds(230, 270, 420, 50);

        scoreboard_button.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        scoreboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-leaderboard-22.png"))); // NOI18N
        scoreboard_button.setText("Scoreboard");
        scoreboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreboard_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(scoreboard_button);
        scoreboard_button.setBounds(230, 340, 420, 50);

        quit_button.setFont(new java.awt.Font("Impact", 1, 16)); // NOI18N
        quit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-quit-22.png"))); // NOI18N
        quit_button.setText("Quit");
        quit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(quit_button);
        quit_button.setBounds(230, 410, 420, 50);

        userName.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setText("username");
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName);
        userName.setBounds(290, 60, 290, 31);

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-back-24.png"))); // NOI18N
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button);
        back_button.setBounds(830, 20, 45, 55);

        jLabel2.setFont(new java.awt.Font("Bank Gothic", 1, 13)); // NOI18N
        jLabel2.setText("Press 'P' to Play Game or 'Q' to Quit Game");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 480, 310, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/game_background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instructions_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructions_buttonActionPerformed
instructions_button.setActionCommand("back");
        String cmd = evt.getActionCommand();
         if (cmd.equals("back")) {
            dispose();

            new instructions(currUser).setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_instructions_buttonActionPerformed

    private void play_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_buttonActionPerformed
        play();
     
    
// TODO add your handling code here:
    }//GEN-LAST:event_play_buttonActionPerformed

    private void settings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_buttonActionPerformed
        new SettingsFrame(currUser).setVisible(true);
        this.dispose(); 
// TODO add your handling code here:
    }//GEN-LAST:event_settings_buttonActionPerformed

    private void scoreboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreboard_buttonActionPerformed
    this.dispose();
       try {
           new sbFrame(currUser).setVisible(true);// TODO add your handling code here:
       } catch (ParseException ex) {
           Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_scoreboard_buttonActionPerformed

    private void quit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_buttonActionPerformed
        quit();// TODO add your handling code here:
    }//GEN-LAST:event_quit_buttonActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        this.dispose();
       try {
           new ProfilesFrame().setVisible(true);// TODO add your handling code here:
       } catch (IOException ex) {
           Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ParseException ex) {
           Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
       }
    
       
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton instructions_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton play_button;
    private javax.swing.JButton quit_button;
    private javax.swing.JButton scoreboard_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
