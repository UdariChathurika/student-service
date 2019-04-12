package com.chathu.sms.repository;

import com.chathu.sms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
