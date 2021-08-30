public class Program2 {
    public static void main(String[] args) {
        Cat tom = new Cat( "Tom",2.50, 46);
        String TomName = tom.getName();
        double TomWeight = tom.getWeight();
        int TomHeight = tom.getHeight();
        System.out.println("Имя кота: " + TomName);
        System.out.println("Вес кота: " + TomWeight);
        System.out.println("Рост кота: " + TomHeight);
    }
}
class Cat {

    private String name;
    private double weight;
    private int height;

    public Cat(String name, double weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Cat() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = "Tom";
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}


