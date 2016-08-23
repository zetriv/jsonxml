package Model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 22.08.2016.
 */
public class Staff {
    private String name;
    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Staff{\n" +
                "name='" + name + '\n' +
                ", age=" + age +
                "\n, position='" + position + '\n' +
                ", salary=" + salary +
                "\n, skills=" + skills +
                "\n}";
    }
}
