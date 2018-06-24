package com.student.transaction.domain;

import javax.persistence.*;

/**
 * Created by Josch on 2018/06/22.
 */
@Entity
@Table(name = "BudgetCategory")
public class BudgetCategory {
    @Id
    @Column(name = "badgetCategoryId" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long badgetCategoryId;

    @Column(name = "budgetCategory" , unique = true)
    private String budgetCategory;

    public Long getBadgetCategoryId() {
        return badgetCategoryId;
    }

    public void setBadgetCategoryId(Long badgetCategoryId) {
        this.badgetCategoryId = badgetCategoryId;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

}