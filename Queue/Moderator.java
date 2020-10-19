/**
 * This is the driver for the queues. The users can pick from multiple options
 * @author Duncan Campbell 3603844
 */
import java.util.Scanner;
import java.io.*;

public class Moderator {
    public static void main(String[] args){

        try{
        File output = new File("RemainingQuestions.out");
        FileOutputStream FOS = new FileOutputStream(output);
        ObjectOutputStream objOutStream = new ObjectOutputStream(FOS);
   
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        System.out.println("No submitted questions pending.");
        QuestionQueue1 queue = new QuestionQueue1();


        while(!quit){
            System.out.println("Moderator options: ");
            System.out.println("N = Add a new question.");
            System.out.println("A = Ask current question");
            System.out.println("P = Pass on current question");
            System.out.println("Q = Quit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();
          
          try{
            if(choice.equals("N")){
                System.out.println("Enter question: ");
                String newQuestion = sc.nextLine();
                System.out.println("Submitted By: ");
                String submitter = sc.nextLine();
                Question question = new Question(newQuestion, submitter);
                queue.enqueue(question);
                System.out.println("Current question: " + queue.peek());

            }else if(choice.equals("A")){
                System.out.println("Current question: " + queue.peek());

            }else if(choice.equals("P")){
                //queue.dequeue();
                System.out.println(queue.dequeue());

            }else if(choice.equals("Q")){
                quit = true;
                objOutStream.writeObject(queue);
            }
          }catch(ListIsEmptyException e){
            System.out.println(e.getMessage());
          }
        }
      }catch(FileNotFoundException e){
        System.out.println(e.getMessage());
      }catch(IOException e){
        System.out.println(e.getMessage());
      }
    }
}