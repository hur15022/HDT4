package hdt4;

/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * Descripción: esta clase es el abstracto de List que implementa List, revisa si una lista esta vacia o tiene elementos
 * @param <E> generico
 */

public abstract class AbstractList <E> implements List<E>{
    
    /**
     * Este es el Constructor
     */
    public AbstractList()
    {
    }

    /**
     *
     * @return este metodo regresa un valor verdadero si la lista esta vacia
     */
    @Override
    public boolean isEmpty()
    {
       return size() == 0;
    }
  
    /**
     * @param value es un valor existente en la lista
     * @return el metodo regresa un valor verdadero si el valor previamente ingresado esta dentro de la lista
     */
    @Override
    public boolean contains(E value)
    {
	return -1 != indexOf(value);
    }
}
