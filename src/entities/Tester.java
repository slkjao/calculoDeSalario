package entities;

public class Tester extends Employee{
    public Tester(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public Double salaryCalculation() {
        double developerSalary = this.getSalary();
        if(developerSalary > 3000.0){
            return developerSalary * 1.15;
        }
        return developerSalary * 1.2;
    }
}
