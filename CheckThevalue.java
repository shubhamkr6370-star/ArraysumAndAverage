package basics;


import java.util.Scanner;

public class CheckThevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Value of Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the Target elemnet: ");
        int k = sc.nextInt();
        boolean found = false;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == k) {
                found = true;
                break;
            }
        }
            if(found){
                System.out.println("Target element is persent in the array");
            }else{
                System.out.println("Target element is not in the array");
            }


    }
}
