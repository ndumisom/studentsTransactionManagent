package com.student.transaction.controller.domain;

/**
 * Created by Josch on 2018/06/18.
 */
public class StudentControllerDomain {

    private Long id;

    private  Long studentId;

    //textbox
    private String firstName;
    //textbox
    private String surname;
    //textbox
    private Long studentNumber;

    public Long getId() {
        return id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setId(Long id) {
        this.id = id;
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
}
