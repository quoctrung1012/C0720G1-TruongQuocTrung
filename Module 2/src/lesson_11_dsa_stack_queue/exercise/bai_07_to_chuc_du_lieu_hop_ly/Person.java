package lesson_11_dsa_stack_queue.exercise.bai_07_to_chuc_du_lieu_hop_ly;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    boolean gender = false;
    String name = "";
    int birthday;

    public Person(boolean gender, String name, int birthday) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
    }

// String birthday ="";
//    @Override
//    public int compare(Person person1, Person person2) {
//        return 0;
//    }
    @Override
    public int compare(Person person1, Person person2) {
        return person1.birthday - person2.birthday;
    }
}
