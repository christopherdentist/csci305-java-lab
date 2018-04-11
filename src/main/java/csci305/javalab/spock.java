package csci305.javalab;

class Spock extends Element {
    public Spock(String name) {
        super (name);
    }
    
    public Outcome compareTo(Element e) {
        return new Outcome(this, e);
    }
}