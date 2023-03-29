

import java.util.Scanner;
import java.util.*;

class Day_1
{
    public static void main(String args[])
    {
        int count, max, min, i;
        int[] inputArray = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        count = sc.nextInt();

        System.out.println("Enter " + count + " elements");

        for(i =0; i<count; i++)
        {
            inputArray[i] = sc.nextInt();
        }

        max = min = inputArray[0];

        for(i = 1; i< count; i++)
        {
            if(inputArray[i] > max )
            max = inputArray[i];

            else if (inputArray[i] < min)
            min = inputArray[i];
        }
        System.out.println("Largest number " + max);
        System.out.println("smallest  number " + min);
    }
}
