package com.distribuida.principal;

import com.distribuida.entities.Cliente;
import org.distribuida.entities.cliente;

public class ClientePrincipal {

    public static void main(String[] args){

        Cliente cliente = new Cliente(1,"1753352515","Ara",
                "Chupin","Tumbaco","911","pepe@gmail.com");
        System.out.println(cliente.toString());
    }

}
