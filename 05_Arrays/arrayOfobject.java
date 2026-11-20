class Student{
    String name;
    int age;
}

public class arrayOfobject { 
    public static void main(String[]args){

        Student s1 = new Student();
        s1.name = "Akshat";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 20; 

        Student students[] = new Student[2];
        students[0] =s1;
        students[1] =s2;
        for(int i=0 ;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].age);
 
        }


    }
}
