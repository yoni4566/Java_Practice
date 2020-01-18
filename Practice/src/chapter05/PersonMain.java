package chapter05;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person();
        person.age = 30;
        person.name = "james";
        person.married = true;
        person.childNum = 3;

        person.printPerson();
    }
}
