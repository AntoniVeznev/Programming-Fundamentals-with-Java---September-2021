package Labs.L03Arrays;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1Arr = scanner.nextLine().split(" ");
        int[] num1Arr = new int[input1Arr.length];
        for (int i = 0; i < input1Arr.length; i++) {
            num1Arr[i] = Integer.parseInt(input1Arr[i]);
        }
        String[] input2Arr = scanner.nextLine().split(" ");
        int[] num2Arr = new int[input2Arr.length];
        for (int i = 0; i < input2Arr.length; i++) {
            num2Arr[i] = Integer.parseInt(input2Arr[i]);
        }
        int sum = 0;
        boolean isFound = false;
        for (int i = 0; i < input1Arr.length; i++) {
            if (num1Arr[i] == num2Arr[i]) {
                sum += num1Arr[i];
                isFound = false;
            } else {
                isFound = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (!isFound) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
