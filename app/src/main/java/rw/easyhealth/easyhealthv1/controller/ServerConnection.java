package rw.easyhealth.easyhealthv1.controller;

/**
 * Created by gniyongere on 11/17/2017.
 */

public class ServerConnection {

    private String web_server_ip="192.168.0.12";
    private String server_port="8080";

    public String getWeb_server_ip() {
        return web_server_ip;
    }

    public void setWeb_server_ip(String web_server_ip) {
        this.web_server_ip = web_server_ip;
    }

    public String getServer_port() {
        return server_port;
    }

    public void setServer_port(String server_port) {
        this.server_port = server_port;
    }

    public String provide_Server_connection(){
        String server_Url=web_server_ip+":"+server_port;
        return  server_Url;
    }
}
