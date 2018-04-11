package csci305.javalab;

class Paper extends Element {
    public Paper(String name) {
        super (name);
    }
    
    public Outcome compareTo(Element e) {
        return new Outcome(this, e);
    }
}