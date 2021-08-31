public class Program2 {
    public static void main(String[] args) {
        Cat tom = new Cat( "Tom",2.50, 46);
        String TomName = tom.getName();
        double TomWeight = tom.getWeight();
        int TomHeight = tom.getHeight();
        System.out.print("Имя кота: " + TomName +" ");
        System.out.print("Вес кота: " + TomWeight + " ");
        System.out.println("Рост кота: " + TomHeight +" ");
        Cat tim = new Cat( );
        String TimName = tim.getName();
        double TimWeight = tim.getWeight();
        int TimHeight = tim.getHeight();
        System.out.print("Имя кота: " + TimName + " ");
        System.out.print("Вес кота: " + TimWeight + " ");
        System.out.println("Рост кота: " + TimHeight+" ");
        Cat feliks = new Cat( );
        feliks.name = "Feliks";
        feliks.weight = 2.90;
        feliks.height=56;
        System.out.print("Имя кота: " + feliks.name + " ");
        System.out.print("Вес кота: " + feliks.weight + " ");
        System.out.println("Рост кота: " + feliks.height+" ");
    }
}
