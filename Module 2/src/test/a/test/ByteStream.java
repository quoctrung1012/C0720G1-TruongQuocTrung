package test.a.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\test\\a\\test\\student.dat";

    public static void writeObject(Student student) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void writeObjectList(List<Student> studentList) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Student readObject() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;
        Student student = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

    public static List<Student> readObjectList() {
        FileInputStream fis;
        ObjectInputStream ois = null;
        List<Student> studentList = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);

            studentList = (List<Student>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return studentList;
    }


    public static void main(String[] args) {
//        writeObject(new Student(2,"Luyen", new Role(1)));
//        System.out.println(readObject());
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Tu", new Role(1)));
        studentList.add(new Student(2, "Luyen", new Role(1)));

        writeObjectList(studentList);

        List<Student> output = readObjectList();

        for (Student student : output) {
            System.out.println(student);
        }
    }
}
