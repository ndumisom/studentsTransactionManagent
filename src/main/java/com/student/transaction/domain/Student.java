package com.student.transaction.domain;

import javax.persistence.*;
import java.util.*;
/**
 * Created by Josch on 2018/06/17.
 */

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "studentId" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "studentnumber",unique =true,nullable = false)
    private Long stundeNumber;

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

    public Long getStundeNumber() {
        return stundeNumber;
    }

    public void setStundeNumber(Long stundeNumber) {
        this.stundeNumber = stundeNumber;
    }
}
