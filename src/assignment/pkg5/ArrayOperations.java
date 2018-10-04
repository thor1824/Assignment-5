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
public class ArrayOperations
{
    Random rng = new Random();
    int[] number;
    int numberOfArrays;
    int minimumValue = 0;
    int maximumValue = 0;
    public ArrayOperations(int numberOfElements)
    {
        numberOfArrays = numberOfElements;
        number = new int[numberOfElements];
        
        for (int i = 0; i < numberOfElements; i++) 
        {
            number[i] = rng.nextInt();
        }
    }
    public ArrayOperations(int numberOfElements, int minimumInput, int maximumInput)
    {
        numberOfArrays = numberOfElements;
        
        number = new int[numberOfElements];
        
        for (int i = 0; i < numberOfElements; i++) 
        {
            number[i] = rng.nextInt(maximumInput - minimumInput + 1) + minimumInput;
        }
    }
// public interface:
    public void printArray()
    {
        
        System.out.println(Arrays.toString(number));
    }
    
    public void printNumberAt(int arrayNumber)
    {
        System.out.println("["+number[arrayNumber]+"]");
    }
    
    public void printNumberOf(int numb)
    {
        int occurrences = 0;
        for (int i = 0; i < numberOfArrays ; i++) 
        {
            int index = number[i];
            if (index == numb)
            {
               occurrences++;
            }
        }
        System.out.println(numb + " has occured " + occurrences + " times");
    }
    public int getMimimum()
    {
       // return minimumValue;
        int minimum = maximumValue;
        for (int i = 0; i < numberOfArrays; i++) 
        {
            if(number[i] < minimum)
            {
                minimum = number[i];
            }
        }
        return minimum;
    }
    
    public int getMaximum()
    {
       // return maximumValue;
        int maximum = minimumValue;
        for (int i = 0; i < numberOfArrays; i++) 
        {
            if(number[i] > maximum)
            {
                maximum = number[i];
            }
        }
        return maximum;
    }
    
    public int getSum()
    {
        int total = 0;
        for (int i = 0; i < numberOfArrays; i++) 
        {
            total = total + number[i];
        }
        return total;
    }
   
    
    public double getAverage()
    {
        int total = 0; 
        for (int i = 0; i < numberOfArrays; i++) 
        {
            total = total + number[i];
        }
        return total/numberOfArrays;
    }
    
    public int firstIndexOf(int firstOcc)
    {
        int spotNr = 0; 
        for (int i = 0; i < numberOfArrays; i++) 
        {
            if (number[i] == firstOcc)
            {
                i = numberOfArrays;
            }
            else
            {
                spotNr++;
            }
            
        }
        return spotNr;
    }
    
    public int lastIndexOf(int lastOcc)
    {
        int spotNr = 0; 
        for (int i = 0; i < numberOfArrays; i++) 
        {
            if (number[numberOfArrays - i - 1] == lastOcc)
            {
                i = numberOfArrays;
            }
            else
            {
                spotNr++;
            }
            
        }
        return spotNr;
    }
    
    public void reverse()
    {
        for(int i = 0; i < numberOfArrays / 2; i++)
        {
            int temp = number[i];
            number[i] = number[numberOfArrays - i - 1];
            number[numberOfArrays - i - 1] = temp;
        }
    }
}

