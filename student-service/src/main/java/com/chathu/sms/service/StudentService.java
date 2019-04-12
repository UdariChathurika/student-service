package com.chathu.sms.service;

import com.chathu.sms.model.Student;

public interface StudentService {

    Student save(Student student);
    Student fetch();
    Student fetch(Student student);
}
