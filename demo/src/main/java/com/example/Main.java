package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(); 
        
        do {
            System.out.println(" Organizador de tareas ");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Imprimir agenda");
            System.out.println("4. Borrar tarea");
            System.out.println("5. AutoTest");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción: ");            
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Agregar nombre de tarea");
                    String nombreTarea = sc.nextLine();
                    agenda.agregarTarea(nombreTarea);
                    break;
                case 2:
                    System.out.println("Ingresa el ID de la tarea a marcar como completada");
                    int idTarea = sc.nextInt();
                    agenda.marcarTarea(idTarea);
                    break;
                case 3: 
                    System.out.println("Agenda de tareas");
                    agenda.listarTareas();
                    break;
                case 4: 
                    System.out.println("Ingresa el ID de la tarea que se va a  borrar");
                    int idTareaEliminar = sc.nextInt();
                    agenda.borrarTarea(idTareaEliminar);
                    break;
                case 5:
                    System.out.println("Ejecutando AutoTest");
                    autoTest();

                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        sc.close();
    }


public static void autoTest() {

    System.out.println("Iniciando prueba ingresar una tarea");

    Agenda agenda = new Agenda();

    agenda.agregarTarea("Tarea de prueba");

    if (agenda.totalTareas() == 1) {
        System.out.println("La prueba pasó");
    } else {
        System.out.println("La prueba falló");
    }
    }

}
