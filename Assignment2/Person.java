package Assignment2;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }


}
