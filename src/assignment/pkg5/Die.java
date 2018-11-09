 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author thor1
 */
public class Die 
{
    int eyes;
    int[] rolls;
    
    public Die(int eyes)
    {
        this.eyes = eyes;
    }
    public int roll()
    {
        Random rng = new Random();
        return rng.nextInt(eyes)+1;
    }
    
    public void rollDices(int numberOfRolls)
    {
        rolls = new int[numberOfRolls];
        for (int i = 0; i < rolls.length; i++) 
        {
            rolls[i] = roll();
        }
    }
    
    public void printRolls()
    {
        System.out.println(Arrays.toString(rolls));
    }
    
    public void reset()
    {
        rolls = new int [0];
    }
    
    public int getEyeCount(int eyeNumber)
    {
        int eyeCount = 0;
        for (int i = 0; i < rolls.length; i++) 
        {
            if (eyeNumber == rolls[i]) 
            {
                eyeCount++;
            }
            
        }
        return eyeCount;
    }
    
    public double getEyeFrequency(int eyeNumber)
    {
        int eyeCount = getEyeCount(eyeNumber);
        return eyeCount/rolls.length;
    }
    
    public int totalNumberOfRolls()
    {
        return rolls.length + 1;
    }

}

