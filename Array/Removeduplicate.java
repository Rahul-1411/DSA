public class Removeduplicate {
    public static int RemoveDup(int [] arr){
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j]!=arr[i])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4,5,5};
        int count = RemoveDup(arr);
        System.out.println(count);
        System.out.println("The elements are : ");
        for (int i = 0; i<count;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
