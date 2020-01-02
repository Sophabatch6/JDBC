import java.util.Scanner;

public class Collection {
    private String name;
    private int id;

    public void setId(int value){
        this.id = value;
    }
    public void setName(String value){
        this.name = value;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
