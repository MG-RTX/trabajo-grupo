package com.distribuida.test;

import com.distribuida.entities.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    public void setup(){

        producto = new Producto(1,"Doritos",12.00,3);

    }

    @Test
    public void testProductoConstructoradnGetter(){
        assertAll("Validar Datos Producto",
                () -> assertEquals(1, producto.getIdProducto()),
                () -> assertEquals("Doritos", producto.getNombreProducto()),
                () -> assertEquals(12.00, producto.getPrecio()),
                () -> assertEquals(3, producto.getStock()));
    }

    @Test
    public void testProductoToString(){
        String str = producto.toString();
        assertAll("Validar Datos Prodcuto",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Doritos")),
                () -> assertTrue(str.contains("12.0")),
                () -> assertTrue(str.contains("3"))
        );
    }


}
