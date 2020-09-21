package Homework52.Storage;

public class Storage {

    public String storageBuild(String typeStorage){
        String descr = "";
        Storagetype strtype = Storagetype.valueOf(typeStorage);
        switch (strtype) {
            case SSD:
                Ssd disk1 = new Ssd();
                descr = disk1.diskType();
                break;
            case HDD:
                Hdd disk2 = new Hdd();
                descr = disk2.diskType();
                break;
        }
        return new Creator().naming() + descr + new Volume().volumeMax() + new Formfactor().factorType();
    }
}
