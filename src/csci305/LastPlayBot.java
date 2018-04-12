
package csci305;

//This is the LastPlayBot which will always play the opponents last move
public class LastPlayBot extends Player {

    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        if (last == null) { //in case of the first move, will always play "Spock"
            return Main.moves.get("Spock"); 
        } else {
            return last;
        }
    }

}
