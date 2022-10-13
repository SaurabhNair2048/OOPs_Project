package Q2;

class Snicker extends Item{
    private static int cost = 4;
    private static String name = "Snickers";
    Snicker(){
        super(name);
    }

    public static int getCost(){
        return Snicker.cost;
    }


    public static String getName(){
        return name;
    }
}
