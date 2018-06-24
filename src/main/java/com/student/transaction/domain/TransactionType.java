package com.student.transaction.domain;

import javax.persistence.*;

/**
 * Created by Josch on 2018/06/24.
 */
@Entity
@Table(name = "TransactionType")
public class TransactionType {

    @Id
    @Column(name = "transactionTypeId" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionTypeId;

    @Column(name = "transactionType" , unique = true, nullable = false)
    private String transactionType;

    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
