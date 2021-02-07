package com;

import java.util.Objects;

public class Student implements Information {
    private final String NAME; // ім’я, прізвище
    private final String INDEX; // номер залікової книжки
    private double GPA; //середній бал
    private final Faculty FACULTY;

    public Student(String name, String markBookIndex, double GPA,Faculty faculty) {
        this.NAME = name;
        this.INDEX = markBookIndex;
        this.GPA = GPA;
        this.FACULTY = faculty;
        FACULTY.add(this);
    }


    public String getName() { return NAME; }

    public double getGPA() {
        return GPA;
    }

    public String getIndex() {
        return INDEX;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Faculty getFaculty() {
        return FACULTY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return NAME.equalsIgnoreCase(student.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME);
    }

    @Override
    public void getInformation() {
        System.out.println(
                "Вся информация о студенте:" +
                        "\nФИО: " +this.NAME +
                        "\nИнститут: " + FACULTY.getInstitute().getName() +
                        "\nФакультет: " + FACULTY.getName() +
                        "\nНомер студенческого: " + this.INDEX +
                        "\nСредний бал: " + this.GPA

        );
    }
}