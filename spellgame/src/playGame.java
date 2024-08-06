/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author siddh device
 */


import java.awt.Color;

import java.awt.event.*;
import java.io.File;
import javax.swing.Timer;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class playGame extends javax.swing.JFrame {
    private Timer newTimer;
    private static int sec = 60;
    private int currLives = 3;
    private User currUser;
    private int score;
    private int level;
    private int currWord;
    private int[] modifiers;
    private javax.swing.JButton rightWord;
    //private String clickSound;

    public playGame(User currUser, int level) throws IOException {
        this.currUser = currUser;
        this.level = level;
        if(this.level >= 6){
            this.level = 5;
        }
        this.currWord = 0;
        sec = 60;
        initComponents();
        skipButton.setVisible(false);
        setGameModifiers();
        setTimer();
        setLevel();
        setLives();
        setSize(900, 540); 
        setWords(0);
       // clickSound = ("src/user/Womp Womp Womp sound effect.wav"); // Load default music
        

    }
    private void setGameModifiers(){
        if(currUser.getDeveloper() == false){
            return;
        }
        boolean[] selectedModifiers = currUser.getModifiers();
        if(selectedModifiers[0] == true){
            this.currLives = 99;
        }
        if(selectedModifiers[1] == true){
            this.sec = 999;
            
        }
        if(selectedModifiers[2] == true){
            skipButton.setVisible(true);
            
        }
    }
     
    @SuppressWarnings("unchecked")
    
    private void wrongSE(String soundName){
        try{            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(soundName));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
        
       
 }    
    private void bombSE(String soundName){
        try{            
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(soundName));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
        
       
 }    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ObjectB = new javax.swing.JButton();
        ObjectA = new javax.swing.JButton();
        ObjectC = new javax.swing.JButton();
        labelTimer = new javax.swing.JLabel();
        currLevel = new javax.swing.JLabel();
        javax.swing.JLabel textCurrScore = new javax.swing.JLabel();
        currScore = new javax.swing.JLabel();
        liveOne = new javax.swing.JLabel();
        liveTwo = new javax.swing.JLabel();
        liveThree = new javax.swing.JLabel();
        javax.swing.JLabel bombLabel = new javax.swing.JLabel();
        skipButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        ObjectB.setFont(new java.awt.Font("Krungthep", 0, 15)); // NOI18N
        ObjectB.setText("ObjectB");
        ObjectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectBActionPerformed(evt);
            }
        });
        getContentPane().add(ObjectB);
        ObjectB.setBounds(340, 250, 120, 60);

        ObjectA.setFont(new java.awt.Font("Krungthep", 0, 15)); // NOI18N
        ObjectA.setText("ObjectA");
        ObjectA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObjectAMouseClicked(evt);
            }
        });
        ObjectA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectAActionPerformed(evt);
            }
        });
        getContentPane().add(ObjectA);
        ObjectA.setBounds(140, 250, 120, 60);

        ObjectC.setFont(new java.awt.Font("Krungthep", 0, 15)); // NOI18N
        ObjectC.setText("ObjectC");
        ObjectC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectCActionPerformed(evt);
            }
        });
        getContentPane().add(ObjectC);
        ObjectC.setBounds(540, 250, 120, 60);

        labelTimer.setForeground(new java.awt.Color(255, 255, 255));
        labelTimer.setText("60");
        getContentPane().add(labelTimer);
        labelTimer.setBounds(30, 30, 30, 30);

        currLevel.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        currLevel.setForeground(new java.awt.Color(255, 255, 255));
        currLevel.setText("Level X");
        getContentPane().add(currLevel);
        currLevel.setBounds(770, 10, 130, 36);

        textCurrScore.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        textCurrScore.setForeground(new java.awt.Color(255, 255, 255));
        textCurrScore.setText("Score:");
        getContentPane().add(textCurrScore);
        textCurrScore.setBounds(10, 460, 50, 17);

        currScore.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        currScore.setForeground(new java.awt.Color(255, 255, 255));
        currScore.setText("0");
        getContentPane().add(currScore);
        currScore.setBounds(60, 460, 50, 17);

        liveOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-heart-48.png"))); // NOI18N
        getContentPane().add(liveOne);
        liveOne.setBounds(90, 20, 48, 48);

        liveTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-heart-48.png"))); // NOI18N
        getContentPane().add(liveTwo);
        liveTwo.setBounds(150, 20, 53, 48);

        liveThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-heart-48.png"))); // NOI18N
        getContentPane().add(liveThree);
        liveThree.setBounds(210, 20, 50, 48);

        bombLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-bomb-48.png"))); // NOI18N
        getContentPane().add(bombLabel);
        bombLabel.setBounds(20, 20, 48, 48);

        skipButton.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        skipButton.setText("Skip");
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });
        getContentPane().add(skipButton);
        skipButton.setBounds(790, 460, 72, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/bomb_image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObjectAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectAActionPerformed
        try {
            if(ObjectA != rightWord){
                currUser.newMistake(ObjectA.getText());
                currLives--;
                setLives();
            }
            else{
                setScore();
            }
            
            this.currWord++;
            setWords(currWord);
        } catch (IOException ex) {
            Logger.getLogger(playGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ObjectAActionPerformed

    private void ObjectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectBActionPerformed
        try {
            if(ObjectB != rightWord){
                currUser.newMistake(ObjectA.getText());
                currLives--;
                setLives();
            }
            else{
                setScore();
            }
            this.currWord++;
            setWords(currWord);
        } catch (IOException ex) {
            Logger.getLogger(playGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ObjectBActionPerformed

    private void ObjectCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectCActionPerformed
        try {
            
            if(ObjectC != rightWord){
                currUser.newMistake(ObjectA.getText());
                currLives--;
                setLives();
            }
            else{
                setScore();
            }
            this.currWord++;
            setWords(currWord);
        } catch (IOException ex) {
            Logger.getLogger(playGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ObjectCActionPerformed

    private void ObjectAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjectAMouseClicked
    }//GEN-LAST:event_ObjectAMouseClicked

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        try {
            this.currWord++;
            setWords(currWord);// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(playGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_skipButtonActionPerformed
    
    
    /*
     * @param args the command line arguments
     */
    
    private void setWords(int i) throws IOException{
        String[][][] levels = new String[][][] {
             {{"#Cat", "Cet", "Kat"}, {"Dag", "#Dog", "Daug"}, {"San", "#Sun", "Sinn"}, {"Hatt", "#Hat", "Het"}, {"#Red", "Rhed", "Rhead"}, {"Cip", "Kup", "#Cup"}, {"#Bed", "Bod", "Bim"}, {"#Fox", "Fex", "Foks"}, {"Batte", "#Bat", "Baat"}, {"Moud", "Mudd", "#Mud"}},
             {{"Laike", "Lek", "#Lake"}, {"Fraug", "Freg", "#Frog"}, {"Snaw", "Snoe", "#Snow"}, {"Burd","#Bird", "Bierd"}, { "Stor","#Star", "Staar"}, {"#Moon", "Mune", "Monn"}, {"Fesh", "Phish", "#Fish"}, {"Korn", "#Corn", "Corne"}, {"#Tree", "Tre", "Trea"}, {"Wulf", "Woalf", "#Wolf"}},
             {{"#Blade", "Blaid", "Blaed"}, {"#Crisp", "Crisp", "Krysp"}, {"Flut", "Phlute", "#Flute"}, {"Gost", "Ghust", "#Ghost",}, {"Juel", "Guel", "#Jewel"}, {"#Knock", "Nock", "Knok"}, {"#Quilt", "Quylt", "Kwilt"}, {"Ryver", "#River", "Rivver"}, {"Scate", "Skayt", "#Skate"}, {"Twyst", "Twisst", "#Twist"}},
             {{"#Biscuit", "Bisquit", "Biskit"}, {"#Circus", "Sircus", "Circas"}, {"Dragun", "Draygon", "#Dragon"}, {"#Fabric", "Fabrick", "Fabrik"}, {"Galaxi", "#Galaxy", "Galuxy"}, {"#Harbor", "Harber", "Harbore"}, {"#Insect", "Incect", "Insct"}, {"Jungel", "Jangle", "#Jungle"}, {"#Kettle", "Ketle", "Kitle"}, {"Lumbar","#Lumber", "Lumbir"}},
             {{"Balconey", "Balkony", "#Balcony"}, {"Capitul", "#Capital", "Capetal"}, {"Diamund", "#Diamond", "Diamand"}, {"#Eclipse", "Eclips", "Eklipse"}, {"#Factory", "Factury", "Faktory"}, {"Glacer", "Glaisier", "#Glacier",}, {"#History", "Histry", "Historey"}, {"Jurney", "#Journey", "Jorney"}, {"#Kinetic", "Kynetic", "Cinetic"}, {"Librery", "#Library", "Librari"}},  
         };
        if(i > 9){
           summaryPage nextPage = new summaryPage(currUser, level);
           newTimer.stop();
           sec = -1;
           nextPage.setVisible(true);
           dispose();
        }
        
        else{
            setObjectName(ObjectA, levels[this.level-1][i][0]);
            setObjectName(ObjectB, levels[this.level-1][i][1]);
            setObjectName(ObjectC, levels[this.level-1][i][2]);
        }
        
    }
    
     private void setObjectName(javax.swing.JButton jButton, String word){
        if(word.charAt(0) == '#'){
            this.rightWord = jButton;
            jButton.setText(word.substring(1));
        }
        else{
            jButton.setText(word);
        }
    }
    private void setTimer(){
        newTimer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sec--;
                labelTimer.setText(""+sec);
                if(sec==0){
                    gameOver ranOutOfLives = new gameOver(currUser);
                    ranOutOfLives.setVisible(true);
                    bombSE("/music/Explosion sound effect - REALISTIC.wav");
                    sec = -1;
                    newTimer.stop();
                    dispose();
                }
            }
        });
        newTimer.start();
        if(sec==0){
            newTimer.stop();
        }
    }
    private void setLevel(){
        int realLevel = level;
        if(realLevel == 5){
            currLevel.setText("Challenge Level");
        }
        else{
            currLevel.setText("Level " + realLevel);
        }
       
    }
    private void setLives(){
        
        if(currLives < 1){
            gameOver ranOutOfLives = new gameOver(this.currUser);
            ranOutOfLives.setVisible(true);
            dispose();
            bombSE("/music/Explosion sound effect - REALISTIC.wav");

        }
        if(currLives == 2){
            wrongSE("/user/Womp Womp Womp sound effect.wav");
            liveThree.setIcon(null);
        }
        else if(currLives == 1){
            wrongSE("/user/Womp Womp Womp sound effect.wav");
            liveTwo.setIcon(null);
        }   
    }
    
    private void setScore(){
        int newScore = Integer.parseInt(currScore.getText())+100;
        currScore.setText(Integer.toString(newScore));
        currUser.setLevelScore(this.level, newScore);
    }
     public int getScore(){
        return score;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ObjectA;
    private javax.swing.JButton ObjectB;
    private javax.swing.JButton ObjectC;
    private javax.swing.JLabel currLevel;
    private javax.swing.JLabel currScore;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelTimer;
    private javax.swing.JLabel liveOne;
    private javax.swing.JLabel liveThree;
    private javax.swing.JLabel liveTwo;
    private javax.swing.JButton skipButton;
    // End of variables declaration//GEN-END:variables
}
