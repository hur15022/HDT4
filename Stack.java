/**
 * Universidad del Valle de Guatemala
 * @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 */
 //  interfaz par las implementaciones del stack


public interface Stack <E>{
    
    // el elemento se agrega al final del stack
    public void push(E item);
   
   // retorna la cantidad de datos en el stack
    public int size();

    public E pop();
   // se retorna el ultimo valor
    public E peek();
   
    // este metodo sirve si el sack esta vacio
    public boolean empty();
   
    
    
}
