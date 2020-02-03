
public class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;
     
    public Employee(int id, int salary, String firstName, String lastName)
    {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getID()
    {
        return id;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public String getName()
    {
        String myString = firstName + " " + lastName;
        return myString;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getAnnualSalary()
    {
        return salary*12;
    }
    public int raiseSalary(int percent)
    {
        salary = salary*percent + salary;
        return salary;
    }
    public String toString()
    {
        String myString1 = "Employee[ ID = " + getID() + ", name = " + getName() + ", salary = " + getSalary() + "]" ;
        return myString1;
    }
            
        
}
