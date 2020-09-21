package Homework52.Processor;

public class Processor {

    public String proccesBuild() {
        return  new Creator().name() + new Name().naming() +
                new Cores().naming() + new Freaquincy().frNum() +
                new Cashmemory().cashing();
    }
}
