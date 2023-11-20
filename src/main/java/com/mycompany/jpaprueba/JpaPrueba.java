
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) {
       
        ControladoraLogica control = new ControladoraLogica();
        
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        Carrera carre = new Carrera(12, "Tec desarrollo de software", listaMaterias);
        control.crearCarrera(carre);
        
        Materia mate1 = new Materia(58, "Matematica 1", "Cuatrim", carre);
        Materia mate2 = new Materia(63, "Laboratorio", "Cuatrim", carre);
        Materia mate3 = new Materia(71, "Java", "anual", carre);
        
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        Alumno alu = new Alumno(43, "Nombre Prueba 2", "Apellido prueba 2", new Date(), carre);
        
        control.crearAlumno(alu);
        
        System.out.println("busqueda unica "+ control.traerAlumno(43));
       
    }
}
