package com.student.transaction.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Josch on 2018/06/17.
 */

@Entity
@Table(name = "Budgetbalance")
public class Budgetbalance {
    @Id
    @Column(name = "budgetbalanceId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long budgetId;

    @Column(name = "balance", unique = true,columnDefinition="Decimal(10,2)")
    private BigDecimal balance;

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

