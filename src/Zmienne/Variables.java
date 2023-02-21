package Zmienne;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 25;
        double height = 180;
        final String pesel = "1234567890";




        System.out.println(firstName +" " + lastName +  " ma " + age + " lat");
        System.out.println("Pan "+ lastName + "ma pesel " + pesel);
        System.out.println("Jan na wzrost 180cm");
        System.out.println("Jezeli urosnie o 5cm, to bedzie mial "+ (height+ 5) +"cm");

        firstName = " Krzystof" ;
        System.out.println("Imie po zmianie to" + firstName);

    }
}
