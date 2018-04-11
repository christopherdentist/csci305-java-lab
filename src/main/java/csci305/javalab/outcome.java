package csci305.javalab;

class Outcome {
    String outcome;
    String value;
    static String[] names = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    static String[][] winners = {{"equals", null, "crushes", "crushes", null}, {"covers", "equals", null, null, "disproves"},
                          {null, "cut", "equals", "decapitate", null}, {null, "eats", null, "equals", "poisons"},
                          {"vaporizes", null, "smashes", null, "equals"}};
    
    /** e1, the first passed variable, should be the calling class. **/
    public Outcome(Element e1, Element e2) {
        int v1 = 0, v2 = 0;
        for (int i = 0; i < names.length; i++) {
            if (e1.getName() == names[i])
                v1 = i;
            if (e2.getName() == names[i])
                v2 = i;
        }
        if (winners[v1][v2] == null) {
            this.outcome = e2.getName() + " " + winners[v2][v1] + " " + e1.getName();
            this.value = "Lose";
        }
        else {
            if (winners[v1][v2] == "equals")
                this.value = "Tie";
            else
                this.value = "Win";
            this.outcome = e1.getName() + " " + winners[v1][v2] + " " + e2.getName();
        }
        Main.lastPlay1 = e1;
        Main.lastPlay2 = e2;
    }
    
    public String toString() {
        return outcome + " -- " + value;
    }
}