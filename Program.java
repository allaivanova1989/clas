public class Program {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 2.50, 46); // создание объекта
        tom.displayInfo();
        Cat tim = new Cat(); // создание объекта
        tim.displayInfo();
    }
}
class Cat {
    String name;    // имя
    double weight;        // вес
    int height;        // рост в см
    Cat(String a, double b, int c) {
        name = a;
        weight = b;
        height = c;
    }
    Cat() {
        name = "Tim";
        weight = 3.20;
        height = 52;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tweight: %.2f \theight: %d\n", name, weight, height);
    }
}

