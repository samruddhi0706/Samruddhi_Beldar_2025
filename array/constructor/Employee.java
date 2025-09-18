
class Employee{
    String name;
    double basic_salary;
    double gross_salary;




    Employee(String n,double basic)
    {
        name = n;
        basic_salary = basic;

        double hra = 0.20*basic_salary;
        double da = 0.10*basic_salary;

        gross_salary = basic_salary + hra + da;
    }

    void display(){
        System.out.println("NAME:"+name);
        System.out.println(" ");
        System.out.println("basic salary is:"+basic_salary);
        
        System.out.println("gross salary is:"+gross_salary);
    }


public static void main(String[]args){
    Employee e = new Employee("samruddhi",20000);
    e.display();

}
}


