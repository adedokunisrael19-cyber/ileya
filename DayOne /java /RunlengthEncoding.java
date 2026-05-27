public class RunlengthEncoding{
    public static String encode(String text){
    
    String result = "";

    int count = 1; 

    for(int i=0; i < text.length(); i++){
        if(i<text.length()-1 && text.charAt(i) == text.charAt(i + 1)){
            count++;

        }else{
            result += text.charAt(i);

            if(count >1){
                result += count; 

            }
            count = 1;
        }
    }
return result;

}

}
