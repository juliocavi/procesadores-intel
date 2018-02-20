
/**
 * Clase que almacenara el modelo, la frecuencia y el año de salida 
 * de procesadores Intel. 
 *
 * @autor (Julio)
 * @versión (Date: 24/01/2018)
 */
public class Procesador
{
    //Gama del procesador.
    private String gama;
    //Modelo del procesador.
    private String modelo;
    //Frecuencia del procesador.
    private int frecuencia;
    //Año de salida del procesador.
    private int ano;
    //Identificador único de cada objeto de la clase Procesador. 
    private int id;
    
    
    /**
     * Constructor para objetos de clase Peocesador.
     */
    public Procesador(String gama, String modelo, int frecuencia, int ano, int id)
    {
        this.gama = gama;
        this.modelo = modelo;
        this.frecuencia = frecuencia;
        this.ano = ano;
        this.id = id;
    }

    /**
     * Devuelve todos los datos de un procesador en un solo String.
     * 
     * @return todos los detalles del procesador.
     */
    public String getDetalles()
    {
        String detalles = "Intel Core " + gama + " - " + modelo 
        + " - Frecuencia: " + frecuencia + " MHz"
        + " - Año: " + ano;
        return detalles;
    }
    
    /**
     * Devolver la gama del procesador.
     * 
     * @return la gama del procesador.
     */
    public String getGama()
    {
        return gama;
    }
    
    /**
     * Cambiar la gama del procesador.
     *
     * @parametro gama  es una cadena de caracteres 
     * que indica la nueva gama de procesador.
     */
    public void setGama(String gama)
    {
        this.gama = gama;
    }
    
    /**
     * Devolver el modelo del procesador.
     * 
     * @return el modelo del procesador.
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Cambiar el modelo del procesador.
     *
     * @parametro modelo  es una cadena de caracteres 
     * que indica el nuevo modelo de procesador.
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    /**
     * Devolver la frecuencia del procesador.
     * 
     * @return la frecuencia del procesador.
     */
    public int getFrecuencia()
    {
        return frecuencia;
    }
    
    /**
     * Cambiar la frecuencia del procesador.
     *
     * @parametro frecuencia es un entero 
     * que indida la nueva frecuencia del procesador.
     */
    public void setFrecuencia(int frecuencia)
    {
        this.frecuencia = frecuencia;
    }
    
    /**
     * Devolver el año de salida del procesador.
     * 
     * @return el año de salida del procesador.
     */
    public int getAno()
    {
        return ano;
    }
    
    /**
     * Cambiar el año del procesador.
     *
     * @parametro ano es un entero 
     * que indida el nuevo año del procesador.
     */
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getId()
    {
        return id;
    }
}