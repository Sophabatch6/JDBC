package Adapter_patterrn;

public class Adapter implements Three_Prong_Adapter {
    Two_Prong_Adapter adapter;
    public Adapter(Two_Prong_Adapter a){
        this.adapter = a;
    }
    @Override
    public void getAdapter() {
        this.adapter.getSpecificAdapter();
    }
}
