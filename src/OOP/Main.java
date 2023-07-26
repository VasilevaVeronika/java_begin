package OOP;

public class Main {
    public static void main(String[] args) {
       Car nissan = new Car();
       nissan.color = "blue";
       nissan.name = "Nissan";
       nissan.model = "sedan";

        Car bmv = new Car();
        bmv.color = "black";
        bmv.name = "BMV 5";
        bmv.model = "crossover";

        System.out.println(nissan.color);
        System.out.println( bmv.color);
    }
}