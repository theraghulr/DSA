package StaticExample;

public class Main {
    public static void main(String[] args) {
        Fun();
    }

    static void Fun(){
//        Greetings(); // you cannont call non static function in static.


        // you c]annot access non-static stuff without referencing their instances in a static context
        // Hence , here i am referencing it.
        Main obj = new Main();
        obj.Greetings();

    }

    void Greetings(){
        System.out.println("Hello Raghul ");
    }
}
