package compare;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if (obj instanceof Human) {
            Human otherHuman = (Human) obj;
            return name.equals(otherHuman.name) && surname.equals(otherHuman.surname) && age == otherHuman.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public boolean compareHashCode(Object obj) {
        if(this.hashCode() == obj.hashCode())
            return true;

        return false;
    }
}
