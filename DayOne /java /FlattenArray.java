import java.util.Arrays;

public class FlattenArray{
    public static int[] joinarrays(int[][] arr){
    int rows = arr.length
    int col = arr[0].length;
    int index =0;


    int newArr = new int[rows*col];
    for(int i = 0; i< rows; i++){
        for(int j = 0; j<col; j++){
        newArr[index] = arr[i][j];
        index++;
        }

    }

    return newArr;
    }

}
