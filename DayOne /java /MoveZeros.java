public class MoveZeros{ 
    public static int[] moveTheZeros(int[] arr){
    int[] newArr = new int[arr.length];
       int index =0;

       for(int num : arr){
        if(num != 0){
            newArr [index++] = num;
            }
        } 
    return newArr;
}
