package Klasy_i_Obiekty;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name ="Daniel";
        employee1.surname= "Ochojski";
        employee1.seniority= 5;
        employee1.yearofbirth = 1997;

        String employeeinfo1= employee1.name + "," + employee1.surname + "," + employee1.seniority + "," +
                employee1.yearofbirth ;



        employee2.name ="Dawid";
        employee2.surname= "Jedraszczyk";
        employee2.seniority= 2;
        employee2.yearofbirth= 1997;
        String employeeinfo2 = employee2.name + "," + employee2.surname + "," + employee2.seniority + "," +
        employee2.yearofbirth;



        employee3.name ="Michal";
        employee3.surname= "Dziewanowski";
        employee3.seniority= 10;
        employee3.yearofbirth = 1994;

        String employeeinfo3 = employee3.name + "," + employee3.surname + "," + employee3.seniority + "," +
        employee3.yearofbirth;


        System.out.println(employeeinfo1);
        System.out.println(employeeinfo2);
        System.out.println(employeeinfo3);
    }
}
