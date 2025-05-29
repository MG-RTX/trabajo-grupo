package com.distribuida.principal;

import com.distribuida.entities.DetallesPedido;
import com.distribuida.entities.Pedido;
import com.distribuida.entities.Producto;
import com.distribuida.entities.cliente;

import java.util.Date;

public class DetallesPedidoPrincipal {

    public static void main(String[] args){

    DetallesPedido detalles = new DetallesPedido();
        Pedido pedido = new Pedido();
        cliente cliente = new cliente(1,"Marco Guacapiña","test@gmail.com","Desarrollo de Software",new Date());
        Producto producto = new Producto(1,"Doritos",12.00,3);



        pedido.setIdPedido(1);
        pedido.setFechaPedido(new Date());
        pedido.setTotal(30.00);
        pedido.setEstado("Aprobado");
        pedido.setCliente(cliente); pedido.setIdPedido(1);
        pedido.setFechaPedido(new Date());
        pedido.setTotal(30.00);
        pedido.setEstado("Aprobado");
        pedido.setCliente(cliente);

    detalles.setIdDetalle(1);
    detalles.setCantidad(2);
    detalles.setPrecioUnitario(12.00);
    detalles.setSubtotal(12.00);
    detalles.setPedido(pedido);
    detalles.setProducto(producto);

        System.out.println(detalles);

    }

}
