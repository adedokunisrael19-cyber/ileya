import java.util.Scanner; 

public class MBTI{
    public static void main{
    Scanner input = new Scanner(System.in);
    String[] Questions = {
                "A. expend energy, enjoy groups\t\tB. conserve energy, enjoy one-on-one",
                "A. interpret literally\t\t\t\tB. look for meaning and possibilities",
                "A. logical, thinking, questioning\t\tB. empathetic,feeling,accommodating",
                "A. organized, orderly\t\t\t\tB. flexible, adaptable",
                "A. more outgoing, think out loud\t\tB. more reserved, think to yourself",

                "A. practical, realistic, experiential\tB. imaginative, innovative, theoretical",
                "A. candid, straight forward, frank\t\tB. tactful, kind, encouraging",
                "A. plan, schedule\t\t\t\tB. unplanned, spontaneous",
                "A. seek many tasks, public activities\t\tB. seek private, solitary activities",
                "A. standard, usual, conventional\t\tB. different, novel, unique",

                "A. firm, tend to criticize\t\t\tB. gentle, tend to appreciate",
                "A. regulated, structured\t\t\tB. easy-going, live and let live",
                "A. external, communicative\t\t\tB. internal, reflective",
                "A. focus on here-and-now\t\t\tB. look to the future",
                "A. tough-minded, objective\t\t\tB. tender-hearted, subjective",

                "A. preparation, plan ahead\t\t\tB. go with the flow",
                "A. active, initiate\t\t\t\tB. reflective, deliberate",
                "A. facts, things, what is\t\t\tB. ideas, dreams, what could be",
                "A. matter of fact\t\t\t\tB. sensitive, compassionate",
                "A. control, govern\t\t\t\tB. latitude, freedom"
           };

    String[] responses = new String[20];
    
    int e = 0;
    int i = 0;
    int s = 0;
    int n = 0;
    int t = 0;
    int f = 0;
    int j = 0;
    int p = 0;

    
        String answer;

    for (int index=0; index<questions.length; index++){
        System.out.println("questions" + index+1);
        System.out.println(questions[index]);
        System.out.println("Select A or B: ");
    
    answer = input.nextLine();
    
    if(answer .equals("A") || answer.equals("B")){
        break;
    }else{
        System.out.println("you typed an invalid response, please type A or B only")
    }

    responses [index] = answer;
    
    Switch(index){
        case 0,4,8,12,16: 
            if(answer.equals("A")) e++;
            else i++;
         case 1,5,9,13,17:  
              if(answer.equals("A")) s++;
            else n++;
           case 2,6,10,14,18: 
              if(answer.equals("A")) t++;
            else f++;
            case 3,7,11,15,19: 
              if(answer.equals("A")) j++;
            else p++;
             }
        }
        for (int count = 0; count<response.length; count++){
            System.out.println("======= Result =======");
            System.out.println("questions " +(count+1) + ":" + responses[count]);
        }
        
        String personalityType = "";

        if(e > i){
            personalityType += "E"; 
        }else{
              personalityType += "I"; 
        }
         if(s > n){
            personalityType += "S"; 
        }else{
              personalityType += "N"; 
        }
        if(t > f){
            personalityType += "T"; 
        }else{
              personalityType += "F"; 
        }
         if(j > p){
            personalityType += "J"; 
        }else{
              personalityType += "P"; 
        }

        System.out.println("====== Result ======");

         System.out.println("Personality type: " + personalityType);

        printPersonalityType(personalityType);
    }

    public static void  printPersonalityType(String type){
    
     switch (type) {

            case "INTJ":
                System.out.println("The Architect - Strategic and imaginative.");
                break;

            case "INTP":
                System.out.println("The Thinker - Innovative and curious.");
                break;

            case "ENTJ":
                System.out.println("The Commander - Bold and strong-willed.");
                break;

            case "ENTP":
                System.out.println("The Debater - Smart and intellectually curious.");
                break;

            case "INFJ":
                System.out.println("The Advocate - Quiet and inspiring.");
                break;

            case "INFP":
                System.out.println("The Advocate - Quiet and inspiring.");
                break;

            case "INFP":
                System.out.println("The Mediator - Poetic and kind.");
                break;

            case "ENFJ":
                System.out.println("The Protagonist - Charismatic and inspiring.");
                break;

            case "ENFP":
                System.out.println("The Campaigner - Enthusiastic and creative.");
                break;

            case "ISTJ":
                System.out.println("The Logistician - Practical and reliable.");
                break;

            case "ISFJ":
                System.out.println("The Defender - Warm and dedicated.");
                break;

            case "ESTJ":
                 System.out.println("The Executive - Organized and decisive.");
                break;

            case "ESFJ":
                System.out.println("The Consul - Caring and social.");
                break;

            case "ISTP":
                System.out.println("The Virtuoso - Bold and practical.");
                break;

            case "ISFP":
                System.out.println("The Adventurer - Flexible and charming.");
                break;

            case "ESTP":
                System.out.println("The Entrepreneur - Energetic and perceptive.");
                break;

            case "ESFP":
                System.out.println("The Entertainer - Spontaneous and enthusiastic.");
                break;

            default:
                System.out.println("Unable to determine personality type.");
        }

    }
}
