package com.student.transaction.controller.vm;

import java.util.List;

import com.student.transaction.controller.domain.StudentControllerDomain;
import com.student.transaction.controller.util.DomainIntoController;
import com.student.transaction.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.NotifyChange;


@Component("manageStudentVM")
public class ManageStudentVMImpl implements ManageStudentVM {

    private Long id;
    private String username;
    private Long studentId = null;
    private  String firstName;
    private  String surname;
    private  Long studentNumber;
    private List<StudentControllerDomain> studentControllerDomains;

    @Autowired
    private StudentService studentService;


    @NotifyChange("studentControllerDomains")
    public void UserList(){
        this.studentControllerDomains = DomainIntoController.domaintoControllerList(studentService.getAll());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<StudentControllerDomain> getStudentControllerDomains() {
        return studentControllerDomains;
    }

    public void setStudentControllerDomains(List<StudentControllerDomain> studentControllerDomains) {
        this.studentControllerDomains = studentControllerDomains;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
