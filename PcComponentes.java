import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
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
    public PcComponentes(String archivo)
    {
        cpus = new ArrayList<Procesador>();
        id = 0;
        try{
            File file = new File(archivo);
            Scanner scf = new Scanner(file);
            while(scf.hasNextLine()){
                String[] elementos = scf.nextLine().split(" # ");
                id++;
                Procesador procesador = new Procesador(elementos[0], elementos[1], Integer.parseInt(elementos[2]), Integer.parseInt(elementos[3]), id);
                cpus.add(procesador);
            }
            scf.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
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

    public void ordenarPorAno()
    {
        String cpusOrdenados = "";
        for(int i=0; i<cpus.size()-1; i++){
            int anoMayor = cpus.get(i).getAno();
            int posicionAnoMayor = i;
            for(int j=i+1; j<cpus.size(); j++){
                if(cpus.get(j).getAno() >= anoMayor){
                    anoMayor = cpus.get(j).getAno();
                    posicionAnoMayor = j;
                }
            }
            if(posicionAnoMayor !=i){
                Procesador cpuMasALaIzquierda = cpus.get(i);
                cpus.set(i, cpus.get(posicionAnoMayor));
                cpus.set(posicionAnoMayor, cpuMasALaIzquierda);
            }
        }
        for (Procesador cpu : cpus){
            System.out.println(cpu.getDetalles());
        }
    }
    
    public void ordenarPorFrecuencia()
    {
        String cpusOrdenados = "";
        for(int i=0; i<cpus.size()-1; i++){
            int frecuenciaMayor = cpus.get(i).getFrecuencia();
            int posicionFrecuenciaMayor = i;
            for(int j=i+1; j<cpus.size(); j++){
                if(cpus.get(j).getFrecuencia() >= frecuenciaMayor){
                    frecuenciaMayor = cpus.get(j).getFrecuencia();
                    posicionFrecuenciaMayor = j;
                }
            }
            if(posicionFrecuenciaMayor !=i){
                Procesador cpuMasALaIzquierda = cpus.get(i);
                cpus.set(i, cpus.get(posicionFrecuenciaMayor));
                cpus.set(posicionFrecuenciaMayor, cpuMasALaIzquierda);
            }
        }
        for (Procesador cpu : cpus){
            System.out.println(cpu.getDetalles());
        }
    }
}