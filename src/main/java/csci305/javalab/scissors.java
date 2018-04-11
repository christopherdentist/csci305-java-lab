package csci305.javalab;

class Scissors extends Element {
    public Scissors(String name) {
        super (name);
    }
    
    public Outcome compareTo(Element e) {
        return new Outcome(this, e);
    }
}