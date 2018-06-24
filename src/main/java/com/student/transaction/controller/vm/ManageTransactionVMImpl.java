package com.student.transaction.controller.vm;

import com.student.transaction.controller.domain.TransactionControllerDomain;
import com.student.transaction.controller.util.DomainIntoController;

import com.student.transaction.domain.Transaction;
import com.student.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.NotifyChange;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Josch on 2018/06/24.
 */

@Component("manageTransactionVM")
public class ManageTransactionVMImpl implements ManageTransactionVM {

    private Long transactionId;
    private Date TransactionDate;
    private BigDecimal transactionAmount;
    private String transactionType;
    private Long transaction_ID;

    private Long id;
    private String username;
    private Long studentId = null;
    private  String firstName;
    private  String surname;
    private  Long studentNumber;

    private Long budgetId;
    private Long budget_ID;
    private String budgetCategory;
    private String balance;
    private Long merchantId;
    private Long merchant_ID;
    private String merchantname;
    private List<TransactionControllerDomain> transactionControllerDomains;

    @Autowired
    TransactionService transactionService;



    @NotifyChange("transactionControllerDomains")
    public void getAllTransactions(){
     this.transactionControllerDomains = DomainIntoController.domainTransactionToControllerList(transactionService.getAll());

    }

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

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
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

    public List<TransactionControllerDomain> getTransactionControllerDomains() {
        return transactionControllerDomains;
    }

    public void setTransactionControllerDomains(List<TransactionControllerDomain> transactionControllerDomains) {
        this.transactionControllerDomains = transactionControllerDomains;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
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
}
