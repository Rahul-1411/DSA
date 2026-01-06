public class Arraysorted {
    public static boolean IsSorted(int [] arr){
        // check in O(n)
        for (int i = 1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1]){
                // do nothing

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {1,7,4,5,6};
        System.out.println(IsSorted(arr));
        System.out.println(IsSorted(arr2));
    }
    
}
