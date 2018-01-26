

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PcComponentesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PcComponentesTest
{
    /**
     * Default constructor for test class PcComponentesTest
     */
    public PcComponentesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void tests()
    {
        System.out.println("Creamos un nuevo objeto PcComponentes.");
        PcComponentes pcCompon1 = new PcComponentes();
        System.out.println("###############################################");
        System.out.println("Añadimos unos cuantos procesadores.");
        pcCompon1.addProcesador("i7 7700", 5000, 2016);
        pcCompon1.addProcesador("i5 6400", 3300, 2015);
        pcCompon1.addProcesador("i3 4100", 2700, 2014);
        pcCompon1.addProcesador("i7 8600", 4500, 2017);
        pcCompon1.addProcesador("i5 6500", 3700, 2016);
        System.out.println("###############################################");
        System.out.println("Mostramos la lista de estos.");
        pcCompon1.mostrarCpus();
        System.out.println("###############################################");
        System.out.println("Modificamos la frecuencia de los procesadores según su id.");
        pcCompon1.modificarFrecuencia(2, 4000);
        pcCompon1.modificarFrecuencia(4, 4000);
        System.out.println("###############################################");
        System.out.println("Eliminamos los procesadores filtrados por año.");
        pcCompon1.eliminacionMedianteIterador(2016);
        System.out.println("###############################################");
        System.out.println("Mostramos los procesadores.");
        pcCompon1.mostrarCpus();
    }
}

