package day15multidimensionalarrays;

import java.util.Arrays;

public class MdRPT {
    public static void main(String[] args) {

        //How to create multidimensional array
        String [][] stdNames = new String[3][2];

        //Arrays.toString(a) is to print one dimensional arrays
        //Arrays.deepToString(a) is to print multidimensional arrays
        System.out.println(Arrays.deepToString(stdNames));


        //How to add elements into a multidimensional array
        stdNames[0][0]="asad";
        stdNames[0][1]="ahmad";
        stdNames[1][0]="mehmed";
        stdNames[1][1]="akif";
        stdNames[2][0]="ali";
        stdNames[2][1]="tuba";
        System.out.println(Arrays.deepToString(stdNames));
        //How to create a multidimensional array in short way
        int [][] numbers = {{4},{7,6},{3,8,9},{9,3,5}};

        //Example 1: Create a multidimensional array and find the sum of all elements in the multidimensional array
        //int [][] numbers = {{4},{7,6},{3,8,9},{9,3,5}};
        int sum = 0;
        for (int[] w:numbers){
            for (int r:w){
                sum = sum + r;
            }
        }
        System.out.println("sum = " + sum);

        //Example 2: Type code to find the total number of elements in a multidimensional array
        //int [][] numbers = {{4},{7,6},{3,8,9},{9,3,5}};
        int totalElementNumbers = 0;
        for (int[] w:numbers){
            totalElementNumbers = totalElementNumbers +w.length;
        }
        System.out.println("totalElementNumbers = " + totalElementNumbers);

        //Example 1: Convert a multidimensional array to a one dimensional array
        //           { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
        String [][] oldArray = { {"learn", "java", "it"}, {"is", "easy"} };
        int numberOfElements = 0;


        for (String[] w: oldArray){
            numberOfElements = numberOfElements +w.length;
        }
        int indx = 0;
        String [] newArray = new String[numberOfElements];
        for (String[] w: oldArray){
            for (String r:w){
                newArray[indx]=r;
                indx++;
            }
        }
        System.out.println(Arrays.toString(newArray));


        //Example 1: Type code to find the sum of the maximum and minimum values in a multidimensional array
        //           { {5, 0}, {-2, 14}, {65, -12, 23} } ==> -12 + 65 = 53

        //1. way
        int [][] nums = { {5, 0}, {-2, 14}, {65, -12, 23} };
        int min = nums[0][0];
        int max = nums[0][0];
        for (int[] w:nums){
            for (int r:w){
                if (r<min){
                    min=r;
                }
            }
        }
        for (int[] w:nums){
            for (int r:w){
                if (r>max){
                    max=r;
                }
            }
        }
        System.out.println(max+min);

        //2.way
        //int [][] nums = { {5, 0}, {-2, 14}, {65, -12, 23} };
        int maxV = nums [0][0];
        int minV = nums [0][0];
        for (int[] w:nums){
            for(int r:w){

                maxV = Math.max(r, maxV);
                minV = Math.min(r, minV);
            }
        }
        System.out.println(maxV+minV);




    }
}
