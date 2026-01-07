public class leftsortedbykplaces {
    public static void leftsorted_k(int [] arr , int k){
        // take the first d element in a separate array
        int n = arr.length;
         k = k%n;
        int [] temp = new int[k];
        for(int i =0; i<k;i++)
        {
            temp [i] = arr[i];

        }
        // shift From dth index
        for(int i = k;i<n;i++)
        {
            arr[i-k] = arr[i];
        }
        // put back the element from dth index to nth index
        for(int i = n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }
    public static void main(String[] args) {
         int [] arr =  {1,2,3,4,5,6,7};
         int k = 3;
         leftsorted_k(arr,k);
         System.out.print("After rotating : ");
          for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
         int [] arr2 =  {1,2,3,4,5,6,7};
         k = 10;
         leftsorted_k(arr2,k);
           System.out.println();
         System.out.print("After rotating : ");
          for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }

    }
    
}
