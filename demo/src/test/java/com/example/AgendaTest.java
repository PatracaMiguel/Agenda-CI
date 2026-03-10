package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

    private Agenda agenda;

    @BeforeEach
    void setUp() {
        agenda = new Agenda();
    }

    @Test
    void agregarTarea() {

        agenda.agregarTarea("Estudiar");

        assertDoesNotThrow(() -> agenda.listarTareas());
    }

    @Test
    void borrarTareaExistente() {

        agenda.agregarTarea("Tarea borrar");

        boolean resultado = agenda.borrarTarea(1);

        assertTrue(resultado);
    }

    @Test
    void borrarTareaInexistente() {

        agenda.agregarTarea("Tarea real");

        boolean resultado = agenda.borrarTarea(99);

        assertFalse(resultado);
    }

    @Test
    void marcarTareaExistente() {

        agenda.agregarTarea("Hacer ejercicio");

        boolean resultado = agenda.marcarTarea(1);

        assertTrue(resultado);
    }

    @Test
    void marcarTareaInexistente() {

        agenda.agregarTarea("Tarea real");

        boolean resultado = agenda.marcarTarea(50);

        assertFalse(resultado);
    }

    @Test
    void listarTareas() {

        agenda.agregarTarea("Tarea A");
        agenda.agregarTarea("Tarea B");

        assertDoesNotThrow(() -> agenda.listarTareas());
    }

}