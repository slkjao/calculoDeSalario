package entities;

public class Developer extends Employee{
    public Developer(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public Double salaryCalculation() {
        double developerSalary = this.getSalary();
        if(developerSalary > 3000.0){
            return developerSalary * 1.1;
        }
        return developerSalary * 1.2;
    }
}
