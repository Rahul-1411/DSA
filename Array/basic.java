import java.util.Scanner;
class basic {
    public static void main(String[] args) {
        // manually input int [] arr = { 10,20,30,40,50}
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements : ");
        for (int i = 0;i<n;i++)
        {
            arr [i] = sc.nextInt();
        }
        // display the elements 
        System.out.println("The elements are : ");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
