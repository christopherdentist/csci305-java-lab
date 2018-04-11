package csci305.javalab;

abstract class Player {
    String name = "";
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract Element play();
}