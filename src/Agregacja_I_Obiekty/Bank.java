package Agregacja_I_Obiekty;

public class Bank {
    public static void main(String[] args) {
        Person  person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "97072206599"  ;
        person1.adress = "Plebiscytowa"  ;
        person1.town = "Warszawa" ;
        person1.postcode = "01-475" ;
        person1.apartamentNumber = " 1" ;

          Person  person2= new Person();
          person2.firstName = "Marta";
          person2.lastName = "Kowalska";
          person2.pesel = "99992233444"  ;
          person2.adress = "Warszawska" ;
          person2.town = "Katowice " ;
          person2.postcode = "01-375" ;
          person2.apartamentNumber = " 12" ;




        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;


        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;


        Credit credit2 = new Credit();
        credit2.borrower = person2 ;
        credit2.cashBorrowed = 4500;
        credit2.cashReturned = 0;
        credit2.interestRate = 0.25;
        credit2.termMonths = 12;






        System.out.println("Osoba 1");
        System.out.println(person1.firstName + "  " + person1.lastName + " numer pesel:  " + person1.pesel);
        System.out.println("posiada konto bankowe z kwota:" + account1.balance);
        System.out.println("mieszka w miejscowosci: " + person1.town + " na ulicy: " + person1.adress + " pod numerem: "
        + person1.apartamentNumber );
        System.out.println("oraz kredyt na kwote  " + credit1.cashBorrowed);


        System.out.println("Osoba 2");
        System.out.println(person2.firstName + "  " + person2.lastName + "  numer pesel:  " + person2.pesel );
        System.out.println("posiada konto bankowe z kwota" + account2.balance);
        System.out.println("mieszka w miejscowosci: "+ " " + person2.town + "  " +  "na ulicy   " + person2.adress+ "  pod  nunmerem" +
                "" + person2.apartamentNumber );
        System.out.println("orz kredyt na kwote:  "+ credit2.cashBorrowed);










    }

}
