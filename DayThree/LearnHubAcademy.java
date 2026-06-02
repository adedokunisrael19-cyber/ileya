public class LearnHubAcademy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Student: ");
        int students = input.nextInt();
        System.out.println("Enter the number of Quiz taken: ");
        int scores = input.nextInt();

        int[][] StudentOne = new int[students][scores];
       
        for (int index =0; index<student.length; index++){
        
            for(int count=0; count<students[scores]; count++){
                 int score;
                if(score >= 0 && score <=0){
                     System.out.println("Enter the number of Quiz taken: ");
                     score = input.nextInt();
                student[index][count] = score;
                }else{
                    System.out.println("invnalid input");
                }
            }
        }

        for(int i = 0; i<students; i++){
            System.out.print("Student" + (i+1));
        for(int j = 0; j< scores.length; j++){
            System.out.print(" " +  students [i][j]);
            }
        }
    }
}
