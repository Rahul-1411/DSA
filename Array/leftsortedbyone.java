public class leftsortedbyone {
    public static void leftrotate_one(int [] arr)
    {
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            arr[i-1] = arr [i];
        }
        arr[(arr.length)-1] = temp;
    }
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5};
        // Before rotating how the output looks like 
        System.out.print("Before Rotating: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        leftrotate_one(arr);
        // for better output screening
        System.out.println();
        // After rotating how the output looks like.
        System.out.print("After rotating : ");
          for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }

    }
    
}
