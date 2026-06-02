public class CeasarCipher{
    public static void main (String[] args){
        String text = "HELLO";
        int shift = 3;
        String encrypted = "";
    
        for(int index =0; index < text.length(); index++){
            char ch = text.charAt(index);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch +shift);

            if(ch >'Z'){
                ch = (char)(ch-26);
              }
            
            }
                encrypted += ch;
        } 
        System.out.println("the encrypted Text is : " +encrypted);
    }
}
