package lesson_11_dsa_stack_queue.exercise.bai_07_to_chuc_du_lieu_hop_ly;

import java.util.*;

public class Demerging {
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
        @Override
        public int compare(Person person1, Person person2) {
            String birthday1 = person1.birthday;
            String birthday2 = person2.birthday;
            return birthday1.compareTo(birthday2);
        }
    };

    public static void main(String[] args) {
        List<Person> arrayStaff = new ArrayList<>();
        Person male1 = new Person(true, "Male1", "02/05/1995");
        Person male2 = new Person(true, "Male2", "06/07/1999");
       // Person male3 = new Person(true, "Male3", "06/07/1991");
        Person female1 = new Person(false, "Female1", "05/06/1997");
        Person female2 = new Person(false, "Female2", "09/10/2000");
        //Person female3 = new Person(false, "Female3", "09/10/1995");

        arrayStaff.add(female1);
        arrayStaff.add(male2);
        arrayStaff.add(male1);
        arrayStaff.add(female2);
        //arrayStaff.add(female3);
        //arrayStaff.add(male3)

        System.out.println("Danh sách nhân viên");
        System.out.println(arrayStaff);
        System.out.println();

        System.out.println("Danh sách nhânn viên sắp xếp theo sinh nhật");
        arrayStaff.sort(BirthdayComparator);
        System.out.println(arrayStaff);
        System.out.println();

        System.out.println("Danh sách nhân viên sắp xếp theo giới tính");
        Queue<Person> queueMale = new LinkedList<>();
        Queue<Person> queueFemale = new LinkedList<>();
        for (Person person : arrayStaff) {
            boolean isMale = person.gender;
            if (isMale) {
                queueMale.add(person);
            } else {
                queueFemale.add(person);
            }
        }
        ArrayList<Person> arrayList = new ArrayList<>();
        while (!queueMale.isEmpty()) {
            arrayList.add(queueMale.remove());
        }
        while (!queueFemale.isEmpty()) {
            arrayList.add(queueFemale.remove());
        }
        System.out.println(arrayList);
    }
}

