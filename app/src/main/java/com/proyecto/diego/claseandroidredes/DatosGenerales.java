package com.proyecto.diego.claseandroidredes;

import android.util.Log;

/**
 * Created by diego on 05/03/18.
 */

public class DatosGenerales extends DatosLogin implements Configuraciones {


    String LastName;
    String Age;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    @Override
    public void Login(String User, String Count, String Pass) {
        super.Login(User, Count, Pass);
        Log.i("pass","Contraseña no Asignada");
        Log.i("pass","Contraseña Actual "+getPass());
    }

    @Override
    public void borrar() {

    }

    @Override
    public void Publicar(String mensaje) {
        Log.i("publicar",mensaje);
    }

    @Override
    public void Compartir() {

    }

    @Override
    public void Like() {

    }
    public String traerDatos(){
        String datos;
        return datos = "Usuario: "+getUser()+"\nMail: "+getCount()+"\nPass:"+getPass();
    }
}
