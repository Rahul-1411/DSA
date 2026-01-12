public class numberappears {
    public static int brute_appear(int [] arr)
    {
        // Time Complexity : O(n^2) kind of linear searching.
        // Space Complexity : O(1)
        for(int i = 0;i<arr.length;i++)
        {
            int num = arr[i];
            int count = 0;
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[j] == num) count++;
            }
            if(count == 1) return num;
        }
        return - 1;

    }
    public static int optimal_appear(int [] arr)
    {
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        int xor = 0;
        for(int i = 0 ; i<arr.length;i++)
        {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,5,3,3,4,4};
   //   int res =   brute_appear(arr);
        int result = optimal_appear(arr);
      System.out.println(result);

    }
    
}
