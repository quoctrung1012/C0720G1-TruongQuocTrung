package lesson_12_java_collection_framework.practice.bai_03_sap_xep_voi_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()){
            return 1;
        }   else if (student1.getAge() == student2.getAge()){
            return 0;
        }   else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student string : lists){
            System.out.println(string.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
