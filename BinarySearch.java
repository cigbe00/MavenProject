/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;

/**
 *
 * @author cigbe
 */
public class BinarySearch {
    
    
    
    public int search(int key,int data[])
    {
        int low=0;
        int highest = data.length-1;
        int middle = (low+highest+1)/2;
        int location=-1;
        do{
            
            if(key==data[middle])
            {
                location=middle;
            }
            else if(key<data[middle-1])
            {
                highest=middle-1;
            }
            else
            {
                low=middle+1;
            }
           
            middle=(low+highest)/2;
        }while((low<=highest)&& (location==-1));
        
        return location;
    }
    
    public static void main(String []a)
    {
        BinarySearch sort = new BinarySearch();
        int[]data={2,7,9,52,4,53,89,16,23};
        Arrays.sort(data);
        
        for (int x:data)
        {
            
            
            
            System.out.print(x);
            System.out.print(" , ");
            
        }
        System.out.println("   ");
        int loc = sort.search(7, data);
        
        System.out.println("the key value "+89+" is located at position "+loc);
        
    }
    
}
