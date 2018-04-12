
package csci305;

import java.util.Scanner;

//This is the HumanPlayer class, which is controlled by the user
public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element move = null;
        
        //loops this prompt for a move until a correct move is chosen
        //Returns the users choice in the form of an Element
        while (move == null) {
            System.out.println("(1) : Rock");
            System.out.println("(2) : Paper");
            System.out.println("(3) : Scissors");
            System.out.println("(4) : Lizard");
            System.out.println("(5) : Spock");
            System.out.println("Enter your move:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1": move = Main.moves.get("Rock");     break;
                case "2": move = Main.moves.get("Paper");    break;
                case "3": move = Main.moves.get("Scissors"); break;
                case "4": move = Main.moves.get("Lizard");   break;
                case "5": move = Main.moves.get("Spock");    break;
                default: System.out.println("That is not a valid option");
            }
        }
        return move;
    }

}
