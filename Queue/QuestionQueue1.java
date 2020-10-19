/**
 * This program is the queue of questions that are going to be asked
 * @author Duncan Campbell 3603844
 */
import java.util.LinkedList;
import java.io.Serializable;

public class QuestionQueue1 implements Serializable{
   /**
    * The queue
    */
   private LinkedList<Question> list;

    public QuestionQueue1(){
        list = new LinkedList<Question>();

    }
    /**
     * This adds an item to the queue
     * @param item The question that wants to be asked
     */
    public void enqueue(Question questionIn){
        list.addLast(questionIn);
    }
    /**
     * This method checks if the list is empty or not
     */
    public boolean empty(){
       boolean isEmpty = false;

        if(list.size() == 0){
            isEmpty = true;
        }
        return isEmpty;
    }
    /**
     * This method remove and returns the question from the head
     * @return Question the result
     */
    public Question dequeue() throws ListIsEmptyException{
       list.removeFirst();
       Question temp = list.getFirst(); 
       return temp;
    }
    /**
     * This method gets information about the question at the front of the list
     * @return
     */
    public Question peek() throws ListIsEmptyException{
        Question temp = list.peek();
        return temp;
    }
    
    /**
     * This method is the toString / Prints out the information in the list
     * @return String The toString
     */
    public String toString(){
        String str = "";
        int i = 1;

        for(Question temp : list){
            str += i + ". " + temp.toString() + "\n";
            i++;
        }
        return str;
    }

}



