package com.student.transaction.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Josch on 2018/06/23.
 */
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transactionId", unique=true, nullable=false)
    private Long transactionId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TransactionDate", nullable = false)
    private Date TransactionDate;


    @Column(name="transaction_ID", unique=true, nullable=false)
    private Long transaction_ID;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "studentId" ,name = "studentId")
    private Student student;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "accountId" ,name = "accountId")
    private Account account;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "budgetId" ,name = "budgetId")
    private Budget budget;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "budgetbalanceId" ,name = "budgetbalanceId")
    private Budgetbalance budgetbalance;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "badgetCategoryId" ,name = "budgetCategoryId")
    private BudgetCategory budgetCategory;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "merchantId" ,name = "merchantId")
    private Merchant merchant;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "transactionTypeId" ,name = "transactionTypeId")
    private TransactionType transactionType;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "transactionAmountId", name = "transactionAmountId")
    public TransactionAmount transactionAmount;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Budgetbalance getBudgetbalance() {
        return budgetbalance;
    }

    public void setBudgetbalance(Budgetbalance budgetbalance) {
        this.budgetbalance = budgetbalance;
    }

    public BudgetCategory getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(BudgetCategory budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Long getTransaction_ID() {
        return transaction_ID;
    }

    public void setTransaction_ID(Long transaction_ID) {
        this.transaction_ID = transaction_ID;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(TransactionAmount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
