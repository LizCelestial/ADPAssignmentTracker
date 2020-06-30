package org.assignmentTracker.factory;

import org.assignmentTracker.entity.Admin;
import org.assignmentTracker.entity.Assignment;
import org.assignmentTracker.entity.User;
import org.assignmentTracker.util.Helper;

/*
@author Brandon Villet
StudNo: 214056791
Date: 30 June 2020
Desc: Test for Admin Factory
 */
public class AdminFactory {
    public static Admin createAdmin(User user, Assignment assignment) {
        int studNo = Helper.generateID(); // generates a random number to use for the admin id which is a student number
        Admin admin = new Admin.Builder().
                setId(studNo). //sets admin id as student number
                setAssignment(assignment). // assign an assignment
                setUser(user). //set user
                build();
        return admin;

    }//end of method
}//end of class
