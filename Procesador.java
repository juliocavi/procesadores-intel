
/**
 * Clase que almacenara el modelo, la frecuencia y el año de salida 
 * de procesadores Intel. 
 *
 * @autor (Julio)
 * @versión (24/01/2018)
 */
public class Procesador
{
    //Modelo del procesador.
    private String modelo;
    //Frecuencia del procesador.
    private int frecuencia;
    //Año de salida del procesador.
    private int ano;
    
    /**
     * Constructor para objetos de clase Peocesador
     */
    public Procesador()
    {
        modelo = "";
        frecuencia = 0 ;
        ano = 0;
    }

    /**
     * Devuelve todos los datos de un procesador en un solo String.
     * 
     * @return todos los detalles del procesador.
     */
    public String getDetalles()
    {
        String detalles = "Intel Core " + modelo 
        + " - Frecuencia: " + frecuencia + " MHz"
        + " - Año: " + ano;
        return detalles;
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
}
