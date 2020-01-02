package Composite_Pattern;

public class CEO implements Employee {
    private String name;

    public CEO(String name){
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(name);
    }
}
