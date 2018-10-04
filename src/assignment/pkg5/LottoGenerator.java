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
public class LottoGenerator 
{
    int[] lottoNumbers;
    int[] extraNumbers;
    int max;
    int min;
    
    public void drawTheNumbers(int numberOfPulls, int numberOfExtraPulls, int maxPull, int minPull)
    {
        System.out.println("drawing numbers");
        max = maxPull;
        min = minPull;
        Random rng = new Random();
        lottoNumbers = new int[numberOfPulls];
        extraNumbers = new int[numberOfExtraPulls];
        for (int i = 0; i < lottoNumbers.length; i++) 
        {
            lottoNumbers[i] = rng.nextInt((maxPull - minPull + 1) + minPull) ;
            
            for (int j = 0; j <lottoNumbers.length; j++) 
            {
                if(lottoNumbers[i]==lottoNumbers[j] && i >= 1 && i!=j)
                {
                    lottoNumbers[j]= rng.nextInt((maxPull - minPull + 1) + minPull);
                    j = -1;
                }
            }
        }
        for (int i = 0; i < extraNumbers.length; i++) 
        {
            extraNumbers[i] = rng.nextInt((maxPull - minPull + 1) + minPull);
            for (int j = 0; j <extraNumbers.length; j++) 
            {
                if(extraNumbers[i]==extraNumbers[j] && i >= 1 && i!=j)
                {
                    extraNumbers[j]= rng.nextInt((maxPull - minPull + 1) + minPull);
                    j = -1;
                }
            }
        }
        
    }
    
    public void printLottoNumbers()
    {
        System.out.println(
                "Todays lotto numbers are" + 
                Arrays.toString(lottoNumbers) + 
                ". And the lucky umbers are: " + 
                Arrays.toString(extraNumbers)
                );
    }
    
    public void sortLottoNumber()
    {
        int temp;
        int temp1;
        for (int i = 1; i < lottoNumbers.length; i++) 
        {
            for (int j = i; j > 0; j--) 
            {
                if (lottoNumbers[j] < lottoNumbers[j - 1]) 
                {
                    temp = lottoNumbers[j];
                    lottoNumbers[j] = lottoNumbers[j - 1];
                    lottoNumbers[j - 1] = temp;
                }
            }
        }
        for (int i = 1; i < extraNumbers.length; i++) 
        {
            for (int j = i; j > 0; j--) 
            {
                if (extraNumbers[j] < extraNumbers[j - 1]) 
                {
                    temp = extraNumbers[j];
                    extraNumbers[j] = extraNumbers[j - 1];
                    extraNumbers[j - 1] = temp;
                }
            }
        }
    }
}

