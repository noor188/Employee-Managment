package model;
import java.util.Objects;
import java.util.Scanner;

public class Employee {

    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;
    Scanner sc = new Scanner(System.in);

    public Employee(){

    }

    public Employee(String firstName, String lastName, String title, double payRate){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.title     = title;
        this.payRate   = payRate;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void display(){
        System.out.println("Name: " + firstName + " " + lastName);
    }

    public void inputEmployee(){
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter last name:");
        this.lastName = sc.nextLine();
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='"  + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate'" + payRate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
