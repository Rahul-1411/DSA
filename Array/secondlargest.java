public class secondlargest {
    public static void second_largest(int [] arr)
    {
        // two pass approach 
        int largest = arr[0];
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest is "+largest);
        // second largest
        int slargest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>slargest && arr[i]!=largest){
                slargest = arr[i];
            }
        }
        System.out.println("Second largest is "+slargest);
        // It takes O(n^2)
     }
     // For more optimal approach 
     public static void Slargest(int [] arr)
     {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        // It takes O(n) complexity.
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest = arr[i];
            }
        }
        System.out.println("Largest is "+largest);
         System.out.println("Second largest is "+slargest);

     }

    public static void main(String[] args) {
        int [] arr = {-1,25,85,105,4};
       // second_largest(arr);
       Slargest(arr);
    }
    
}
