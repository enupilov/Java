package lesson6;

public class Animal {
    int run;
    int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }
}
class Cat extends Animal {
    public Cat (int run, int swim) {
        super(run, swim);
    }
}
class Dog extends Animal {
    String name;
    public Dog (String name, int run, int swim) {
        super(run, swim);
        this.name = name;
    }
    public void DogInfo() {
        System.out.println(name + " пробежал " + run + " м.");
    }
}
class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog("Бобик", 500, 10);
        dog.DogInfo();
    }
}
