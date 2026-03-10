package se.lexicon;

import java.util.Arrays;

public class ArraysDemo {

    static void main() {
        //Declaration of arrays
        int[] numbers;
        String names;

        //Initialization of arrays
        numbers = new int[3];// [0, 0, 0]

        //Declaration and initialization of String array
        String[] stringArr = new String[3]; //[null, null, null]

        int[] numbersArr = new int[]{2, 4, 6, 8};
        int[] numbersArrShort = {2, 4, 6, 8};

        ex1();
        ex2();
        ex3();
        numbers = new int[]{12, 66, 25, 34};
        int maxNumber = ex4(numbers);
        IO.println("Maximum number : "+ maxNumber);
        ex5();
        ex6();
    }

    static void ex1(){
        String[] names = new String[3];
        IO.println(names.length);
        names[0] = "John";
        names[names.length - 1] = "Jane";
        IO.println(names[0]);
        IO.println(names[1]);
        IO.println(names[2]);
    }

    static void ex2(){
        int[] numbers = {5, 2, 3, 4, 7};

        //Traditional for loop : Use to Read and modify array
        //Iterate through array
        for(int i = 0; i < numbers.length; i++){
            //If array index = 2
            if(i == 2){
                numbers[i] = 200;
            }
            IO.println("Value Stored in numbers["+i+"] Index="+numbers[i]);
        }

        //Enhanced 'for' loop : Use for Reading data (not for modifying original arrays)
        for(int number : numbers){
            if (number == 5) number = 5000; //This won't work
            IO.println(number);
        }
    }

    static void ex3(){
        int[] originalArray = {2, 5, 8, 1, 9};
        IO.println("Original Array");
        for (int i : originalArray){
            IO.println(i +" ");
        }

        //Expand an array
        IO.println("New expended Array");
        int[]  newArray = new int[originalArray.length + 1];
        //Copy Original Array to newArray
        //for (int i=0; i < originalArray.length; i++){
        //    newArray[i] = originalArray[i];
        //}

        //Copy Original Array to newArray
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        newArray[newArray.length-1] = 12;

        for(int value : newArray){
            IO.println(value);
        }
    }

    //This method will take input array of int and return max number
    static int ex4(int[] numbers){
        int maxNumber = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    //This method will use Utility Methods : sort
    static void ex5() {
        //Array.sort()
        String[] names = {"Simon", "Eric", "ulf", "Fedrik", "Jonas", "Kent", "Marcus", "Martina"};
        IO.println("Original Array :" + Arrays.toString(names));

        Arrays.sort(names);
        IO.println("Sorted Array :" + Arrays.toString(names));
    }

    //This method will use Utility Methods : copyOf
    static void ex6() {
        int[] numbers = {2, 4, 6, 8};

        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1);
        newArray[newArray.length - 1] = 50;
        IO.println(Arrays.toString(newArray));
    }
}
