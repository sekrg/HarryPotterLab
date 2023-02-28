package people;

import enums.MagicObjects;

import java.util.Objects;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void sit();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj == this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
