package example.Human;

import example.person.Person;

public class Humantest1 {

    public static void main(String[] args) {
        Human1 Human1Kim = new Human1();
        Human1Kim.name= "광개토태왕";
        Human1Kim.weight = 85.5F;
        Human1Kim.height = 180.0F;

        Human1 Human1kim = new Human1("광개토태왕", 85.5F, 180);
    }
}
