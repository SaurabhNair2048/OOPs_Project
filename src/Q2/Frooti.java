package Q2;

class Frooti extends Item{
    private static int cost = 8;
    private static String name = "Frooti";
    Frooti(){
        super(name);
    }

    public static int getCost(){
        return Frooti.cost;
    }


    public static String getName(){
        return name;
    }
}
