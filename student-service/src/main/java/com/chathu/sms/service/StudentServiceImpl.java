package com.chathu.sms.service;

import com.chathu.sms.model.Student;
import com.chathu.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student fetch() {
        return null;
    }

    @Override
    public Student fetch(Student student) {
        return null;
    }
}
