//Create a Java class named Course that models the information of an online course. The class must demonstrate:
    // Constructor Overloading:
//Constructor 1: Accepts only courseName.
//Constructor 2: Accepts courseName and instructor.
//Constructor 3: Accepts courseName, instructor, and duration in hours.
//Constructor 4: Accepts the above but in a different parameter sequence: duration, courseName, instructor.
//Method Overloading:
//Define a method named enrollStudent():
//void enrollStudent(String studentName)
//void enrollStudent(String studentName, int studentAge)
//void enrollStudent(String studentName, int studentAge, String email)

   class Q15_course{

    String coursename;
    String instructor;
    int duration;


    Q15_course(String s){
        this.coursename = s;
        System.out.println("the coursename is:" + coursename);
    }
    Q15_course(String s, String i){
        this.coursename = s;
        this.instructor = i;
        System.out.println(" ");
        System.out.println("the coursename is:" + coursename);
        System.out.println("the instructor name is:" + instructor);

    }

    Q15_course(String s, String i , int d){
        this.coursename = s;
        this.instructor = i;
        this.duration = d;
        System.out.println(" ");
        System.out.println("The coursename is" + coursename);
        System.out.println("the instructor name is:" + instructor);
        System.out.println("the duration of course is:" + duration + "hrs");
    }

    void enrollStudent(String studentName){
        System.out.println("The enrollstudent name is:" + studentName);
    }

    void enrollStudent(String studentName, int age){
        System.out.println("the enrollstudent name is:" + studentName);
        System.out.println("the student age is:" + age);
    }

    void enrollStudent(String studentName, int age, String email){
        System.out.println("The enrollstudent name is:" + studentName);
        System.out.println("The student age is"+ age);
        System.out.println("the email of student is:" + email);
    }

    public static void main(String[]args){
         
         Q15_course obj1 =  new  Q15_course("java");
         Q15_course obj2 = new  Q15_course("java","abc");
         Q15_course obj3 = new  Q15_course("java","abc",40);
        System.out.println(" ");
        obj1.enrollStudent("samruddhi");
        System.out.println(" ");
        obj1.enrollStudent("samruddhi",20);
        System.out.println(" ");
        obj1.enrollStudent("samruddhi",20,"@samruddhi");



    }



   }
