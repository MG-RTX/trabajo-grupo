package com.distribuida.test;

import com.distribuida.entities.DetallesPedido;

import com.distribuida.entities.Pedido;
import com.distribuida.entities.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class DetallesPedidoTest {

    private DetallesPedido detallesPedido;
    private Pedido pedido;
    private Producto producto;

    @BeforeEach
    public void setup(){
        detallesPedido = new DetallesPedido();
        pedido = new Pedido();



        Producto producto = new Producto(1,"Doritos",12.00,3);

        pedido.setIdPedido(1);
        pedido.setTotal(30.00);
        pedido.setEstado("Aprobado");

       detallesPedido.setIdDetalle(1);
       detallesPedido.setCantidad(2);
       detallesPedido.setPrecioUnitario(12.00);

        detallesPedido.setPedido(pedido);
       detallesPedido.setProducto(producto);

    }

    @Test
    public void testPedidoDetallesConstructorrandGetter(){
        assertAll("Validar Datos Detalles Pedidos",
                () -> assertEquals(1, detallesPedido.getIdDetalle()),
                () -> assertEquals(2, detallesPedido.getCantidad()),
                () -> assertEquals(12.00, detallesPedido.getPrecioUnitario())
                );
    }

    @Test
    public void testPedidoDetallesToString(){
        String str = detallesPedido.toString();
        assertAll("Validar Datos Detalles Pedido",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("2")),
                () -> assertTrue(str.contains("12.0"))
                );

    }


}
