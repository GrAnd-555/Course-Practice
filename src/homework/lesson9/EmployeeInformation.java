package homework.lesson9;

public class EmployeeInformation {
    public static void main(String[] args) {
        Employee[] employeList = new Employee[3];
        employeList[0] = new Employee("George", 2005, 4500, "4th Avenue - 13A");
        employeList[1] = new Employee("John", 2001, 6000, "International - 64B");
        employeList[2] = new Employee("Sam", 2011, 2000, "4th Avenue - 28E");
        System.out.println("Name  Year Of Joining  Salary  Address");
        for (Employee intermediate : employeList) {
            intermediate.display();
        }

    }
}
