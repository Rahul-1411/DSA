public class largest {
    public static void main(String[] args) {
        int [] arr = {10,50,70,85,105};
        // We can sort the array and find the arr [n-1] then we can get the largest element but it takes O(nlogn)
        int largest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest element is : ");
        System.out.print(largest);

    }
    
}
