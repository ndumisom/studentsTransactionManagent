package com.student.transaction.controller;



import com.student.transaction.controller.vm.ManageAccountVM;
import com.student.transaction.controller.vm.ManageTransactionVM;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Scope;
        import org.springframework.stereotype.Controller;
        import org.zkoss.bind.annotation.Init;

@Controller("manageTransactionController")
@Scope("prototype")
public class ManageTransactionController {

    @Autowired
    private ManageTransactionVM manageTransactionVM;

    @Init
    public void init(){
        manageTransactionVM.getAllTransactions();
    }

    public ManageTransactionVM getManageTransactionVM() {
        return manageTransactionVM;
    }

    public void setManageTransactionVM(ManageTransactionVM manageTransactionVM) {
        this.manageTransactionVM = manageTransactionVM;
    }
}