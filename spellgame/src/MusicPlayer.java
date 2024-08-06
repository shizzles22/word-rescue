/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nuranrashid
 */

import javax.sound.sampled.*;
import java.io.File;


public class MusicPlayer {
    private static Clip clip;
    private boolean soundEffectsEnabled;
    private float volume;

    public MusicPlayer() {
        soundEffectsEnabled = true; // Default to enabled
        volume = 0.5f; // Default volume
    }

    public void loadMusic(String filePath) {
         try {
        clip = AudioSystem.getClip();
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(filePath));
        clip.open(audioInputStream);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public void playMusic() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music
        }
    }

    public void stopMusic() {
        if (clip != null) {
            clip.stop();
        }
    }

    public void setVolume(float volume) {
        this.volume = volume;
        if (clip != null) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float dB = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
            gainControl.setValue(dB);
        }
    }

    public void setSoundEffectsEnabled(boolean enabled) {
        this.soundEffectsEnabled = enabled;
        // Implement enabling/disabling sound effects if needed
    }

    public boolean isSoundEffectsEnabled() {
        return soundEffectsEnabled;
    }

    public float getVolume() {
        return volume;
    }
}