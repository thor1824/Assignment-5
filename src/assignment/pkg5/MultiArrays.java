/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author thor1
 */
public class MultiArrays 
{
    int[][] down;
    public MultiArrays(int rows, int pillars)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        down = new int[rows][pillars];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < pillars; j++) 
            {
                down[i][j] = (i + 1) * (j + 1);  
            }
            
        }
    }
    public void printArrays()
    {
        for (int[] row : down) 
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
