package com.student.transaction.controller.vm;

import com.student.transaction.controller.domain.*;
import com.student.transaction.controller.util.DomainIntoController;
import com.student.transaction.domain.Account;
import com.student.transaction.domain.Student;
import com.student.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.NotifyChange;
import java.lang.*;


import java.util.List;

@Component("manageAccountVM")
public class ManageAccountVMImpl implements ManageAccountVM {

    private Long accountId;
    private Student student;
    private Long accountNumber;

    private String firstName;

    private List<AccountControllerDomain> accountControllerDomains;
    private AccountControllerDomain accountControllerDomain;

    @Autowired
    private AccountService accountService;
    public void UserList(){
        this.accountControllerDomains = DomainIntoController.domaintoControllerListAccount(accountService.getAll());
    }

    @NotifyChange("accountControllerDomains")
    public void getAccounts(){
//      this.accountControllerDomains = DomainIntoController.domaintoControllerListAccount(accountService.getAccounts("SELECT * FROM Account join Student on student.studentId=Account.studentId"));
    }

    @NotifyChange("accountControllerDomains")
    public void getAccount(Object objec ,Long id){
        Account account = new Account();
//        this.accountControllerDomains = DomainIntoController.domainForController(accountService.getAccount(account,1));
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<AccountControllerDomain> getAccountControllerDomains() {
        return accountControllerDomains;
    }

    public void setAccountControllerDomains(List<AccountControllerDomain> accountControllerDomains) {
        this.accountControllerDomains = accountControllerDomains;
    }

    public AccountControllerDomain getAccountControllerDomain() {
        return accountControllerDomain;
    }

    public void setAccountControllerDomain(AccountControllerDomain accountControllerDomain) {
        this.accountControllerDomain = accountControllerDomain;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
