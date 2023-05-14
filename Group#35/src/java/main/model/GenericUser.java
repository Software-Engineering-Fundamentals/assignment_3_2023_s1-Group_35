package model;

import java.util.Date;

public abstract class GenericUser {
    int ID;
    String name;
    String password;
    Date DOB;
    String emergencyContactInfo;

    public void requestHelp() {
        // Request help from IT Administrator
    }
}
