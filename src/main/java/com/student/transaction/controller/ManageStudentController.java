package com.student.transaction.controller;


import com.student.transaction.controller.vm.ManageStudentVM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;



@Controller("manageStudentController")
@Scope("prototype")
public class ManageStudentController {

    @Autowired
    private ManageStudentVM manageStudentVM;
    @Init
    public void init(){
        manageStudentVM.UserList();
    }

    public ManageStudentVM getManageStudentVM() {
        return manageStudentVM;
    }

    public void setManageStudentVM(ManageStudentVM manageStudentVM) {
        this.manageStudentVM = manageStudentVM;
    }
}
