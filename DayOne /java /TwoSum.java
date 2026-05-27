import java.util.Arrays;

public class TwoSum{

    
    public static int[] getSum(int[] arr, int target){
        
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    
                return new int[]{i,j};
                }
            }
        
        }
        return new int[]{};
    }
     public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(getSum(nums, 9)));
    }


}
