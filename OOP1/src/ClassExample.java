import static intro.packages.message;

public class ClassExample {
    public static void main(String[] args) {
//        student1.Name = "Raghul";
        Student student1 = new Student("Raghul", 21,9);
        Student student2 = new Student("Kunal",22,90);
        Student student3 = new Student ();

        System.out.println(student3.Name);
        System.out.println(student3.RollNo);
        System.out.println(student3.Marks);
//
        message();


//        int a  = 9;
//        System.out.println(a);
    }
}

class Student {
    String Name;
    int RollNo;
    int Marks;

    Student (Student other){
        this.Name = other.Name;
        this.RollNo=other.RollNo;
        this.Marks= other.Marks;
    }

    Student (){                     //Constructor Overloading..
//            this.Name = "Rana";
//            this.RollNo = 23;
//            this.Marks = 96;

        this("Rana",23,96);
    }

    Student(String Name, int RollNo, int Marks){
        this.Name= Name;
        this.RollNo= RollNo;
        this.Marks = Marks;

    }
}
