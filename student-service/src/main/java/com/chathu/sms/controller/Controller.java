package com.chathu.sms.controller;

import com.chathu.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chathu.sms.model.Student;

@RestController
@RequestMapping(value = "/smscloud")
public class Controller {

    @Autowired
    StudentService studentService;

    @RequestMapping(value= "/add",method = RequestMethod.POST)
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);

    }

}
