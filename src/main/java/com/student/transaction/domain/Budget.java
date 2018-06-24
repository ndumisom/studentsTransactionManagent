package com.student.transaction.domain;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Josch on 2018/06/17.
 */

@Entity
@Table(name = "Budget")
public class Budget {
    @Id
    @Column(name = "budgetId" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long budgetId;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "badgetCategoryId",name = "badgetCategoryId" , nullable = false)
    private BudgetCategory budgetCategory;

    @Column(name = "budget_ID" , unique = true, nullable = false)
    private Long budget_ID;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "budgetbalanceId",name = "budgetbalanceId",unique = true, nullable = false)
    private Budgetbalance budgetbalance;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName = "studentId")
    private Student student;

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public BudgetCategory getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(BudgetCategory budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public Long getBudget_ID() {
        return budget_ID;
    }

    public void setBudget_ID(Long budget_ID) {
        this.budget_ID = budget_ID;
    }

    public Budgetbalance getBudgetbalance() {
        return budgetbalance;
    }

    public void setBudgetbalance(Budgetbalance budgetbalance) {
        this.budgetbalance = budgetbalance;
    }
}
