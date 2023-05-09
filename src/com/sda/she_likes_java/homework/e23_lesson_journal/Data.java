package com.sda.she_likes_java.homework.e23_lesson_journal;

import java.util.Objects;

public class Data {
    private String pupil;
    private String subject;
    private int grade;

    public Data(String pupil, String subject, int grade) {
        this.pupil = pupil;
        this.subject = subject;
        this.grade = grade;
    }

    public String getPupil() {
        return pupil;
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
        Data data = (Data) o;
        return grade == data.grade && Objects.equals(pupil, data.pupil) && Objects.equals(subject, data.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pupil, subject, grade);
    }

    @Override
    public String toString() {
        return "Data{" +
                "pupil='" + pupil + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
