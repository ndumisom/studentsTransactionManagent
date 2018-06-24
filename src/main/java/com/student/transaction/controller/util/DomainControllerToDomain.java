package com.student.transaction.controller.util;

import com.student.transaction.controller.domain.AccountControllerDomain;
import com.student.transaction.controller.domain.StudentControllerDomain;
import com.student.transaction.domain.Account;
import com.student.transaction.domain.Student;


/**
 * Created by Josch on 2018/06/18.
 */
public class DomainControllerToDomain {

    public static Student StudentControllerForDomain(StudentControllerDomain studentControllerDomain) {
        Student student = new Student();
        Account account = new Account();
        student.setStudentId(studentControllerDomain.getId());
        student.setSurname(studentControllerDomain.getSurname());
        student.setFirstName(studentControllerDomain.getFirstName());
        student.setStundeNumber(studentControllerDomain.getStudentNumber());
        student.setStudentId(studentControllerDomain.getStudentId());
        account.setAccountId(studentControllerDomain.getStudentId());
        account.setStudent(student);
        return student;

    }

    public static Account AccountControllerForDomain(AccountControllerDomain accountControllerDomain) {
        Student student = new Student();
        Account account = new Account();
        account.setAccountId(accountControllerDomain.getAccountId());
        account.setAccountNumber(accountControllerDomain.getAccountNumber());
        account.setStudent(accountControllerDomain.getStudent());
        return account;

    }

}
