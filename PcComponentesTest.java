

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
        PcComponentes pcCompon1 = new PcComponentes();
        pcCompon1.addProcesador("i7 7700", 5000, 2016);
        pcCompon1.addProcesador("i5 6400", 3300, 2015);
        pcCompon1.addProcesador("i3 4100", 2700, 2014);
        pcCompon1.addProcesador("i7 8600", 4500, 2017);
        pcCompon1.addProcesador("i5 6500", 3700, 2016);
        pcCompon1.mostrarCpus();
        pcCompon1.modificarFrecuencia(2, 4000);
        pcCompon1.modificarFrecuencia(4, 4000);
        pcCompon1.eliminacionMedianteIterador(2016);
        pcCompon1.mostrarCpus();
    }
}

