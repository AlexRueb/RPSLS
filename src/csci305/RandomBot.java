
package csci305;

//This is the random bot, which uses Math.random to pick a random move out of the 5
public class RandomBot extends Player{
    
    public RandomBot(String name){
        super(name);
    }
    
    @Override
    public Element play(){
        int rand = (int) (10*Math.random());
        switch(rand%5){
            case 1: return Main.moves.get("Paper");
            case 2: return Main.moves.get("Scissors");
            case 3: return Main.moves.get("Lizard");
            case 4: return Main.moves.get("Spock");
            default: return Main.moves.get("Rock");
        }
    }
}
