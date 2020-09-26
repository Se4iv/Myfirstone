package Homework62;

import Homework61.MineLinkedCollection;


public class Box {
    private MineLinkedCollection saveFruit;
    private Fruit typeBox;
    private float weightBox;
    private int count;
    private String type;

    public int getCount(){
        return this.count = saveFruit.size();
    }

    public Box(String type, int count){
        this.saveFruit = new MineLinkedCollection();
        this.count = count;
        this.type = type;
        switch (type) {
            case("Apple"): this.typeBox = new Apple();
            break;
            case("Orange"): this.typeBox = new Orange();
        }
        for (int i=0;i<=this.count;i++){
            saveFruit.add(i);
        }
    }

    public float getWeight(){
        return weightBox = saveFruit.size()* typeBox.getWeight();
    }


    public boolean compare(Box box){
        Box box1 = new Box(typeBox.typeFruit(),this.count);
        boolean check;
        if (box1.getWeight() - box.getWeight() ==0){
            check = true;
        }
        else {
            check = false;
        }
        return check;
    }

    public void changeCount(Box box){
        Box box1 = new Box(typeBox.typeFruit(),this.count);
        if (box1.type==box.type){
            for (int i=0;i<box1.saveFruit.size();i++)
            box.saveFruit.add(box1.saveFruit.get(i));
            box1.saveFruit.clear();
            System.out.println("Фрукты пересыпаны");
        }
        else {
            System.out.println("Коробки с разными фруктами!");
        }

    }
}
