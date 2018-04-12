
package csci305;

//This is the iterative bot that will loop through each move no matter what
public class IterativeBot extends Player{
    
    int turn = 0;
    public IterativeBot(String name){
        super(name);
    }
    
    @Override
    public Element play(){
        turn++;
        switch(turn%5){
            case 1: return Main.moves.get("Paper");
            case 2: return Main.moves.get("Scissors");
            case 3: return Main.moves.get("Lizard");
            case 4: return Main.moves.get("Spock");
            default: return Main.moves.get("Rock");
        }
    }
}
