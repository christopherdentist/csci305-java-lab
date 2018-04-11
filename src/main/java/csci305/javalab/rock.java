package csci305.javalab;

class Rock extends Element {
    public Rock(String name) {
        super (name);
    }
    
    public Outcome compareTo(Element e) {
        return new Outcome(this, e);
    }
}