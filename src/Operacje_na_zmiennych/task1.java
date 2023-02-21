package Operacje_na_zmiennych;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rand= new Random();
        int x= rand.nextInt(10);
        int y =rand.nextInt(10);
        System.out.println("x=" +x+ ",y="+y);

        System.out.println("Czy x jest mnniejsze od y " );
        System.out.println(x<y);


        System.out.println("Czy x pomozone przez 2 jest wieksze od y ");
        System.out.println(x*2>y);

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(y<x+3 && x-2<y);


        System.out.println("Czy iloczyn x i y jest parzysty ");
        System.out.println((x*y)%2==0);

    }

}
