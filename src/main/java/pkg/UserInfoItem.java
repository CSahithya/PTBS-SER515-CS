package pkg;

/*
The User Info Item holds the user information (Buyer Seller details)
author: Sahithya Cherukuri
scheru20
SER515-Design Patterns
PTBS
 */

public class UserInfoItem {

    private String userName;
    private String password;
    protected Person person;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Person getPerson(){
        return person;
    }
}
