package TwoArrayHomework;

public class SecondLargestNumber {
    public static void main(String[] args) {

        // 9. Write a java program to find the second-largest number in the array?

        int[] num = {2, 1, 100, 14, 11, 21};

        int max = num[0];
        int secondLargest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] > secondLargest && num[i] < max) {
                secondLargest = num[i];
            }
        }


        System.out.println("The second max number in the array is " + secondLargest);

    }
}

