package csci305.javalab;

abstract class Element {
    String name = "";
    
    Element(String name) {
        this.name = name;
    }
    
    
    public String getName() { return name; }
    
    public abstract Outcome compareTo(Element e);
}