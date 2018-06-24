package com.student.transaction.service;


import com.student.transaction.domain.Transaction;
import com.student.transaction.service.common.ServiceHelper;

import java.util.List;

/**
 * Created by Josch on 2018/06/24.
 */
public interface TransactionService extends ServiceHelper<Transaction>{
    List<Transaction> getAll();
}
