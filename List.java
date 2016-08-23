package hdt4;
/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * es la interfaz de lista 
 * @param <E> generico
 */

public interface List <E> {
    
    /**
     * @return el tamano de una lista
     */
    public int size();

    /**
     * @return es verdadero si el arreglo esta vacio
     */
    public boolean isEmpty();

    /**
     * borra los elementos de la lista
     */
    public void clear();

    /**
     * @param value se agrega un valor al inicio de la lista
     */
    public void addFirst(E value);

    /**
     * @param value se agrega un elemento al final de la lista
     */
    public void addLast(E value);

    /**
     * pre: la lista debe tener elementos
     * @return regresa el primer valor de la lista
     */
    public E getFirst();

    /**
     * pre: deben encontrarse elementos en la lista
     * @return se regresa el ultimo elemento de la lista
     */
    public E getLast();

    /**
     * pre: la lista debe tener elementos
     * @return borra el primer elemento de la lista
     */
    public E removeFirst();

    /**
     * pre: la lista debe tener elementos
     * @return borra el ultimo elemento de la lista
     */
    public E removeLast();

    /**
     * @param value entra un valor como parametro
     * @return el valor que entra como parametro es removido de la list
     */
    public E remove(E value);

    /**
     * @param value se agraga un valor a la lista
     */
    public void add(E value);

    /**
     * pre: la lista debe tener elementos
     * @return remueve el ultimo valor de la lista
     */
    public E remove();

    /**
     * pre: la lista debe tener elementos
     * @return obtiene el ultimo elemento de la lista
     */
    public E get();

    /**
     * pre: existe el elemento correspondiente en la lista
     * @param value este parametro es el valor que se desea buscar dentro de la lista
     * @return se regresa un valor verdadero si el valor existe en la lista
     */
    public boolean contains(E value);

    /**
     * pre: existe el elemento correspondiente en la lista
     * @param value es el valor que se quiere buscar
     * @return se regresa la posicion del valor buscado
     */
    public int indexOf(E value);

    /**
     * pre: existe el elemento correspondiente en la lista
     * @param value
     * @return se regresa -1 si el valor no existe
     */
    public int lastIndexOf(E value);

    /**
     * pre: la posicion no excede el largo de la lista
     * @param i entra como parametro una posicion
     * @return se regresa el elemento en la posicion indicada
     */
    public E get(int i);

    /**
     * pre: la posicion no excede el largo de la lista
     * @param i ingresa como parametro la posicion de un elemento
     * @param o ingresa como parametro el elemento de la lista
     * set: se realiza un set del valor en la posicion
     * @return se regresa el valor en esa posicion
     */
    public E set(int i, E o);

    /**
     * @param i entra como parametro una posicion
     * @param o entra como parametro un elemento 
     * set: se coloca el valor en la posicion indicada
     */
    public void add(int i, E o);

    /**
     * @param i se ingresa como parametro la posicion
     * @return se elimina el valor que se encuentra en esa posicion
     */
    public E remove(int i); 
}
