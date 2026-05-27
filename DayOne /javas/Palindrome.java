public class Palindrome{
    public static boolean isPalindrome(int[] arr){
  
        int n = arr.length;
     
    for (int index = 0; index<n/2; index++){
        if (arr[index] != arr[n-1-index]){
            
            return false;
            }
        
        }
        return true; 

   
    }
}
