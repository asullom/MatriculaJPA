/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.matriculajpa.matricula.data.jpacontexts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import upeu.matriculajpa.matricula.data.contracts.IAlumnoData;
import upeu.matriculajpa.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public class AlumnoData implements IAlumnoData {
    
    public AlumnoData(EntityManagerFactory emf){
        this.emf=emf;
        
    }
    //session de jpa
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    @Override
    public Alumno create(Alumno alumno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);//guardando el nuevo
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return alumno;
    }
    
    
    
}
