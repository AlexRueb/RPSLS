
package csci305;

//The lizard class
class Lizard extends Element {

    public Lizard(String lizard) {
        super(lizard);
    }
    @Override
    String compareTo(Element enemy){
        
        //Creates a outcome object and decides who would win
        Outcome outcome = new Outcome();
        return outcome.decideOutcome("Lizard", enemy.getName());
    }
}
