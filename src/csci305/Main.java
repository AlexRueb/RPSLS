/*
 * 
 * Author(s): Alex Rueb
 * CSCI 305 - Concepts of Programming Languages
 * Lab 3 - Rock Paper Scissors Lizard Spock
 * 
 */
package csci305;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int tieCt = 0; //The count of ties per game
    public static int winCt = 0; //The count of wins per game
    public static int loseCt = 0;//The count of losses per game
    public static final Map<String, Element> moves = new HashMap<String, Element>(); //The hash map of moves
    static { //This instantiates all of the moves and adds them to the hash map
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        Element scissors = new Scissors("Scissors");
        Element lizard = new Lizard("Lizard");
        Element spock = new Spock("Spock");
        moves.put("Rock", rock);
        moves.put("Paper", paper);
        moves.put("Scissors", scissors);
        moves.put("Lizard", lizard);
        moves.put("Spock", spock);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Alex Rueb's game of \nRock Paper Scissors Lizard Spock!");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        
        
            Player p1 = new Player("Player 1");
            Player p2 = new Player("Player 2");
            int j = 1; //loop counter for loop below
            
                System.out.println("Please select your players:\n");
                System.out.println("(1) Stupid Bot");
                System.out.println("(2) Iterative Bot");
                System.out.println("(3) Random Bot");
                System.out.println("(4) Last Play Bot");
                System.out.println("(5) Human Player");
                System.out.println("(6) My Bot");
                
                //This prompts the user for each player
                while (j <= 2) {            
                System.out.print("Player " + j + ":");
                String choice = sc.next();
                switch (choice) {
                    case "1":
                        if(j == 1){p1 = new StupidBot("Player " + j);}
                        else { p2 = new StupidBot("Player " + j);}
                        j++;
                        break;
                    case "2":
                        if(j == 1){p1 = new IterativeBot("Player " + j);}
                        else {p2 = new IterativeBot("Player " + j);}
                        j++;
                        break;
                    case "3":
                        if(j == 1){p1 = new RandomBot("Player " + j);}
                        else {p2 = new RandomBot("Player " + j);}
                        j++;
                        break;
                    case "4":
                        if(j == 1){p1 = new LastPlayBot("Player " + j);}
                        else {p2 = new LastPlayBot("Player " + j);}
                        j++;
                        break;
                    case "5":
                        if(j == 1){p1 = new HumanPlayer("Player " + j);}
                        else {p2= new HumanPlayer("Player " + j);}
                        j++;
                        break;
                    case "6":
                        if(j == 1){p1 = new MyBot("Player " + j);}
                        else {p2 = new MyBot("Player " + j);}
                        j++;
                        break;
                    default:
                        System.out.println("That is not a valid choice");
                }
            }
            Element last;   //This is used for the LastPlayBot to keep track of the last move
            System.out.println("\n");
            
            //The loop for the 5 rounds in a game
            while (i < 5) {
            int round = i + 1;
            System.out.println("\n");
            System.out.println("     Round " + round);
            
            //This is where the players actually make their move
            Element p1move = p1.play();
            Element p2move = p2.play();
            
            System.out.println("Player 1 chose " + p1move.name);
            System.out.println("Player 2 chose " + p2move.name);
            
            //Determines who is the winner
            String outcome = p1move.compareTo(p2move);
            
            //Reacts according to who won
            if (outcome.equals("Tie")){
                tieCt++;
                System.out.println("It was a tie!");
            } else if (outcome.equals("Win")){
                winCt++;
                System.out.println("Player 1 wins!");
            } else {
                loseCt++;
                System.out.println("Player 2 wins!");
            }
            
            //This is assigns each players move to the opponents "last" variable in that class
            //This is used in the LastPlayBot
            p1.last = p2move;
            p2.last = p1move;
            i++;
        }
            
            //Prints out the final score
            System.out.println("\n");
            System.out.println("Wins: " + winCt);
            System.out.println("Losses: " + loseCt);
            System.out.println("Ties: " + tieCt);
            
            if(winCt > loseCt){
                System.out.println("\nPlayer 1 wins the match!");
            } else if (loseCt > winCt){
                System.out.println("\nPlayer 2 wins the match!");
            } else {
                System.out.println("\nThe game was a draw");
            }
    }

}
