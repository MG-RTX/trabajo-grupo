package com.distribuida.test;

import org.distribuida.entities.Factura;
import org.distribuida.entities.cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaTest {

    private Factura factura;
    private cliente cliente;

    @BeforeEach
    public void setup(){
        factura = new Factura();
        cliente = new cliente(1,"1753352515","Ara",
                "Chupin","Tumbaco","911","pepe@gmail.com");

        factura.setIdFactura(1);
        factura.setTotalNeto(150.00);
        factura.setIva(165.00);
        factura.setTotal(150.00);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        //INYECCION DE DEPENDENCIAS
        factura.setCliente(new cliente());



    }

    @Test
    public void testFacturaContructorandGetter(){
        assertAll("Validar Datos Factura, Constructor y Getters",
                () -> assertEquals(1,factura.getIdFactura()),
                () -> assertEquals(150.00,factura.getTotalNeto()),
                () -> assertEquals(165.00,factura.getIva()),
                () -> assertEquals(150.00,factura.getTotal()),
                () -> assertEquals("FAC-0001",factura.getNumFactura())


        );



    }

    @Test
    public void testFacturaSetters(){
        factura.setIdFactura(2);
        factura.setTotalNeto(100.00);
        factura.setIva(12.00);
        factura.setTotal(120.00);
        factura.setNumFactura("FAC-0002");
        factura.setFecha(new Date());
        factura.setCliente(cliente);

        assertAll("Validar Datos Factura Setters",
                () -> assertEquals(2,factura.getIdFactura()),
                () -> assertEquals(100.0,factura.getTotalNeto()),
                () -> assertEquals(12.0,factura.getIva()),
                () -> assertEquals(120.0,factura.getTotal()),
                () -> assertEquals("FAC-0002",factura.getNumFactura()),
                () -> assertEquals(1, factura.getCliente().getIdCliente()),
                () -> assertEquals("1753352515", factura.getCliente().getCedula()),
                () -> assertEquals("Ara", factura.getCliente().getNombre()),
                () -> assertEquals("Chupin", factura.getCliente().getApellido()),
                () -> assertEquals("Tumbaco", factura.getCliente().getDireccion()),
                () -> assertEquals("911", factura.getCliente().getTelefono()),
                () -> assertEquals("pepe@gmail.com", factura.getCliente().getCorreo())
        );

    }

    @Test
    public void testFacturaToString(){
        String str = factura.toString();
        assertAll("Validar Datos Factura",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("150.0")),
                () -> assertTrue(str.contains("165.0")),
                () -> assertTrue(str.contains("150.0")),
                () -> assertTrue(str.contains("FAC-0001"))
                );
    }


}