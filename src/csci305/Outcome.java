
package csci305;

//This is a class with the sole purpose of taking in the two moves and creating the dialogue accordingly
//It will print out the correct outcome dialogue and return whether it was a win/loss/tie with respect to player 1
public class Outcome {

    String outcome;
    String wlt;

    String decideOutcome(String input, String enemy) {
        switch (input) {
            case "Rock":
                switch (enemy) {
                    case "Paper":
                        outcome = "Paper covers Rock";
                        wlt = "Lose";
                        break;
                    case "Scissors":
                        outcome = "Rock crushes Scissors";
                        wlt = "Win";
                        break;
                    case "Lizard":
                        outcome = "Rock crushes Lizard";
                        wlt = "Win";
                        break;
                    case "Spock":
                        outcome = "Spock vaporizes Rock";
                        wlt = "Lose";
                        break;
                    default:
                        outcome = input + " equals " + enemy;
                        wlt = "Tie";
                }
                break;
            case "Paper":
                switch (enemy) {
                    case "Rock":
                        outcome = "Paper covers Rock";
                        wlt = "Win";
                        break;
                    case "Scissors":
                        outcome = "Scissors cuts Paper";
                        wlt = "Lose";
                        break;
                    case "Lizard":
                        outcome = "Lizard eats Paper";
                        wlt = "Lose";
                        break;
                    case "Spock":
                        outcome = "Paper disproves Spock";
                        wlt = "Win";
                        break;
                    default:
                        outcome = input + " equals " + enemy;
                        wlt = "Tie";
                }
                break;
            case "Scissors":
                switch (enemy) {
                    case "Paper":
                        outcome = "Scissors cuts Paper";
                        wlt = "Win";
                        break;
                    case "Rock":
                        outcome = "Rock crushes Scissors";
                        wlt = "Lose";
                        break;
                    case "Lizard":
                        outcome = "Scissors decapitate Lizard";
                        wlt = "Win";
                        break;
                    case "Spock":
                        outcome = "Spock smashes Scissors";
                        wlt = "Lose";
                        break;
                    default:
                        outcome = input + " equals " + enemy;
                        wlt = "Tie";
                }
                break;
            case "Lizard":
                switch (enemy) {
                    case "Paper":
                        outcome = "Lizard eats Paper";
                        wlt = "Win";
                        break;
                    case "Scissors":
                        outcome = "Scissors decapitate Lizard";
                        wlt = "Lose";
                        break;
                    case "Rock":
                        outcome = "Rock crushes Lizard";
                        wlt = "Lose";
                        break;
                    case "Spock":
                        outcome = "Lizard poisons Spock";
                        wlt = "Win";
                        break;
                    default:
                        outcome = input + " equals " + enemy;
                        wlt = "Tie";
                }
                break;
            case "Spock":
                switch (enemy) {
                    case "Paper":
                        outcome = "Paper disproves Spock";
                        wlt = "Lose";
                        break;
                    case "Scissors":
                        outcome = "Spock smashes Scissors";
                        wlt = "Win";
                        break;
                    case "Lizard":
                        outcome = "Lizard poisons Spock";
                        wlt = "Lose";
                        break;
                    case "Rock":
                        outcome = "Spock vaporizes Rock";
                        wlt = "Win";
                        break;
                    default:
                        outcome = input + " equals " + enemy;
                        wlt = "Tie";
                }
                break;
        }
        System.out.print(outcome + " -- ");
        System.out.print(wlt);
        System.out.println("");
        return wlt;
    }
}
