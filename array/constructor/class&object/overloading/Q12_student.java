
  class Q12_student{

    String name;
    int rollno;
    int marks;
    

    void display(String n,int r){
        name = n;
        rollno = r;
        System.out.println("Name:"+ name);
        System.out.println("Rollno:" + rollno);
    }

    void display(String n, int r,int m){
        name = n;
        rollno = r;
        marks = m;
        System.out.println("Name:"+ name );
        System.out.println("Rollno:"+ rollno);
        System.out.println("Marks:" + marks);
    }

    void display(){
       System.out.println("Name: " + name);
        System.out.println("Roll: " + rollno);
        System.out.println("Marks: " + marks);

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }

    
  public static void main(String[]args){
    Q12_student obj = new Q12_student();
    System.out.println("display name and roll number");
    
    obj.display("samruddhi",3);
    System.out.println(" ");
    System.out.println("Display name, rollnumber and marks");
    obj.display("samruddhi",2,88);
    System.out.println(" ");
    System.out.println("Display full Result:");
    obj.display();

    
  }
}