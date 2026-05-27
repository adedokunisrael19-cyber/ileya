import java.util.ArrayList;
import java.util.Arrays;

public class ArraySplit{
    public static  void split(int[] arr){
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
     
    for (int num : arr){
    if(num %2 == 0) {
      even.add(num);
        }else{
        odd.add(num);
        }
    }
        System.out.println(Arrays.asList(odd,even));
    }
    public static void main(String[] args) {

        int[] arr = {45, 60, 3, 10, 9, 22};

        split(arr);
    }

}
