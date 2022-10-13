package Q2;

class Pringles extends Item{
    private static int cost = 7;
    private static String name = "Pringles";
    Pringles(){
        super(name);
    }

    public static int getCost(){
        return Pringles.cost;
    }


    public static String getName(){
        return name;
    }
}
