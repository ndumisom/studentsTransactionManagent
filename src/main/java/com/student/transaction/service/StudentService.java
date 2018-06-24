package com.student.transaction.service;

import com.student.transaction.domain.Student;
import com.student.transaction.service.common.ServiceHelper;

import java.util.List;

/**
 * Created by Josch on 2018/06/18.
 */
public interface StudentService  extends ServiceHelper<Student> {

    List<Student> getAll();
}
