
package csci305;

//The paper class
class Paper extends Element {

    public Paper(String paper) {
        super(paper);
    }
    @Override
    String compareTo(Element enemy){
        //Creates a outcome object and decides who would win
        Outcome outcome = new Outcome();
        return outcome.decideOutcome("Paper", enemy.getName());
    }
}
