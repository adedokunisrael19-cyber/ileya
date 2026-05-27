import java.util.Arrays;

public class MergeArray{
    public static int[] mergeSort(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        
        int index = 0;
    for(int num : arr1){
       merged[index++] = num;
        }

        for(int num : arr2){
       merged[index++] = num;
        }
    
        for(int i =0; i<merged.length; i++){
            for(int j= i+1; j<merged.length; j++){
            if(merged[i] > merged[j]){
                int temp = merged[i];
                merged[i] = merged[j];
                merged[j] = temp;

                }
            }
       }    
    return merged;
    }

}
