package com.student.transaction.controller.vm;

import com.student.transaction.domain.Account;

/**
 * Created by Josch on 2018/06/18.
 */
public interface ManageAccountVM {

    void UserList();
    void getAccounts();
    void getAccount(Object object ,Long id);

}
