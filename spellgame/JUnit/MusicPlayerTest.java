/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shainatodi
 */
public class MusicPlayerTest {
    
    public MusicPlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of loadMusic method, of class MusicPlayer.
     */
    @Test
    public void testLoadMusic() {
        String filePath = "music/Explosion sound effect - REALISTIC.wav";
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic(filePath);
        // check if sfx is being loaded
    }

    /**
     * Test of playMusic method, of class MusicPlayer.
     */
    @Test
    public void testPlayMusic() {
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic("music/Explosion sound effect - REALISTIC.wav");
        instance.playMusic();
        //check if sfx is being played
       
    }

    /**
     * Test of stopMusic method, of class MusicPlayer.
     */
    @Test
    public void testStopMusic() {
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic("music/Explosion sound effect - REALISTIC.wav");
        instance.stopMusic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class MusicPlayer.
     */
    @Test
    public void testSetVolume() {
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic("music/Explosion sound effect - REALISTIC.wav");
        float volume = 1.0F;
        instance.setVolume(volume);
        // check if volume has been adjusted
    }

    /**
     * Test of setSoundEffectsEnabled method, of class MusicPlayer.
     */
    @Test
    public void testSetSoundEffectsEnabled() {
        System.out.println("setSoundEffectsEnabled");
        boolean enabled = false;
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic("music/Explosion sound effect - REALISTIC.wav");
        instance.setSoundEffectsEnabled(enabled);
        // check if sound effects have been enabled
    }
    /**
     * Test of getVolume method, of class MusicPlayer.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        MusicPlayer instance = new MusicPlayer();
        instance.loadMusic("music/Explosion sound effect - REALISTIC.wav");
        instance.setVolume(1.5F);
        float expResult = 1.5F;
        float result = instance.getVolume();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
