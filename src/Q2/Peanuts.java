package Q2;

class Peanuts extends Item{
    private static int cost = 3;
    Peanuts(){
        super("Peanuts");
    }

    public static int getCost(){
        return Peanuts.cost;
    }
}
