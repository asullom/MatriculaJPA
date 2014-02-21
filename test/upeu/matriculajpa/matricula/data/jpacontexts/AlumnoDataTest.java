/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.matriculajpa.matricula.data.jpacontexts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import upeu.matriculajpa.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public class AlumnoDataTest {
    
    EntityManagerFactory emf = null;
    EntityManager em = null;
    
    
    @Before
    public void setUp() {
        this.emf = Persistence.createEntityManagerFactory("MatriculaJPAPU");
        this.em = emf.createEntityManager();
    }
    
    @After
    public void tearDown() {
        em.close();
        emf.close();
    }

    
    /**
     * Test of create method, of class AlumnoData.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Alumno alumno = new Alumno();
        alumno.setCodigo("A01");
        alumno.setNombre("Alex");
        
        AlumnoData instance = new AlumnoData(this.emf);
        Alumno result = instance.create(alumno);
        assertNotNull(result);
    }
    
}
