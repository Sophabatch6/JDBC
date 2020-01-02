public class MainClass {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            public void run(){
                Singleton s = Singleton.getObj();
                System.out.println(s);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                Singleton sp = Singleton.getObj();
                System.out.println(sp);
            }
        };
        t1.start();
        t2.start();


//        Singleton s = Singleton.getObj();
//
//        System.out.println(s);
//
//        Singleton sp = Singleton.getObj();
//
//        System.out.println(sp);
//
//        sp.print();
    }
}
