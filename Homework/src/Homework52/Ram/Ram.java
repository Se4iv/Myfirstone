package Homework52.Ram;

public class Ram {

    public String ramBuild(){
        return new Creator().naming() + new Type().typeDdr() + new Volume().naming() + new Freaquincy().frNum();
    }
}
