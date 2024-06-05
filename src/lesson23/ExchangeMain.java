package lesson23;

import java.util.concurrent.Exchanger;

public class ExchangeMain {

    public static void main(String[] args) {
        class Message {
            String strMsg;
            Integer intMsg;
        }
        Exchanger<Message> exchanger = new Exchanger<>();
        Runnable r1 = () -> {
            Message message = new Message();
            message.strMsg = "Hello World";
            System.out.println(1 + " " + message.strMsg);
            try {
                Message exchange = exchanger.exchange(message);
                System.out.println(1 + " " + exchange.intMsg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r2 = () -> {
            Message message = new Message();
            message.intMsg = 4;
            System.out.println(2 + " " + message.intMsg);
            try {
                Message exchange = exchanger.exchange(message);
                System.out.println(2 + " " + exchange.strMsg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
