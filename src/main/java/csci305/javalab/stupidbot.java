package csci305.javalab;

class StupidBot extends Player {
    public StupidBot(String name) {
        super (name);
    }
    
    public Element play() {
        return Main.moves.get("Rock");
    }
}