package homework.lesson9;

public class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.println(name +"         " + yearOfJoining + "              " + salary + "          " + address);
    }
}
//    Write a program that would print the information (name, year of joining, salary, address)
//    of three employees by creating a class named 'Employee'. Use array of objects and
//    enhanced for loop.
//        The output should be as follows:
//        Name        Year of joining        Address
//        Robert            1994                64C- WallsStreat
//        Sam                2000                68D- WallsStreat
//        John                1999                26B- WallsStreat
