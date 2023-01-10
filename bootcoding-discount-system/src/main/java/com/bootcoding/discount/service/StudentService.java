package com.bootcoding.discount.service;

import com.bootcoding.discount.Marker;
import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.Student;
import com.bootcoding.discount.utils.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (int i=0; i<10; i++){
            Student student = buildRandomStudent();
            students.add(student);
        }
        return students;
    }

    private Student buildRandomStudent() {
        Student student = new Student();
         student.setName(NameGenerator.getName());
         student.setSub(SubjectGenerator.getSub());
         student.setMarks(MarksGenerator.getMarks());

         return student;

//        Customer customer = new Customer();
//        customer.setName(NameGenerator.getName());
//        customer.setCity(CityGenerator.getCity());
//        customer.setOrderCount(OrderCountGenerator.getOrderCount());
//        customer.setVisitCount(VisitCountGenerator.getVisitCount());
//
//
//        return customer;
    }
}
