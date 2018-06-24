package com.student.transaction.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Josch on 2018/06/24.
 */
@Entity
@Table(name = "transactionAmount")
public class TransactionAmount {

    @Id
    @Column(name = "transactionAmountId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionAmountId;

    @Column(name = "transactionAmount", unique = true,columnDefinition="Decimal(10,2)")
    private BigDecimal transactionAmount;

    public Long getTransactionAmountId() {
        return transactionAmountId;
    }

    public void setTransactionAmountId(Long transactionAmountId) {
        this.transactionAmountId = transactionAmountId;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
