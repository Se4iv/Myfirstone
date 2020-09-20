package Homework32;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Pedigree","House","Hard"),
                new Horse("Grass","Rancho","RedOne"),
                new Cat("Whiskas","Street","SharpBlades")};
        Veterinar vet = new Veterinar();
        for (Animal x : animals) {
            vet.treatAnimal(x);
        }
    }
}
