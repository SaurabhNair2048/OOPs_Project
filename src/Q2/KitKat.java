package Q2;

class KitKat extends Item{
    private static int cost = 5;
    KitKat(){
        super("KitKat");
    }

    public static int getCost(){
        return KitKat.cost;
    }
}
