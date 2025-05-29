package com.distribuida.principal;

import com.distribuida.entities.Pedido;
import com.distribuida.entities.cliente;

import java.util.Date;

public class PedidoPrincipal {

    public static void main(String[] args){

        Pedido pedido = new Pedido();

        cliente cliente = new cliente(1,"Marco Guacapiña","test@gmail.com","Desarrollo de Software",new Date());

      pedido.setIdPedido(1);
      pedido.setFechaPedido(new Date());
      pedido.setTotal(30.00);
      pedido.setEstado("Aprobado");
      pedido.setCliente(cliente);

      System.out.println(pedido);







    }

}
