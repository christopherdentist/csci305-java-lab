package csci305.javalab;

import java.util.*;

class Human extends Player {
    public Human(String name) {
        super (name);
    }
    
    public Element play() {
        System.out.println("(1) : Rock\n(2) : Paper\n(3) : Scissors\n(4) : Lizard\n(5) : Spock");
        
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input < 1 || input > 5) {
            System.out.print("Enter your move: ");
            String next = scanner.nextLine();
            try {
                input = Integer.parseInt(next.trim());
            } catch (Exception e) {}
            if (input < 1 || input > 5)
                System.out.println("Invalid move. Please try again.");
        }
        switch (input) {
            case 1: return Main.moves.get("Rock");
            case 2: return Main.moves.get("Paper");
            case 3: return Main.moves.get("Scissors");
            case 4: return Main.moves.get("Lizard");
            case 5: return Main.moves.get("Spock");
            default: return null;
        }
    }
}