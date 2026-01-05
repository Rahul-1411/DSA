public class Smallest {
    public static void main(String[] args) {
        int [] arr = {-2,-4,0,25,27};
       
        int smallest  = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element is : ");
        System.out.print(smallest);
    }
    
}
