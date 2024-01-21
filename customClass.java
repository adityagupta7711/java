 class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println(" My id is "+ id);
        System.out.println("and my name is this "+ name);
    }
    public int getSalary(){
        return salary;
    }
 }
public class customClass {
    public static void main(String[] args) {
      //  System.out.println(" this is our custom class");
        Employee harry= new Employee();// instantiating a new Employee object
        Employee john= new Employee();
        // setting attributes for harry
        harry.id= 12;
        harry.salary= 34;
        harry.name= "codeWithHarry";

        // setting attributes for john
        john.id= 13;
        john.name=" john d silva";
        john.salary=20;

        // printing the attributes
        harry.printDetails();
        john.printDetails();
        int salary= john.getSalary();
         System.out.println(salary);
        // System.out.println(harry.name);

    }
    
}
