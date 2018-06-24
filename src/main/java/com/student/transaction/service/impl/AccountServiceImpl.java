package com.student.transaction.service.impl;

import com.student.transaction.domain.Account;
import com.student.transaction.domain.Student;
import com.student.transaction.service.common.ServiceHelperImpl;
import com.student.transaction.service.*;
import org.apache.poi.hssf.record.formula.functions.T;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("accountService")
@Transactional


/**
 * Created by Josch on 2018/06/18.
 */
public class AccountServiceImpl extends ServiceHelperImpl<Account> implements AccountService  {

    public List<Account> getAll() {
        // TODO Auto-generated method stub
        return super.getAll(Account.class);
    }

    public List<Account> getAccounts(String strQuery) {
        // TODO Auto-generated method stub
        return super.getAccounts(strQuery);
    }

    public Object getAccount(Object object , Long id){
        // TODO Auto-generated method stub
        return super.getAccount(object.getClass(),id);
    }

}