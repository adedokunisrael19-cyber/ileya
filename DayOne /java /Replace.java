import java.util.Arrays;
public class Replace{
    public static int[] replacePerfectSquare(int[] arr){
    int[] newArr = new int[arr.length];
    for (int index =0; index <arr.length; index++){
        int root =  (int) Math.sqrt(arr[index]);
        if(root * root == arr[index]){
            newArr[index] = arr[index]; 
            }else{
            newArr[index] = -1;
            }
        }
        return newArr;
    }
}
