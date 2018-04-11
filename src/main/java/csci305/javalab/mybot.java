package csci305.javalab;

class MyBot extends Player {
    private Element lastPlay = null;
    
    public MyBot(String name) {
        super (name);
    }
    
    /** For the MyBot play function, it picks through the following rule:
     *    - Find the element last played by self, called "lastE"
     *    - Find an element that will beat lastE, called "beatsE"
     *    - Play an element that will beat beatsE, called "trumpE"
     *  This particular strategy relies on the opponent expecting that this
     *    player will not pick a new element to play. If your opponent plays
     *    a rock, and you swap to paper, then you'd best hope your opponent
     *    doesn't swap to scissors. That's the idea, at least.
    **/
    public Element play() {
        Element lastE = lastPlay, beatsE = lastPlay, trumpE = lastPlay;
        if (lastE == null)
            lastE = RandomBot.getRandomElement();
        int lastReference = 0;
        
        // The following two loops find a choice that beats lastE
        for (int i = 0; i < Outcome.names.length; i++)
            if (Outcome.names[i].equals(lastE.getName()))
                lastReference = i;
        for (int i = 0; i < Outcome.names.length; i++)
            if (Outcome.winners[lastReference][i] != null && !Outcome.winners[lastReference][i].equals("equals"))
                beatsE = Main.moves.get(Outcome.names[i]);
            
        // The following two loops find a choice that beats beatsE
        for (int i = 0; i < Outcome.names.length; i++)
            if (Outcome.names[i].equals(beatsE.getName()))
                lastReference = i;
        for (int i = 0; i < Outcome.names.length; i++)
            if (Outcome.winners[lastReference][i] != null && !Outcome.winners[lastReference][i].equals("equals"))
                trumpE = Main.moves.get(Outcome.names[i]);
        return trumpE;
    }
}