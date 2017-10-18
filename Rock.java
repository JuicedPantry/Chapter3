package Chapter3;

// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        
        Scanner scan = new Scanner(System.in);
        
        //Get player's play -- note that this is stored as a string
        System.out.print ("User, Enter your play (R, P, or S): ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay=personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt=generator.nextInt(3);
        //Translate computer's randomly generated play to string
        if(computerInt==0){
            computerPlay="R";
        }
        else if(computerInt==1){
            computerPlay="P";
        }
        else{
            computerPlay="S";
        }
        //Print computer's play
        System.out.println ("Computer played: " + computerPlay);
        //See who won.
        if((computerPlay.equals("R")&&personPlay.equals("R"))||(computerPlay.equals("S")&&personPlay.equals("S"))||(computerPlay.equals("P")&&personPlay.equals("P"))){
            System.out.println("Draw");
        }
        else if((computerPlay.equals("R")&&personPlay.equals("S"))||(computerPlay.equals("P")&&personPlay.equals("R"))||(computerPlay.equals("S") && personPlay.equals("P"))){
            System.out.println("Computer Wins");
        }
        else{
            System.out.println("User Wins");
        }
    }
}