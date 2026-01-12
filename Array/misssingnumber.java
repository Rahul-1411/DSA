public class misssingnumber {
    public static int brute_missing(int [] arr)
    {
        // Time Complexity -> O(n^2)
        // Space Complexity -> O(1)
        for(int i = 1;i<=arr.length;i++)
        {
            int flag = 0;
            for(int j = 0;j<arr.length-1;j++)
            {
                if(arr[j]==i)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }
    public static int better_missing(int [] arr)
    {
        // Time complexity : O(n) + O(n)
        // space complexity : O(n) // for hash array
        int n = arr.length;
        int[] hash = new int[n + 1];
        for(int i = 0; i<n-1;i++)
        {
            hash[arr[i]]=1;
        }
        for(int i = 1 ;i<=n;i++)
        {
            if(hash[i]==0) 
                return i;

        }
        return -1;
    }
    public static int optimal_missing(int [] arr)
    {
        // Time complexity : O(n)
        // Space Complexity -> O(1)

        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i =0;i<arr.length;i++)
        {
            sum2+=arr[i];
        }
        return (sum-sum2);
    }
    public static int xor_missing(int [] arr)
    {
        // Time Complexity : O(n)
        // Space Complexity -> O(1)
        int xor1 = 0;
        int xor2 = 0;
        int n = arr.length;
        for(int i =0;i<arr.length-1;i++)
        {
            xor2 = xor2 ^arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^n;
        return (xor1 ^ xor2);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
   //   int res =   brute_missing(arr);
    //  int res2 = better_missing(arr);
     //   int res3 = optimal_missing(arr);
     int result = xor_missing(arr);
      System.out.println(result); // 3


    }
    
}
