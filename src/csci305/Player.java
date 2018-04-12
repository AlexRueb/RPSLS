
package csci305;

//This is the super player class. Holds the basic information and methods
public class Player {

    String name;
    Element last;

    public Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public Element play() {
        return null;
    }
    
    //This method is only for the LastPlayBot, using overloading to add the parameter
    public Element play(Element last){
        return null;
    }
}
