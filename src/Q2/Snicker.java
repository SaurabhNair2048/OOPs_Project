package Q2;

class Snicker extends Item{
    private static int cost = 4;
    Snicker(){
        super("Snicker");
    }

    public static int getCost(){
        return Snicker.cost;
    }
}
