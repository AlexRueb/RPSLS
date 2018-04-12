
package csci305;

//The spock class
class Spock extends Element {

    public Spock(String spock) {
        super(spock);
    }
    @Override
    String compareTo(Element enemy){
        //Creates a outcome object and decides who would win
        Outcome outcome = new Outcome();
        return outcome.decideOutcome("Spock", enemy.getName());
    }
}
