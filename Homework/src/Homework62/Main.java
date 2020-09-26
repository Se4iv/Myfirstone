package Homework62;

public class Main {
    public static void main(String[] args){
        Box firstbox = new Box("Apple",4);
        Box secondbox = new Box("Orange",7);
        Box thirdbox = new Box("Apple",8);

        System.out.println(thirdbox.getCount());
        firstbox.changeCount(thirdbox);
        System.out.println(thirdbox.getCount());

    }
}
