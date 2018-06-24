package com.student.transaction.domain;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Josch on 2018/06/17.
 */

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountId", unique=true, nullable=false)
    private Long accountId;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "studentId" ,name = "studentId")
    private Student student;

    @Column(name = "accountnumber" , unique = true)
    private Long accountNumber;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
