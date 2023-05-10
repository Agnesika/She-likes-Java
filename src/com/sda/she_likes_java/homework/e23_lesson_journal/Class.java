package com.sda.she_likes_java.homework.e23_lesson_journal;

import java.util.Objects;

public class Class extends Journal{

    private String subject;
    private int grade;

    public Class(String subject, int grade) {

        this.subject = subject;
        this.grade = grade;
    }



    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class data = (Class) o;
        return grade == data.grade &&  Objects.equals(subject, data.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, grade);
    }

    @Override
    public String toString() {
        return "Data{" +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
