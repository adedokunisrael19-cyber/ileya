public class CeasarCipher{

    public static String getEncryption(String word, int shift){

        word = "HELLO";
        shift = 3;
        String encrypted = "";
    
        for(int index =0; index < word.length(); index++){
            char ch = word.charAt(index);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch +shift);

            if(ch >'Z'){
                ch = (char)(ch-26);
              }
            
            }
                encrypted += ch;
        } 
        return encrypted;
    }
}
