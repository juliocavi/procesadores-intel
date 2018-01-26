import java.util.ArrayList;
import java.util.Iterator;
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

    /**
     * Muestra una lista con los detalles de todos los objetos Procesador.
     */
    public void mostrarCpus()
    {
        for (Procesador cpu : cpus){
            System.out.println(cpu.getDetalles());
        }
    }

    public void modificarFrecuencia(int id, int frecuencia)
    {
        int cont = 0;
        boolean encontrado = false;
        while(cont < cpus.size() && !encontrado){
            Procesador cpu = cpus.get(cont);
            if(cpu.getId() == id){
                cpu.setFrecuencia(frecuencia);
                encontrado = true;
            }
            cont++;
        }
    }
    
    public void eliminacionMedianteIterador(int ano)
    {
        Iterator<Procesador> itcpu = cpus.iterator();
        while(itcpu.hasNext()){
            if(itcpu.next().getAno() == ano){
                itcpu.remove();
            }
        }
    }
}
