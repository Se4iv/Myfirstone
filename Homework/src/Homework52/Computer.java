package Homework52;

import Homework52.GPU.Gpu;
import Homework52.Monitor.Monitor;
import Homework52.Processor.Processor;
import Homework52.Ram.Ram;
import Homework52.Storage.Storage;

public class Computer {

    public String computerBuilding(String cool, String store){
        return  new Monitor().monType() + new Gpu().gpuBuilder(cool) +
                new Processor().proccesBuild() + new Ram().ramBuild() +
                new Storage().storageBuild(store);
    }
}
