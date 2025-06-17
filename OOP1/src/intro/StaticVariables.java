package intro;

public class StaticVariables {

    static class Human{
        int age;

        Human(int age){
            this.age=age;
        }
        @Override
        public int toString(){
            return age;
        }

    }

    public static void main(String[] args) {

        Test student = new Test("Raghul","chennai");
        Test student2 = new Test("Kunal","chennai");

        Human raghul = new Human(22);
        System.out.println(raghul);
        System.out.println(student);
        System.out.println(student2);


    }
}

class Test{
    String name;
    String place;

    Test(String name, String place){
        this.name=name;
        this.place=place;
    }
    @Override

    public String toString(){
        return name+","+place;

    }






}

