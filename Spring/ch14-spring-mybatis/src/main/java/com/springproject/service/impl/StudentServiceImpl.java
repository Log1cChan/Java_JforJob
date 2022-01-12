package com.springproject.service.impl;

import com.springproject.dao.StudentDao;
import com.springproject.domain.Student;
import com.springproject.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int rows = studentDao.insertStudent(student);

        return rows;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
