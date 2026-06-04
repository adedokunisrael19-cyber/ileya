import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BookSuggestionSystem{

    private static ArrayList<String> books=  new ArrayList<>();   
    private static Scanner input = new Scanner(System.in);
    

     public static void main(String[] args){
       //Scanner scanner = new Scanner(System.in);


        books.add("the habbit");
        books.add("the habbit");
        books.add("the habbit");
        books.add("Rich Dad Poor Dad");

        displayMenu();
        System.out.print("Enter aan operation");
        int option ;
        option = Integer.parseInt(input.nextLine());
        switch(option) {
            case 1: suggestBooks(); break;
            case 2: addBooks(); break;
            case 3: removeBook(); break;
            case 4: updateBook(); break;
            case 5: showBooks(); break;
            default: System.out.print("invalid input");
        }
    
    }


    public static void displayMenu(){
    System.out.print("""
        Welcome to the Book Suggestion System!
                1. Get Suggestions
                2. Add Book
                3. Remove Book
                4. Update book
                5. Show all books
                Enter an operation:
                                    """);
    }

    public static void suggestBooks(){
         Random random = new Random();
             String Choice ;
    
         do{
            int randomIndex = random.nextInt(books.size());
            int randomPage =  random.nextInt(100) +1;

            System.out.println("Book for the day");
            System.out.println("Title: "+  books.get(randomIndex));
            System.out.print("Page: " + randomPage );
            
            System.out.print("would you like another suggestion(Yes/No)");
                        
             Choice = input.nextLine();     
            }while (Choice.equalsIgnoreCase("yes"));
        
    }
    
    public static void addBooks(){
        System.out.print("Enter the title of the book");
        String title = input.nextLine();

        if(!books.contains(title)){
            books.add(title);
             System.out.print("Added successfully");
         }else{
               System.out.print("book already exist");
         }  

    }

    public static void removeBook(){
      System.out.print("Enter the title of the book");
      String title = input.nextLine();

        if(books.contains(title)){
            books.remove(title);
             System.out.print("removed successfully");
         }else{
               System.out.print("book not found");
         }  
    }

    public static void updateBook(){
        System.out.print("Enter the old title of the book");
        String oldTitle = input.nextLine();

        if(books.contains(oldTitle)){
            System.out.print("Enter a new title");
            String newTitle = input.nextLine();
            books.add(newTitle);
             System.out.print("updated successfully");
         }else{
               System.out.print("book not found");
         }  
    }
        
    public static void showBooks(){
        for(int index =0; index<books.size(); index++){
         System.out.print((index +1)+ "." + books.get(index));
        }
    
    }






























}
