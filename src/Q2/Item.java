package Q2;

import java.time.LocalDateTime;

abstract class Item{
    private String id;

    Item(String name){
        this.id=name+ LocalDateTime.now().hashCode();
    }

}
