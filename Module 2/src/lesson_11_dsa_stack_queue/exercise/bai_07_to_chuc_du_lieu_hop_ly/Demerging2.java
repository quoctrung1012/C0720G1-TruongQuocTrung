package lesson_11_dsa_stack_queue.exercise.bai_07_to_chuc_du_lieu_hop_ly;

import java.util.*;

public class Demerging2 {
    private static int count = 0;

    public static class Person {
        boolean gender = false;
        String name = "";
        String birthday = "";

        public Person() {
        }

        public Person(boolean gender, String name, String birthday) {
            this.gender = gender;
            this.name = name;
            this.birthday = birthday;
        }

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return "Staff {" +
                    "gender=" + gender +
                    ", name='" + name + '\'' +
                    ", birthday='" + birthday + '\'' +
                    '}' + "\n";
        }
    }

    public static Comparator<Person> BirthdayComparator = new Comparator<Person>() {
        public int compare(Person person1, Person person2) {
            String birthday1 = person1.birthday;
            String birthday2 = person2.birthday;
            return birthday1.compareTo(birthday2);
        }
    };

    public static void main(String[] args) {
        List<Person> array = new ArrayList<>();
        Person male1 = new Person(true, "Male1", "02/05/1995");
        Person male2 = new Person(true, "Male2", "06/07/1999");
        Person female1 = new Person(false, "Female1", "05/06/1997");
        Person female2 = new Person(false, "Female2", "09/10/2000");
        array.add(male1);
        array.add(male2);
        array.add(female1);
        array.add(female2);
        System.out.println("danh sách nhân viên");
        System.out.println(array);
        System.out.println();

        array.sort(Demerging2.BirthdayComparator);
        System.out.println(array);
        System.out.println();

        Queue<Person> queueMale =new LinkedList<>();
        Queue<Person> queueFemale =new LinkedList<>();

    }
}

