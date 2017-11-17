package rw.easyhealth.easyhealthv1.controller;

import rw.easyhealth.easyhealthv1.model.User;

import static android.R.id.message;

/**
 * Created by gniyongere on 11/17/2017.
 */

public class Protocol {
    private String usecase;
    private String actvity_message;
    private String url_request;
    private User user;
    private String  scon=new ServerConnection().provide_Server_connection();
    private String[] message=new String[2];


    public String getUsecase() {
        return usecase;
    }

    public void setUsecase(String usecase) {
        this.usecase = usecase;
    }

    public String getActvity_message() {
        return actvity_message;
    }

    public void setActvity_message(String actvity_message) {
        this.actvity_message = actvity_message;
    }

    public User getUser() {
        return user;
    }

    public String getUrl_request() {
        return url_request;
    }

    public void setUrl_request(String url_request) {
        this.url_request = url_request;
    }



    public void setUser(User user) {
        this.user = user;
    }



    //=================================================================================

    public String[]  processLogin(String username, String password){

        if(username.equals("")|| password.equals("")){

            message[0]="Username or Password is incorrect,Please try again!";
            message[1]="0";
        }else{
           // validatiob_message[0]="Validated!";
            message[1]="1";
            user=new User(username,password);
            url_request="http://"+scon+"/sevlet file";
            message[0]=url_request;


        }

                      return  message;
    }


}
