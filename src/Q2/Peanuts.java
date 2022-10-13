package Q2;

class Peanuts extends Item{
    private static int cost = 3;
    private static String name = "Peanuts";
    Peanuts(){
        super(name);
    }

    public static int getCost(){
        return Peanuts.cost;
    }


    public static String getName(){
        return name;
    }
}
