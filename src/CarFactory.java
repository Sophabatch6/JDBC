public class CarFactory{
    public static Car getCar(String carName){
        if (carName.equals("Auti")){
            return new AutiCar();
        }
        else if (carName.equals("CyberTruck")){
            return new CyberTruck();
        }
        else if (carName.equals("Tesla")){
            return new TeslaCar();
        }
        else{
            return null;
        }
    }


}
