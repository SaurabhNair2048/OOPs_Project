package Q2;

class Pringles extends Item{
    private static int cost = 7;
    Pringles(){
        super("Pringles");
    }

    public static int getCost(){
        return Pringles.cost;
    }
}
