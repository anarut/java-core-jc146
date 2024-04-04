package lesson10.animal;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal();
        Human human = new Human("Alex", 22);
        human.run();
        human.eat();
        human.say();
        System.out.println(human.getName());

        Monkey monkey = new Monkey("Alice", 5);
        monkey.run();
        monkey.eat();
        monkey.say();
        Tiger tosha = new Tiger("Tosha", 12);
        GoldFish goldy = new GoldFish("Goldy", 2, true);
        Shark shark = new Shark("babyShark", 10, false);
        Owl sonya = new Owl("Sonya", 12);
        Cat cat = new Cat("Dusya", 9, true);
        tosha.say();
        goldy.say();
        shark.say();

        System.out.println("---------------------------");
        Animal[] animals = {human, monkey, tosha, goldy, shark, sonya, cat};

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();

            Animal animal = animals[i];
            if (animal instanceof EarthAnimal) {
                EarthAnimal earthAnimal = (EarthAnimal) animal;
                earthAnimal.run();
            }
            if (animal instanceof FlyingAnimal flyingAnimal) {
                flyingAnimal.fly();
            }

            if (animal instanceof SwimmingAnimal swimmingAnimal) {
                swimmingAnimal.swim();
            }

        }

        EarthAnimal[] animals2 = {human, monkey, tosha, cat};
        for (EarthAnimal earthAnimal : animals2) {
            earthAnimal.run();
        }


        Robot robot = new Robot("Ultramecha 3000");
        Swimmable[] swimmables = {robot, goldy, shark};
        for (Swimmable s : swimmables) {
            s.swim();
        }

        Flyable[] flyables = {robot};
    }
}
