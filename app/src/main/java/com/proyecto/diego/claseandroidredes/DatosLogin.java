package com.proyecto.diego.claseandroidredes;

/**
 * Created by diego on 05/03/18.
 */

public class DatosLogin {

    private String User;
    private String Count;
    private String Pass;

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public DatosLogin(){
        User = "Christian";
        Count = "diemp94@hotmail.com";
        Pass = "123456";
    }

    public void Login (String User, String Count, String Pass){
        setUser(User);
        setCount(Count);
        if (ValidLogin(Pass))
            setPass(Pass);
    }

    public boolean ValidLogin(String Pass){
        if(Pass.length()<4){
            return false;
        }else{
            return true;
        }
    }

}
