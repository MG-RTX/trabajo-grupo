package com.distribuida.test;

import com.distribuida.entities.cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

   private cliente cliente;

   @BeforeEach
    public void setup(){
       cliente = new cliente(1,"Xavier","test@gmail.com","Software",new Date());

   }

    @Test
    public void testClienteConstructorandGetter(){
       assertAll("Validaar Datos Cliente, Constructor y Getters",
               () -> assertEquals(1, cliente.getIdCliente()),
               () -> assertEquals("Xavier", cliente.getNombre()),
               () -> assertEquals("test@gmail.com", cliente.getCorreo()),
               () -> assertEquals("Software", cliente.getCarrera()));
    }

    @Test
    public void testFacturaToString(){
        String str = cliente.toString();
        assertAll("Validar Datos Cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Xavier")),
                () -> assertTrue(str.contains("test@gmail.com")),
                () -> assertTrue(str.contains("Software"))
        );
    }

}
