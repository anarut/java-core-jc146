package lesson23;

public class SingletonMain {

    public static void main(String[] args) {
//        Singleton singleton = new Singleton();
//        Singleton singleton1 = new Singleton();

        Singleton singleton = Singleton.getSingleton();// 1
        Singleton singleton1 = Singleton.getSingleton(); // 2
    }
}
