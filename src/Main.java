import entities.DBA;
import entities.Developer;
import entities.Employee;
import entities.Tester;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("jonas", 3500.0);
        Employee dev2 = new Developer("nicolas", 2800.0);

        Employee dba = new DBA("micael", 3100.0);
        Employee tester = new Tester("lucas", 2900.0);

        System.out.printf("%.2f\n", dev.salaryCalculation());
        System.out.printf("%.2f\n", dev2.salaryCalculation());
        System.out.printf("%.2f\n", dba.salaryCalculation());
        System.out.printf("%.2f\n", tester.salaryCalculation());
    }
}