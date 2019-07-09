package sg.edu.rp.c346.employeeinfo;

public class Employee {
    private String Name, Title;
    private Double salary;

    public Employee(String name, String title, Double salary) {
        Name = name;
        Title = title;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getTitle() {
        return Title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
