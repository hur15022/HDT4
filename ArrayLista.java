package hdt4;

/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * Descripción: este metodo utiliza un stack de tipo arrayList, crea el arrayList, elimina, agrega o toma elementos del arreglo
 */
import java.util.ArrayList;

public class ArrayLista<E> extends AbstractStack<E>{
    
    /**
     *crea un atributo de tipo arrayList con datos genericos
     */
    protected ArrayList<E> data;

    /**
     * instacia el atributo data como un nuevo arrayList
     */
    public ArrayLista()
    {
    	data = new ArrayList<E>();
    }

    /**
     * post: se agrega un elemento en el arrayList en la ultima posicion
     * @param entra un elemento de tipo generico, que es el dato que se agrega
     */
    @Override
    public void push(E item)
    {
    	data.add(item);
    }

    /**
     * pre: el arrayList debe tener elementos
     * @return borra el ultimo elemento del stack
     */
    @Override
    public E pop()
    {
    	return data.remove(size()-1);
    }

    /**
     * pre: el Stack debe tener elementos
     * @return retorna el ultimo elemento del arrayList
     */
    @Override
    public E peek()

    {
    	return data.get(size() - 1);
    }

    /**
     *
     * @return indica la cantidad de elementos que posee el arrayList
     */
    @Override
    public int size()
    {
    	return data.size();
    }
  
    /**
     *
     * @return si el arrayList esta vacio devuelve un valor verdadero
     */
    @Override
    public boolean empty()
    {
    	return size() == 0;
    }
}