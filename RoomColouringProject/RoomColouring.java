/**
 * This program colours the floor of a room 
 * @author Duncan Campbell 3603844
 */
import java.util.Scanner;

 public class RoomColouring{

    public static void main(String[] args){

       
        char colourIn = ' ';
        String line = " ";
        int rw = 0;
        int cl = 0;
        boolean done = false;
        char color = ' ';

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        char[][] tempArray = new char[row][col];

        // Creates the array for the room
        for(int r = 0; r < row; r++){
             line = sc.nextLine();
        
           for(int pos = 0; pos < col; pos++){
             tempArray[r][pos] = line.charAt(pos);
            }
        }
        System.out.println("\n");
        //Finds the colour to paint the floor
        for(int r = 0; r < tempArray.length; r++){
            for(int c = 0; c < tempArray[0].length; c++){
                if(tempArray[r][c] != '0' && tempArray[r][c] != '1'){
                    color = tempArray[r][c];
                    rw = r;
                    cl = c;
                    colour(tempArray, rw, cl, color);

                }
            
            }
        }
        //Prints the array
        for(int r = 0; r < tempArray.length; r++){
            for(int c = 0; c < tempArray[0].length; c++){
                System.out.print(tempArray[r][c]);
            }
            System.out.println("\n");
        }
    }

    /**
     * This method paints all the 0 in the array
     * @param tempArray The array of the room
     * @param r The rows
     * @param c The columns
     * @param colourr The colour to paint the floor
     */
    public static void colour(char[][] tempArray, int r, int c, char colourIn) {

        
                  if(r+1 <= tempArray.length - 1){
                    if(tempArray[r+1][c] == '0'){
                        tempArray[r+1][c] = colourIn;
                        colour(tempArray, r + 1, c, colourIn);
                    }
                  }
                  if(r-1 >= 0){
                    if(tempArray[r-1][c] == '0'){
                        tempArray[r-1][c] = colourIn;
                        colour(tempArray, r - 1, c, colourIn);
                    }
                  }
                  if(c+1 <= tempArray[0].length - 1){
                    if(tempArray[r][c+1] == '0'){
                        tempArray[r][c+1] = colourIn;
                        colour(tempArray, r, c + 1, colourIn);
                    }
                  }
                  if(c-1 >= 0){
                    if(tempArray[r][c-1] == '0'){
                        tempArray[r][c-1] = colourIn;
                        colour(tempArray, r, c - 1,colourIn);
                    }
                  }
    }
 }