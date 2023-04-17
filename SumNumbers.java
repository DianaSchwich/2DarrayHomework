package TwoArrayHomework;
//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
public class SumNumbers {
    public static void main(String[] args) {

        int[][]numbers= {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum=0;

             for (int row=0; row<numbers.length; row++) {
                 for (int columns = 0; columns < numbers[row].length; columns++) {
                     sum += numbers[row][columns];
                 }
             }
        System.out.println("Sum = " + sum + " ");
}}
