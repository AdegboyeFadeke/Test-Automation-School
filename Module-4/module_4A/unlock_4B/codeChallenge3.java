package module_4A.unlock_4B;

import java.lang.reflect.Array;
import java.util.Arrays;

public class codeChallenge3 {
    //Find two numbers of which the product is maximum in an array

    static void maxProduct(int arr[], int n){
        // sort out the array
        Arrays.sort(arr);
        int num1, num2;

        //calculate product of the smallest number
        int smallest = arr[0] * arr[1];

        // calculate the product of the two largest number
        int largest = arr[n-1] * arr[n-2];

        // print the pairs whose product is greater
        if(smallest > largest){
            num1 = arr[0];
            num2 = arr[1];
        } else {
            num1 = arr[n-2];
            num2 = arr[n-1];
        }
        System.out.println("Max product pair = " + "{" + num1 + "," + num2 + "}");
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 8, 9, 5, 7, 5, 0};
        int n = arr.length;
        maxProduct(arr, n);
    }
}
