package com.student.transaction.service.impl;

import com.student.transaction.domain.Student;
import com.student.transaction.service.StudentService;
import com.student.transaction.service.common.ServiceHelperImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("studentService")
@Transactional


/**
 * Created by Josch on 2018/06/18.
 */
public class StudentServiceImpl extends ServiceHelperImpl<Student> implements StudentService {

    public List<Student> getAll() {
        // TODO Auto-generated method stub
        return super.getAll(Student.class);
    }
}
