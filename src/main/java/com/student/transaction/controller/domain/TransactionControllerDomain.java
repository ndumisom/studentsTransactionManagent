package com.student.transaction.controller.domain;

import com.student.transaction.domain.Student;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Josch on 2018/06/22.
 */
public class TransactionControllerDomain {
    private Long transactionId;
    private Date TransactionDate;
    private BigDecimal transactionAmount;
    private Long transaction_ID;
    private String TransactionType;


    private Long id;
    private Long accountId;
    private Student student;
    private Long accountNumber;
    private String firstName;
    private String surname;
    private Long studentNumber;

    private Long budgetId;
    private Long budget_ID;
    private String budgetCategory;
    private BigDecimal balance;
    private Long merchantId;
    private Long merchant_ID;
    private String merchantname;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

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

    public Long getId() {
        return id;
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

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public Long getBudget_ID() {
        return budget_ID;
    }

    public void setBudget_ID(Long budget_ID) {
        this.budget_ID = budget_ID;
    }

    public Long getMerchant_ID() {
        return merchant_ID;
    }

    public void setMerchant_ID(Long merchant_ID) {
        this.merchant_ID = merchant_ID;
    }

    public Long getTransaction_ID() {
        return transaction_ID;
    }

    public void setTransaction_ID(Long transaction_ID) {
        this.transaction_ID = transaction_ID;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }
}