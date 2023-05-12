public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    //Empty constructor
    public Employee() {
    }

    // Constructor with parameters
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    // Tax calculation
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus calculation
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Raise calculation
    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;
        if (workYear < 10) {
            return this.salary * 0.05;
        }else if(workYear > 19) {
            return this.salary * 0.15;
        } else if (workYear > 9 && workYear < 20) {
            return this.salary * 0.10;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name :" + this.name + "\nSalary: " + this.salary + "\nWork Hours: " + this.workHours + "\nHire Year: "
                + this.hireYear + "\nTax: " + this.tax() + "\nBonus: " + this.bonus() + "\nRaise : "
                + this.raiseSalary() +  "\nSalary with tax and bonus: "
                + (this.salary + this.bonus() - this.tax()) + "\nSalary with raise: " + (this.salary + this.raiseSalary());
    }
}
