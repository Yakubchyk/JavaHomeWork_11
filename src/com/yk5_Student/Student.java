package com.yk5_Student;

import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double calculateGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promoteToNextCourse() {
        course++;
    }

    @Override
    public String toString() {
        return
                "Имя: " + name + '\'' +" "+ group + '\'' +
                ", Курс: " + course +
                ", Средний балл: " + calculateGrade();
    }
}
