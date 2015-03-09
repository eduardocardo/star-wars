
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final  int LETRAS_ELEGIDAS = 3;
    private String name;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
        name = "";
    }

    /**
     * Metodo que genera un nombre en funcion de los paramentros introducidos
     * @param priApe es el primer apellido real
     * @param nombre es el nombre real
     * @param priApeMadre es el primer apellido de la madre
     * @param ciudad es la ciudad donde naciste
     */
    public String generateStarWarsName(String priApe,String nombre,String priApeMadre,String ciudad)
    {
        return priApe.substring(0,LETRAS_ELEGIDAS) + nombre.substring(0,LETRAS_ELEGIDAS)
               + " " + priApeMadre.substring(0,2) + ciudad.substring(0,LETRAS_ELEGIDAS);
        
    }
}
