
package csci305;

//The parent element class which has the name and the corresponding functions 
//These functions will be polymorphed (?) by the other child element classes
class Element {
    String name;
    
    public Element(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    //The method that will be polymorphed in the child classes, implementing a real comparison
    String compareTo(Element paper) {

        return "yes";
    }

}
