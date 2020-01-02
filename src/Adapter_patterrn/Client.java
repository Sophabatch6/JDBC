package Adapter_patterrn;

public class Client {
    public static void main(String[] args) {
        Three_Prong_Adapter adapter = new Adapter(new Two_Prong_Adapter());
        adapter.getAdapter();
    }
}
