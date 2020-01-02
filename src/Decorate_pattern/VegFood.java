package Decorate_pattern;

public class VegFood implements Food{


    @Override
    public String prepareFood() {
        return "Vegetable Fried";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}
