public class Insertionsorted {
    public static void inter_section(int [] arr1 , int [] arr2 , int [] res)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int j = 0;
        int i = 0;
        int k = 0; // for index position
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j]) i++;
            else if(arr2[j]<arr1[i]) j++;
            else{
                // for leetcode 169 : intersection check for duplicate just like intersection
                // for leetcode 350 : Duplicate is allowed only their corresponding element is there.
                // they are same
                res[k++] = arr1[i];
                i++;
                j++;
            }
        }
        System.out.println("After intersection : ");
        for(int q = 0 ;q<k;q++)
        {
            System.out.print(res[q]+" ");
        }

    }
    public static void main(String[] args) {
         int [] arr1 = {1,2,2,3,3,4,5,6};
        int [] arr2 = {2,3,3,5,6,6,7};
        int [] res = new int [Math.min(arr1.length, arr2.length)];
        // Here we have taken the sorted array if sorted form is not there we can sort at first at a O(nlogn)
         inter_section(arr1,arr2,res);
    }
    
}
