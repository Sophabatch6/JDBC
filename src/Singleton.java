public class Singleton {
    private int id;
    private String name;
    private static Singleton s = null;
    private static Object lock = new Object();
    private Singleton (){}

    public  static synchronized Singleton getObj(){
        if (s==null){
            s= new Singleton();
        }
        return s;
    }

    public void print(){
        System.out.println(id+ " : "+ name);
    }

}
