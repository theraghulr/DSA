package StaticExample;

public class Person{
    int age;
    String name;
    Boolean Marriage;
    static long population;

    public Person(int age,String name,Boolean Marriage){

        this.age=age;
        this.name = name;
        this.Marriage = Marriage;
        Person.population +=1;

    }

    public Person(int age, String name){
        this.age = age;
        this.name= name;
    }

}
