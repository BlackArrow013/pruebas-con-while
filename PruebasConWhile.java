
/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasConWhile
{    
    /**
     * Imprime por pantalla todos los múltiplos de cinco entre 10 y 95.
     */
    public void multiplosDeCinco()
    {
        int contador = 10;
        while (contador <= 95) {
            System.out.println(contador);
            contador += 5;
        }
    }
    
    /**
     * Imprime por pantalla la suma de todos los valores entre 1 y 10.
     */
    public void sumaDeDiezNumeros()
    {
        int suma = 1;
        int contador = 1;
        while (contador <= 10) {
            suma += contador;
            contador++;
        }
        System.out.println(suma);
    }
}
