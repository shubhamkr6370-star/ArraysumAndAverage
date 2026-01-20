package basics;

import java.util.Scanner;

public class EvenAndOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value of array"+i+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int EvenCount =0;
        int oddCount =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                EvenCount +=1;
            }else{
                oddCount +=1;
            }
        }
        System.out.println("Even count:"+EvenCount);
        System.out.println("odd count :"+oddCount);



    }
}
