package csci305.javalab;

class LastPlayBot extends Player {
    private Element lastPlay = null;
    
    public LastPlayBot(String name) {
        super (name);
    }
    
    public Element play() {
        Element opponentMove = null;
        if (Main.lastPlay1 == lastPlay)
            opponentMove = Main.lastPlay2;
        else
            opponentMove = Main.lastPlay1;
        
        if (opponentMove == null) {
            Element toPlay = RandomBot.getRandomElement();
            lastPlay = toPlay;
            return toPlay;
        }
        else {
            Element toPlay = opponentMove;
            lastPlay = toPlay;
            return toPlay;
        }
    }
}