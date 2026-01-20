package basics;

import java.util.Scanner;

public class ArraysumandAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum=0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of array[" + i + "]: ");
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }

        System.out.println("\nValues in the array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of arrayelement:" + sum);
        double avg = (double)sum/arr.length;
        System.out.println("Average of arrayelement:"+ avg);


        sc.close();

    }
}
