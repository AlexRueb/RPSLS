
package csci305;

//This is the stupid bot, only plays "paper" every turn
public class StupidBot extends Player{
    
    public StupidBot(String name) {
        super(name);
    }
    
    @Override
    public Element play(){
        return Main.moves.get("Paper");
    }
}
