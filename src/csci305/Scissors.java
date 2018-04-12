
package csci305;

//The scissors class
class Scissors extends Element {

    public Scissors(String scissors) {
        super(scissors);
    }
    @Override
    String compareTo(Element enemy){
        //Creates a outcome object and decides who would win
        Outcome outcome = new Outcome();
        return outcome.decideOutcome("Scissors", enemy.getName());
    }
}
