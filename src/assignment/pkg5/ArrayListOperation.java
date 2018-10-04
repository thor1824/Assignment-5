/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.ArrayList;
import java.util.Random;
import javafx.util.converter.NumberStringConverter;

/**
 *
 * @author thor1
 */
public class ArrayListOperation 
{
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    public ArrayListOperation()
    {
        
    }
    
    public void addRandomNumbers(int numberOfAdditions, int minRoll, int maxRoll)
    {
        Random rng = new Random();
        for (int i = 0; i < numberOfAdditions; i++) 
        {
            numbers.add(rng.nextInt(maxRoll - minRoll +1) + minRoll);
        }
    }
    
    public void printArraList()
    {
        System.out.println(numbers);
    }
    
    public void numberOfOccuences(int seachNumber)
    {
        int occuences = 0;
        for (int i = 0; i < 10; i++) 
        {
            
            if(seachNumber == numbers.get(i))
            {
                occuences++;
            }
        }
        System.out.println(seachNumber + " has Occuered " + occuences + " times" );
    }
    
    public int getLowest()
    {
        int lowest = 100;
        for (int i = 0; i < numbers.size(); i++) 
        {
            if (numbers.get(i) < lowest)
            {
                lowest = numbers.get(i);
            }
        }
        return lowest;
    }
    public int getHighest()
    {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) 
        {
            if (numbers.get(i) > highest)
            {
                highest = numbers.get(i);
            }
        }
        return highest;
    }
    public int getSum()
    {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            sum = sum + numbers.get(i);
        }
        return sum;
    }
    
    
    public int getFirstOccuenc(int seachNumber)
    {
        int spotNr = 1;
        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) == seachNumber)
            {
                i = numbers.size();
            }
            else
            {
                spotNr++;
            }
            
        }
        return spotNr;
    }
    public int getLastOccuenc(int seachNumber)
    {
        int spotNr = 0;
        for (int i = 0; i < numbers.size(); i++) 
        {
            if (numbers.get(numbers.size() - i - 1) == seachNumber)
            {
                i = numbers.size();
            }
            else
            {
                spotNr++;
            }
            
        }
        return numbers.size() - spotNr;
    }
    
    public void reverse()
    {
        for (int i = 0; i < numbers.size() / 2; i++) 
        {
            int temp = numbers.get(i);
            numbers.set( i, numbers.get(numbers.size() - i - 1));
            numbers.set(numbers.size() - i - 1, temp);
        }
    }
}
