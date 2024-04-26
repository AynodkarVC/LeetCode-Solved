//https://leetcode.com/problems/plus-one/
package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(plusOne1(arr)));
    }

    public static int[] plusOne1(int[] digits) {
            if( digits.length == 1 && digits[0] == 9){
                digits = new int[]{1, 0};
                return digits;
            }
            else if(digits.length != 1 && digits[digits.length-1]==9){
                digits[digits.length-2] += 1;
                digits[digits.length-1] = 0;
            }
            else {
                digits[digits.length-1] += 1;
            }
        return digits;
    }
}
