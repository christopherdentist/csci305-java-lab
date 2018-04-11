package csci305.javalab;

class Lizard extends Element {
    public Lizard(String name) {
        super (name);
    }
    
    public Outcome compareTo(Element e) {
        return new Outcome(this, e);
    }
}