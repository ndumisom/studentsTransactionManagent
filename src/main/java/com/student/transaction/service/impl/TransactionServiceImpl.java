package com.student.transaction.service.impl;

/**
 * Created by Josch on 2018/06/24.
 */

import com.student.transaction.service.TransactionService;
import com.student.transaction.service.common.ServiceHelperImpl;
import com.student.transaction.domain.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("transactionService")
@Transactional
public class TransactionServiceImpl extends ServiceHelperImpl<Transaction> implements TransactionService{

    public List<Transaction> getAll() {
        // TODO Auto-generated method stub
        return super.getAll(Transaction.class);
    }
}
