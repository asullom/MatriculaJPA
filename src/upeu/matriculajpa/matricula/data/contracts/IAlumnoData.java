/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.matriculajpa.matricula.data.contracts;

import upeu.matriculajpa.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public interface IAlumnoData {
    Alumno create(Alumno alumno);
}
