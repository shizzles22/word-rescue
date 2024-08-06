/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
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
public class UserTest {
    private static User currUser;
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass(User testUser) {
        currUser = testUser;
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
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = currUser;
        String expResult = "Siddh";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class User.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        User instance = currUser;
        int expResult = 2;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevelScore method, of class User.
     */
    @Test
    public void testGetLevelScore() {
        System.out.println("getLevelScore");
        int lvl = 0;
        User instance = currUser;
        int expResult = 200;
        int result = instance.getLevelScore(lvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class User.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        User instance = currUser;
        int[] expResult = new int[5];
        for(int i=0; i<5; i++){
            expResult[i] = i*100;
        }
        int[] result = instance.getScore();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalScore method, of class User.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore");
        User instance = currUser;
        int expResult = 1000;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstructor method, of class User.
     */

    /**
     * Test of setLevel method, of class User.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int newLevel = 0;
        User instance = currUser;
        instance.setLevel(newLevel);
        if(newLevel == instance.getLevel()){
            System.out.println("Test case passed");
        }
        fail("The test case is a prototype.");
    }
    public void testNewMistake() {
        String word = "hello";
        User instance = currUser;
        instance.newMistake(word);
        //check if word is added to mistake array
        List<String> mistakes = currUser.getMistakes();
        for(int i=0; i<mistakes.size(); i++){
            if(word == mistakes.get(i)){
                System.out.println("Test case passed");
            }
        }
        System.out.println("Failed");
    }
}