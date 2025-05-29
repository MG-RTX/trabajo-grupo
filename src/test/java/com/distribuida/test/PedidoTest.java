package com.distribuida.test;

import com.distribuida.entities.Pedido;
import com.distribuida.entities.cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PedidoTest {

    private Pedido pedido;
    private cliente cliente;

    @BeforeEach
    public void setup(){

        pedido = new Pedido();

        cliente cliente = new cliente(1,"Marco",
                "test@gmail.com","Software",new Date());

        pedido.setIdPedido(1);
        pedido.setFechaPedido(new Date());
        pedido.setTotal(30.00);
        pedido.setEstado("Aprobado");
        pedido.setCliente(cliente);


    }

    @Test
    public void testPedidoConstructorandGetter(){
        assertAll("Validar Datos Pedido",
                () -> assertEquals(1, pedido.getIdPedido()),
                () -> assertEquals(30.00, pedido.getTotal()),
                () -> assertEquals("Aprobado", pedido.getEstado()),
                () -> assertEquals(1, pedido.getCliente().getIdCliente()),
                () -> assertEquals("Marco", pedido.getCliente().getNombre()),
                () -> assertEquals("test@gmail.com", pedido.getCliente().getCorreo()),
                () -> assertEquals("Software", pedido.getCliente().getCarrera())
                );
    }

    @Test
    public void testPedidoToString(){
        String str = pedido.toString();
        assertAll("Validar Datos Pedido",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("30.0")),
                () -> assertTrue(str.contains("Aprobado"))
        );

    }

}
