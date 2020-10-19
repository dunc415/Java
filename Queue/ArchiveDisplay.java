/**
 * This print out the remaining questions
 * @author Duncan Campbell 3603844
 */
import java.io.*;

public class ArchiveDisplay {

    public static void main(String[] args){

        try{
            FileInputStream FOS = new FileInputStream("RemainingQuestions.out");
            ObjectInputStream objInputStream = new ObjectInputStream(FOS);
            System.out.println(objInputStream.readObject());
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}