package com.student.transaction.controller;

import com.student.transaction.controller.vm.ManageAccountVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.zkoss.bind.annotation.Init;

@Controller("manageAccountController")
@Scope("prototype")
public class ManageAccountController {

    @Autowired
    private ManageAccountVM manageAccountVM;

    @Init
    public void init(){
        manageAccountVM.getAccounts();
    }

    public ManageAccountVM getManageAccountVM() {
        return manageAccountVM;
    }

    public void setManageAccountVM(ManageAccountVM manageAccountVM) {
        this.manageAccountVM = manageAccountVM;
    }

}
