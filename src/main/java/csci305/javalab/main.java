package csci305.javalab;

import java.util.*;

class Main {
    static final Map<String, Element> moves = new HashMap<String, Element>();
    static Element lastPlay1 = null, lastPlay2 = null;
    
    static {
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Lizard", new Lizard("Lizard"));
        moves.put("Spock", new Spock("Spock"));
    }
    
    public static void main(String args[]) {
        System.out.println("\n    Welcome to Chris McCabe's lab!    \n");
        System.out.println("Please select two players from the following list: ");
        
        System.out.println("(1) : StupidBot\n(2) : RandomBot\n(3) : IterativeBot\n(4) : LastPlayBot\n(5) : MyBot ('predictive')\n(6) : Human (You!)\n");
        
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[2];
        for (int i = 0; i < 2; i++) {
            int input = -1;
            while (input < 1 || input > 6) {
                System.out.print("Enter the corresponding number for player " + (i + 1) + ": ");
                String next = scanner.nextLine();
                try {
                    input = Integer.parseInt(next.trim());
                } catch (Exception e) {}
                if (input < 1 || input > 6)
                    System.out.println("Invalid number selected. Please try again.");
            }
            switch(input) {
                case 2: players[i] = new RandomBot("RandomBot"); break;
                case 3: players[i] = new IterativeBot("IterativeBot"); break;
                case 4: players[i] = new LastPlayBot("LastPlayBot"); break;
                case 5: players[i] = new MyBot("MyBot"); break;
                case 6: players[i] = new Human("Human"); break;
                default: players[i] = new StupidBot("StupidBot"); break;
            }
        }
        
        int score = 0;
        for (int i = 0; i < 5; i++) {
            Element p1move = players[0].play();
            Element p2move = players[1].play();
            Outcome result = p1move.compareTo(p2move);
            if (result.value.equals("Win"))
                score++;
            else if (result.value.equals("Lose"))
                score--;
            System.out.println(result);
        }
        System.out.print("Final result: ");
        if (score > 0)
            System.out.println("Player One wins!");
        else if (score < 0)
            System.out.println("Player Two wins!");
        else
            System.out.println("Neither player wins - it's a draw!");
    }
}