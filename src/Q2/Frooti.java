package Q2;

class Frooti extends Item{
    private static int cost = 8;
    Frooti(){
        super("Frooti");
    }

    public static int getCost(){
        return Frooti.cost;
    }
}
