
package csci305;

import java.util.Scanner;

//For MyBot I created a bot that plays different choices according to if it is winning/losing/tie
//Throughout the game, depending on the bots standings, it will talk smack accordingly
public class MyBot extends Player {

    public MyBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        
        //Determines if the bot is winning or losing
        if (Main.loseCt > Main.winCt) {
            return trick();
        } else if (Main.winCt > Main.loseCt) {
            return talkSmack();
        } else {
            return heated();
        }
    }

    public Element talkSmack() {
        
        //Randomly will generate one of three aggressive statements
        int roll = (int) (10 * Math.random());

        if (roll > 5) {
            System.out.println("Man, you're awful at this game");
            return Main.moves.get("Spock");
        } else if (roll < 5) {
            System.out.println("I mean seriously, are you always this ignorant??");
            return Main.moves.get("Lizard");
        } else {
            System.out.println("Alright let's just end this quickly");
            return Main.moves.get("Scissors");
        }
    }

    public Element trick() {
        
        //Attempts to convice the opponent that its next move will be rock, then plays paper for now
        System.out.println("next round I'm gonna play Rock");
        return Main.moves.get("Paper");
    }

    public Element heated() {
        
        //The bot is getting a little heated
        System.out.println("Alright listen here, I came here for a funfilled day of Rock, Paper, Scissors, Lizard, Spock.");
        System.out.println("What do you have to say for yourself?");
        boolean allowed = false;
        Element move = null;
        
        //Talks smack while demanding something back from the user
        //Depending on what the user chooses, the bot will play a certain move
        while (!allowed) {
            System.out.println("(1) Fight me");
            System.out.println("(2) Kiss me");
            System.out.println("(3) Go away");
            System.out.println("(4) I don't want to play anymore");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Yeah tough guy? Take this!");
                    allowed = true;
                    move = Main.moves.get("Spock");
                    break;
                case "2":
                    System.out.println("You think this is a joke?");
                    allowed = true;
                    move = Main.moves.get("Lizard");
                    break;
                case "3":
                    System.out.println("HAH! I'm not leaving till this is over with!");
                    allowed = true;
                    move = Main.moves.get("Rock");
                    break;
                case "4":
                    System.out.println("I don't care what you want. I'm beating you and that's all there is to it!");
                    allowed = true;
                    move = Main.moves.get("Paper");
                    break;
                default:
                    System.out.println("What? I can't hear you!!!");
            }
        }
        return move;
    }
}
