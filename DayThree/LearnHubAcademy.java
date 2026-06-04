//import java.util.Scanner; 
//public class LearnHubAcademy{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of Student: ");
//        int students = input.nextInt();
//        System.out.println("Enter the number of Quiz taken: ");
//        int scores = input.nextInt();
//
//        int[][] StudentOne = new int[students][scores];
//       
//        for (int i =0; i<students; i++){
//            System.out.print()
//            for(int j=0; j<scores; j++){
//                if(score >= 0 && score <=0){
//                StudentOne[i][j] =input.nextInt();;
//                }else{
//                    System.out.println("invalid input");
//                }
//            }
//        }
//
//        for(int i = 0; i<students; i++){
//            System.out.print("Student" + (i+1));
//        for(int j = 0; j< scores; j++){
//            System.out.print(" " +  students [i][j]);
//            }
//        }
//    }
//}















import java.util.Arrays;
import java.util.Scanner; 
public class LearnHubAcademy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Student: ");
        int students = input.nextInt();

        System.out.println("Enter the number of Quiz taken: ");
        int score = input.nextInt();

        int[][] StudentRecord = new int[students][score];
       
        for (int i =0; i<students; i++){
            System.out.println("--- Student " + (i + 1) + " ---");
            for(int j=0; j<score; j++){
                while (true){
        System.out.println("Enter the student Score: ");
        int scores = input.nextInt();
                if(scores >= 0 || scores <=100){
                StudentRecord[i][j] =input.nextInt(); break;
             
                }
            }
        }
    }
     for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < score; j++) {
                System.out.print( StudentRecord[i][j] + " ");
            }
    }
}
}



public class LearnHubAcademy{
    public static int getStudent(int score){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of Student: ");
    int students = input.nextInt();

    }

}
