package Q2;

abstract class Item{
    private String name;

    Item(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
