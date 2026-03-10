package com.example;

import java.util.ArrayList;

public class Agenda {
    private static int contadorId = 1; 
    private int id;
    private String nombreTarea;
    private boolean completada;
    private static ArrayList<Agenda> agenda = new ArrayList<>(); 

    public Agenda(String nombreTarea) {
        this.id = contadorId++;
        this.nombreTarea = nombreTarea;
        this.completada = false; 
        agenda.add(this);
    }

    public Agenda() {
    }
    
    public void agregarTarea(String nombreTarea) {
        new Agenda(nombreTarea);
        System.out.println("Tarea agregada con ID: " + (contadorId - 1));
    }

    public boolean marcarTarea(int idTarea) {
        System.out.println("Marcar tarea con ID: " + idTarea + " como completada");
        
        for (Agenda tarea : agenda) {
            if (tarea.getId() == idTarea) {
                tarea.setCompletada(true);
                System.out.println("Tarea marcada como completada");
                return true;
            }
        }
        
        System.out.println("Tarea no encontrada");
        return false;
    }

    public boolean borrarTarea(int idTarea) {
        System.out.println("Borrar tarea con ID: " + idTarea);
        
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getId() == idTarea) {
                agenda.remove(i);
                System.out.println("Tarea borrada ");
                return true;
            }
        }
        
        System.out.println("no se encontrado la tareas");
        return false;
    }

    public void listarTareas() {
        if (agenda.isEmpty()) {
            System.out.println("No hay tareas en la agenda");
            return;
        }
        
        for (Agenda tarea : agenda) {
            System.out.println("Tarea ID " + tarea.getId() + "  Nombre  " + tarea.getNombreTarea() + " Completada  " + tarea.isCompletada());
        }
    }
    public int totalTareas() {
        return agenda.size();
}   

    public int getId() {
        return id;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}