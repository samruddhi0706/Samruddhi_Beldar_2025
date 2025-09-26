//Create a class Student with rollNo, name, and marks. Accept details of 3 students and print details of the student with the highest marks.

    class Q1_student{
        int rollNo;
        String name;
        float marks;

        Q1_student(int rollNo, String name, float marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }


    public static void main(String[]args){
        Q1_student s1 = new Q1_student(1,"sam",95);
        Q1_student s2 = new Q1_student(2,"srushti",83);
        Q1_student s3 = new Q1_student(3,"shreya",85);


        Q1_student top = s1;

        if(s2.marks>top.marks){
            top = s2;
        }

        if(s3.marks>top.marks){
            top = s3;
        }

        System.out.println("highest mark student details:");
        System.out.println("Roll No: " + top.rollNo);
        System.out.println("Name: " + top.name);
        System.out.println("Marks: " + top.marks);


    }
    }