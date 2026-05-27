import java.util.ArrayList;

public class Duplicates {
    
    public static ArrayList<Integer> getDuplicates(int[] arr){
        ArrayList<Integer>  duplicates = new ArrayList<>();

        for(int index= 0; index<arr.length; index++){
            for (int j = 0; j<arr.length;j++){
                if(arr[index] == arr[j] && !duplicates.contains(arr[index])){
                    duplicates.add(arr[index]);
                    break;
                }
            }        
            
        }
            return duplicates;

    }

}
