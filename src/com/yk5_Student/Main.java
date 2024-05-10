package com.yk5_Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алиса", "Группа A", 1, List.of(4.5, 3.5, 4.0)));
        students.add(new Student("Вася", "Группа A", 1, List.of(4.5, 3.5, 4.0)));
        students.add(new Student("Петя", "Группа B", 1, List.of(2.5, 3.5, 2.0)));
        students.add(new Student("Маша", "Группа B", 1, List.of(2.5, 3.5, 2.5)));
        students.add(new Student("Надя", "Группа C", 1, List.of(3.5, 3.5, 4.5)));
        students.add(new Student("Борис", "Группа C", 1, List.of(3.5, 3.5, 4.5)));
        for (Student s : students) {
            System.out.println(s);
        }
        removeStudent(students);
        printStudents(students, 1);

    }

    public static void removeStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double grade = student.calculateGrade();
            if (grade < 3) {
                iterator.remove();
                System.out.println("Стулент " + student.getName() + " был удален.");
            } else {
                student.promoteToNextCourse();
                System.out.println("Cтудент " + student.getName() + " прошел на " + student.getCourse() + " курс.");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("-----------------------------------------");
        System.out.println("Список студентов: ");
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.calculateGrade());
        }
    }
}

/*
Задача 3:
Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе.
 */
