import java.util.ArrayList;

/**
 * Guarda objetos de la clase Procesadores.
 *
 * @autor (Julio)
 * @versión (Date: 24/01/2018)
 */
public class PcComponentes
{
    //ArrayList de procesadores
    private ArrayList<Procesador> cpus;
    private int id;
    /**
     * Constructor de objetos de la clase PcComponentes.
     */
    public PcComponentes()
    {
        cpus = new ArrayList<Procesador>();
        id = 0;
    }

    /**
     * Añadir un nuevo objeto, 
     * cuyas caracteristicas son introducidas por parámetros.
     *
     * @param modelo, String para el modelo del procesador
     * @param frecuencia, entero para la frecuencia del procesador
     * @param ano, entero para el año del procesador
     */
    public void addProcesador(String modelo, int frecuencia, int ano)
    {
        id++;
        cpus.add(new Procesador(modelo,frecuencia,ano,id));
    }
    
}
