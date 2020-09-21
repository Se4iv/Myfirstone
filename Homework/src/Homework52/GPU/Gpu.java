package Homework52.GPU;

public class Gpu {

    public String gpuBuilder(String cooltype) {
        String descr = "";
        Cool cool = Cool.valueOf(cooltype);
        switch (cool) {
            case Act:
                ActiveCooling act1 = new ActiveCooling();
                descr = act1.coolType();
                break;
            case Pass:
                ActiveCooling act2 = new ActiveCooling();
                descr = act2.coolType();
                break;
        }

        return new Creator().creatorOne() + new Type().ramType() + new Volume().maxVolume() + descr;
    }
}
