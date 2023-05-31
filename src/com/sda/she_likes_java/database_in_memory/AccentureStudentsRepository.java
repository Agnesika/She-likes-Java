package com.sda.she_likes_java.database_in_memory;

import java.util.List;

// CRUD:
//CREATE
//READ
//UPDATE
//DELETE

public class AccentureStudentsRepository {

    public List<AccentureStudent> getAllStudents() {
        return List.of();
    }

    public AccentureStudent getStudentById(Long id) {
        return null;
    }

    public AccentureStudent saveStudent(AccentureStudent student) {
        return null;
    }

    public boolean deleteStudentById(Long id) {
        return true;
    }

    public AccentureStudent updateStudent(AccentureStudent student) {
        return null;
    }
}