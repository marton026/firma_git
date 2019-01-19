import java.util.List;

public class TestPracownik {
    public static void main(String[] args) {
        System.out.println("test");

        Pracownik prac1 = new Pracownik("Marcin","Ozzzy",'m',3,2444,40,1,true);
        Pracownik prac2 = new Pracownik("Ewa","Ozzzy",'k',6,3450,31,1,true);

        Kadra kadra = new Kadra();



        kadra.getPracownicy();

    }
}
