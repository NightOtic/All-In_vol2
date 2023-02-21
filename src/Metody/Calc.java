package Metody;

public class Calc {

    //typ_zwracany nazwaMetody(opcjionalne_parametry) { return }

    int addTwoNumbers(int a, int b ) {
        int sum  = a + b;
        return sum;
    }
    void addAndPrint(int x, int y ){
        int sum  = addTwoNumbers(x , y);
        System.out.println(sum);
    }




}
