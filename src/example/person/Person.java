package example.person;

public class Person {
    String name;
    float height;
    float weight;

    public Person() {};

    public Person(String name) {
        this.name = name;
    };

    public Person(float height) {
        this.height = height;
    }

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
