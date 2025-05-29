package com.distribuida.principal;

import com.distribuida.entities.cliente;

import java.util.Date;

public class ClientePrincipal {

  public static void main(String[] args){

      cliente cliente = new cliente(1,"Marco Guacapiña",
              "test@gmail.com","Desarrollo de Software",new Date());

      System.out.println(cliente.toString());



  }

}
