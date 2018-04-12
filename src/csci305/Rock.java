
package csci305;

//The rock class
class Rock extends Element {
    
    
    public Rock(String rock) {
        super(rock);
    }
    
    @Override
    String compareTo(Element enemy){
        //Creates a outcome object and decides who would win
        Outcome outcome = new Outcome();
        return outcome.decideOutcome("Rock", enemy.getName());
    }
}
