package home_work1207;

import java.util.List;
import java.util.Objects;

public class Soldier {
    private String name = "Avi";
    private double age;
    private int id;

    public Soldier(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return id == soldier.id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getAge() {

        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

