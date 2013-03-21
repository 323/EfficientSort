import java.util.*;

class EfficientSort
{
    public static void main(String[] args)
    {
        //Print title and stuff
        System.out.println("This is EfficientSort, made by 323.");
        //Initialize Random Num Gen
        Random rgen = new Random();
        //Initialize array
        int[] numbers = new int[11];
        //Populate array with 0-10
        for (int i=0; i<numbers.length; i++) 
        {
            numbers[i] = i;
        }
        //Print original array before randomization
        System.out.println("Original array:");
        for (int z=0; z<numbers.length; z++) 
        {
            System.out.print(numbers[z] + ", ");
        }
        //Start new line for next row of numbers
        System.out.println("");
        //Randomize array
        for (int x=0; x<numbers.length; x++) 
        {
            int randomPosition = rgen.nextInt(numbers.length);
            int temp = numbers[x];
            numbers[x] = numbers[randomPosition];
            numbers[randomPosition] = temp;
        }
        //Print array after randomization
        System.out.println("Randomized Array:");
        for (int y=0; y<numbers.length; y++) 
        {
            System.out.print(numbers[y] + ", ");
        }
        //Print starting message
        System.out.println("");
        System.out.println("Beginning sorting algorithm...");
        //Check if the numbers are in the right order
        int r = 0;
        int num = 1;
        while (r == 0) //r only = 1 when entire set is sorted
        {
            while (num<numbers.length)
            {
                if (numbers[0] < numbers[num])
                {
                    num++;
                }
                else
                {
                    //Randomize array
                    for (int x=0; x<numbers.length; x++) 
                    {
                        int randomPosition = rgen.nextInt(numbers.length);
                        int temp = numbers[x];
                        numbers[x] = numbers[randomPosition];
                        numbers[randomPosition] = temp;
                    }
                    for (int z=0; z<numbers.length; z++) 
                    {
                        System.out.print(numbers[z] + ", ");
                    }
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println("Sorted First Number!");
            System.out.println("Current Semi-Sorted Array:");
            for (int z=0; z<numbers.length; z++) 
            {
                System.out.print(numbers[z] + ", ");
            }
            //Moving on to second number
            num = 1; //Reset the value of num
            while (num<numbers.length)
            {
                if (numbers[1] < numbers[num])
                {
                    num++;
                }
                else
                {
                    //Randomize array
                    for (int x=0; x<numbers.length; x++) 
                    {
                        int randomPosition = rgen.nextInt(numbers.length);
                        int temp = numbers[x];
                        numbers[x] = numbers[randomPosition];
                        numbers[randomPosition] = temp;
                    }
                    for (int z=0; z<numbers.length; z++) 
                    {
                        System.out.print(numbers[z] + ", ");
                    }
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println("Sorted Second Number!");
            System.out.println("Current Semi-Sorted Array:");
            for (int z=0; z<numbers.length; z++) 
            {
                System.out.print(numbers[z] + ", ");
            }
            r = 1;
        }
    }
}