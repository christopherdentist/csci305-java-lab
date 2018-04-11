package csci305.javalab;

import java.util.*;

class RandomBot extends Player {
    public RandomBot(String name) {
        super (name);
    }
    
    public Element play() {
        return getRandomElement();
    }
    
    public static Element getRandomElement() {
        int randNum = (int)(Math.random() * (Main.moves.size()));
        Element[] elements = new Element[Main.moves.size()];
        int i = 0;
        for (Map.Entry<String, Element> entry : Main.moves.entrySet())
            elements[i++] = entry.getValue();
        return elements[randNum];
    }
}
