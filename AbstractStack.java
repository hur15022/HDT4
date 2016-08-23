package hdt4;

/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * Descripción: es la clase abstracta de Stack, crea un arrayList, agrega o elimina elementos, obtiene un valor dentro del stack, obtiene el tamaño del arreglo y verifica si el arrelgo esta vacio
 */

import java.util.ArrayList;

public abstract class AbstractStack <E> implements Stack<E>{
    
    /**
     * data es un atributo de tipo arrayList con datos genericos
     */
    protected ArrayList<E> data;
    
    /**
     * este metodo construye un arrayList con datos genericos 
     */
    public AbstractStack()
    {
    	data = new ArrayList<E>();
    }

    /**
     * agrega un valor en el arrayList
     * @param ingresa al metodo un valor de tipo generico
     */
    @Override
    public void push(E item)
    {
	data.add(item);
    }

    /**
     * pre:el stack debe tener elementos
     * @return este metodo elimina el ultimo elemento del arrayList
     */
    @Override
    public E pop()
    {
	return data.remove(size()-1);
    }

    /**
     * pre: el stack debe tener elementos
     * @return devuelve el ultimo elemento de la lista
     */
    @Override
    public E peek()
    {
	return data.get(size() - 1);
    }
	
    /**
     *
     * @return regresa la cantidad de elementos que tiene el arrayList
     */
    @Override
    public int size()
    {
    return data.size();
    }
  
    /**
     *
     * @return este metodo regresa un valor verdadero si el arreglo esta vacio
     */
    @Override
    public boolean empty()
    {
        return size() == 0;
    }
    
}
