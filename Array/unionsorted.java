public class unionsorted {
    public static void union_(int [] arr1, int [] arr2, int [] res){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int j = 0;
        int i = 0;
        int k = 0; // for index position
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j])
            {
                if(k==0 || res[k-1]!=arr1[i]){
                    res[k++] = arr1[i];
                }
                i++;
            }
            else 
            {
                if(k==0 || res[k-1]!=arr2[j]){
                    res[k++] = arr2[j];
                }
                j++;

            }
        }
        while(j<n2){
             if(k==0 || res[k-1]!=arr2[j]){
                    res[k++] = arr2[j];
                }
                j++;

        }
        while(i<n1)
        {
            if(k==0 || res[k-1]!=arr1[i]){
                    res[k++] = arr1[i];
                }
                i++;
        }
        System.out.println("After Union : ");
        for(int q = 0;q<k;q++)
        {
            System.out.print(res[q] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};
        int [] res = new int [arr1.length + arr2.length];
        // Here we have taken the sorted array if sorted form is not there we can sort at first at a O(nlogn)
         union_(arr1,arr2,res);
        
    }
    
}
