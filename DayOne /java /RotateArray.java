java util.Arrays;

public class RotateArray{
    public static int[] rotate(int[] arr, int k){
        int = arr.length;

        k = k % n;

        int[] result = new int[n];

        for(int i = 0; i<n; i++){
    
        result[(i+k)%n] = arr[i];     

        }

        return result;
    }
    
    public static void main(String[] args) {

        int[] arr = {1, -9, 3, 0, 8};

        System.out.println(Arrays.toString(rotate(arr, 2)));
    }
}
