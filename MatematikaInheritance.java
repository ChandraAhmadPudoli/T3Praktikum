public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika emteka = new Matematika();
        emteka.pertambahan(20, 10);
        emteka.pengurangan(10, 5);
        emteka.perkalian(10, 3);
        emteka.pembagian(21, 2);
        emteka.display();

        Matematika2 emteka2 = new Matematika2();
        emteka2.display2();
    }
}

