package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = 0; i < inputArray.length; i++)
            output += "\n" + inputArray[i];

        return output;
    }

    public String lastElement(String[] inputArray) {
        String output = "*** Output ***\n" + inputArray[inputArray.length - 1];
        return output;
    }


//    TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {
        String output = "*** Output ***\n" + inputArray[inputArray.length - 2];
        return output;


    }

    //   TODO Define the method reverse
    public String reverse(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = inputArray.length - 1; i >= 0; i--)
            output += "\n" + inputArray[i];

        return output;

    }

    //  TODO Define the method isPalindrome
    public boolean isPalindromic(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = 0; i < inputArray.length / 2; i++) {
            if (inputArray[i] != inputArray[inputArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    //TODO Define the method compress
    public String compress(int[] inputArray) {
        String output = "*** Output ***";
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 || inputArray[i] != inputArray[i - 1]) {
                output += String.format("\n" + inputArray[i]);
            }
        } return output;
    }
    //  TODO Define the method pack

    public String pack(char[] inputArray){
        String output = "*** Output ***\n";
        for(int i =0; i<inputArray.length; i++) {
            if (i != 0 && inputArray[i] != inputArray[i - 1]) {
                output += ", ";
            }
            output += inputArray[i];
        }
         return output;
        }

    }











