package com.student.transaction.service;

import com.student.transaction.domain.Account;
import com.student.transaction.domain.Student;
import com.student.transaction.service.common.ServiceHelper;
import org.apache.poi.hssf.record.formula.functions.T;

import java.util.List;

/**
 * Created by Josch on 2018/06/18.
 */
public interface AccountService  extends ServiceHelper<Account> {

    List<Account> getAll();
    List<Account> getAccounts(String strQuery);
    Object getAccount(Object object , Long id);
}
