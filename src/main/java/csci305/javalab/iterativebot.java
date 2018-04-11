package csci305.javalab;

import java.util.*;

class IterativeBot extends Player {
    int lastMovePlayed = Main.moves.size() - 1;
    
    public IterativeBot(String name) {
        super (name);
    }
    
    public Element play() {
        lastMovePlayed = (lastMovePlayed + 1) % Main.moves.size();
        Iterator it = Main.moves.entrySet().iterator();
        int iterNum = 0;
        while (it.hasNext())
            if (lastMovePlayed == iterNum)
                return (Element)it.next();
            iterNum++;
        return null;
    }
}