package Composite_Pattern;

public class Manager implements Employee {
    private String name;
    public Manager(String name){
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println(name);
    }
}
