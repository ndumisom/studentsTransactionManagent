package com.student.transaction.controller.util;

import com.student.transaction.controller.domain.AccountControllerDomain;
import com.student.transaction.controller.domain.StudentControllerDomain;
import com.student.transaction.controller.domain.TransactionControllerDomain;
import com.student.transaction.domain.Account;
import com.student.transaction.domain.Student;
import com.student.transaction.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josch on 2018/06/18.
 */
public class DomainIntoController {

    public static StudentControllerDomain domainForController(Student student) {
        StudentControllerDomain studentControllerDomain = new StudentControllerDomain();
        studentControllerDomain.setFirstName(student.getFirstName());
        studentControllerDomain.setSurname(student.getSurname());
        studentControllerDomain.setStudentNumber(student.getStundeNumber());
        studentControllerDomain.setId(student.getStudentId());

        return studentControllerDomain;
    }

    public static AccountControllerDomain domainForController(Account account) {
        AccountControllerDomain accountControllerDomain = new AccountControllerDomain();

        accountControllerDomain.setAccountId(account.getAccountId());
        accountControllerDomain.setAccountNumber(account.getAccountNumber());
        accountControllerDomain.setId(account.getAccountId());
        accountControllerDomain.setStudent(account.getStudent());
        accountControllerDomain.setFirstName(account.getStudent().getFirstName());
        accountControllerDomain.setSurname(account.getStudent().getSurname());
        accountControllerDomain.setStudentNumber(account.getStudent().getStundeNumber());

        return accountControllerDomain;
    }

    public static List<StudentControllerDomain> domaintoControllerList(List<Student> list) {
        List<StudentControllerDomain> listStudentControllerDomain = new ArrayList<StudentControllerDomain>();
        for (Student student: list) {
            listStudentControllerDomain.add(domainForController(student));
        }
        return listStudentControllerDomain;

    }

    public static List<AccountControllerDomain> domaintoControllerListAccount(List<Account> list) {
        List<AccountControllerDomain> listAccountControllerDomain = new ArrayList<AccountControllerDomain>();
        for (Account account: list) {
            listAccountControllerDomain.add(domainForController(account));

        }
        return listAccountControllerDomain;

    }


    public static TransactionControllerDomain domainTransactionToController(Transaction transaction) {

        TransactionControllerDomain transactionControllerDomain = new TransactionControllerDomain();

        transactionControllerDomain.setAccountId(transaction.getAccount().getAccountId());
        transactionControllerDomain.setAccountNumber(transaction.getAccount().getAccountNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudent(transaction.getStudent());
        transactionControllerDomain.setFirstName(transaction.getStudent().getFirstName());
        transactionControllerDomain.setSurname(transaction.getStudent().getSurname());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());

        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setStudentNumber(transaction.getStudent().getStundeNumber());
        transactionControllerDomain.setBudgetId(transaction.getBudget().getBudgetId());
        transactionControllerDomain.setBudgetCategory(transaction.getBudgetCategory().getBudgetCategory());
        transactionControllerDomain.setBudget_ID(transaction.getBudget().getBudget_ID());
        transactionControllerDomain.setMerchantId(transaction.getMerchant().getMerchantId());
        transactionControllerDomain.setMerchantname(transaction.getMerchant().getMerchantname());
        transactionControllerDomain.setBalance(transaction.getBudgetbalance().getBalance());
        transactionControllerDomain.setMerchant_ID(transaction.getMerchant().getMerchant_ID());
        transactionControllerDomain.setTransaction_ID(transaction.getTransaction_ID());
        transactionControllerDomain.setTransactionDate(transaction.getTransactionDate());
        transactionControllerDomain.setTransactionAmount(transaction.getTransactionAmount().getTransactionAmount());
        transactionControllerDomain.setTransactionType(transaction.getTransactionType().getTransactionType());

        return transactionControllerDomain;
    }

    public static List<TransactionControllerDomain> domainTransactionToControllerList(List<Transaction> list) {
        List<TransactionControllerDomain> transactionControllerDomain = new ArrayList<TransactionControllerDomain>();
        for (Transaction transaction: list) {
            transactionControllerDomain.add(domainTransactionToController(transaction));

        }
        return transactionControllerDomain;

    }
}
