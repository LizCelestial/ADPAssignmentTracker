package org.assignmentTracker.factory;

import org.assignmentTracker.entity.User;
import org.assignmentTracker.util.Helper;

import java.util.Date;

public class UserFactory {

    public static User createUser(String name, String surname, String password, String email, Date date){
        int userID = Helper.generateID();
        long studNo = Helper.generateStudNum();
        User user = new User.Builder().
                setID(userID).
                setName(name).
                setSurname(surname).
                setStudNo(studNo).
                setPassword(password).
                setEmail(email).
                setJoinDate(date).
                build();
        return user;
    }

}
