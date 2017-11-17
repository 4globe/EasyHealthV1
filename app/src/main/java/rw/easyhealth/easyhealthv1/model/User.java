package rw.easyhealth.easyhealthv1.model;

/**
 * Created by gniyongere on 11/17/2017.
 */

public class User {

    private String username;
    private String password;
    private String usertype;
    private String requestcase;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getRequestcase() {
        return requestcase;
    }

    public void setRequestcase(String requestcase) {
        this.requestcase = requestcase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*
#-------------------------------------User operations -----------------

*/
    public String doLogin(){

         requestcase="login";

        return requestcase;
    }


}
