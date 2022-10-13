package Q2;

class KitKat extends Item{
    private static int cost = 5;
    private static String name = "KitKat";
    KitKat(){
        super(name);
    }

    public static int getCost(){
        return KitKat.cost;
    }


    public static String getName(){
        return name;
    }
}
