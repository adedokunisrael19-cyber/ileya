const prompt = require("prompt-sync")();
let questions = [
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
           ];

    let responses = new Array(20);
    
    let e = 0;
    let i = 0;
    let s = 0;
    let n = 0;
    let t = 0;
    let f = 0;
    let j = 0;
    let p = 0;

    
        let answer = "";
    

    for (let index=0; index<questions.length; index++){

    while (true){
        console.log("questions" + (index+1));
        console.log(questions[index]);
        console.log("Select A or B: ");
    
    answer = prompt();
    
    if(answer ===("A") || answer===("B")){
        break;
    }else{
        console.log("you typed an invalid response, please type A or B only");
    }
    }

    responses [index] = answer;
    
    switch(index){
         case 0:
        case 4:
        case 8:
        case 12:
        case 16:
            if(answer===("A")) e++;
            else i++;
            break;
        
        case 1:
        case 5:
        case 9:
        case 13:
        case 17:  
              if(answer===("A")) s++;
            else n++;
            break;
            case 2:
    case 6:
    case 10:
    case 14:
    case 18: 
              if(answer===("A")) t++;
            else f++;
            break;
            case 3:
    case 7:
    case 11:
    case 15:
    case 19:
              if(answer===("A")) j++;
            else p++;
            break;
             }
        }
        for (int count = 0; count<responses.length; count++){
            console.log("======= Result =======");
            console.log("questions " +(count+1) + ":" + responses[count]);
        }
        
        const personalityType = "";

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

        console.log("====== Result ======");

         console.log("Personality type: " + personalityType);

        printPersonalityType(personalityType);
    }

    function printPersonalityType(type){
    
     switch (type) {

            case "INTJ":
                console.log("The Architect - Strategic and imaginative.");
                break;

            case "INTP":
                console.log("The Thinker - Innovative and curious.");
                break;

            case "ENTJ":
                console.log("The Commander - Bold and strong-willed.");
                break;

            case "ENTP":
                console.log("The Debater - Smart and intellectually curious.");
                break;

            case "INFJ":
                console.log("The Advocate - Quiet and inspiring.");
                break;

            case "INFP":
                console.log("The Mediator - Poetic and kind.");
                break;

            case "ENFJ":
                console.log("The Protagonist - Charismatic and inspiring.");
                break;

            case "ENFP":
                console.log("The Campaigner - Enthusiastic and creative.");
                break;

            case "ISTJ":
                console.log("The Logistician - Practical and reliable.");
                break;

            case "ISFJ":
                console.log("The Defender - Warm and dedicated.");
                break;

            case "ESTJ":
                 console.log("The Executive - Organized and decisive.");
                break;

            case "ESFJ":
                console.log("The Consul - Caring and social.");
                break;

            case "ISTP":
                console.log("The Virtuoso - Bold and practical.");
                break;

            case "ISFP":
                console.log("The Adventurer - Flexible and charming.");
                break;

            case "ESTP":
                console.log("The Entrepreneur - Energetic and perceptive.");
                break;

            case "ESFP":
                console.log("The Entertainer - Spontaneous and enthusiastic.");
                break;

            default:
                console.log("Unable to determine personality type.");
        }

    }
}
