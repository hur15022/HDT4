package hdt4;
/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * esta clase implementa una lista doblemente enlazada
 * @param <E> generico
 */

public abstract class DoblementeEncadenada<E> extends AbstractList<E>{

    /**
     * este atributo almacena un contador
     */
    protected int count;

    /**
     * este atributo almacena el primer elemento del nodo
     */
    protected DoblementeEncadenadaNodo<E> head;

    /**
     * este atributo almacena el ultimo elemento del nodo
     */
    protected DoblementeEncadenadaNodo<E> tail;

    /**
     * se crea una lista vacia con el primer y ultimo elemento vacio
     */
    public DoblementeEncadenada()
    {
        head = null;
        tail = null;
        count = 0;
    }


    /**
     * pre:  la lista debe tener elementos
     * @param value ingresa el valor que se quiere guardar
     * se asigna el elemento en el principio de la lista
     */
    @Override
    public void addFirst(E value)
    {
        // se construye un nuevo elemento
        head = new DoblementeEncadenadaNodo<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    /**
     *metodo que agrega un valor al final de la lista
     * @param value el valor se agrega al final de la lista
     */
    @Override
    public void addLast(E value)
    {
        // se crea un nuevo elemento al final de la lista
        tail = new DoblementeEncadenadaNodo<E>(value, null, tail);
        if (head == null) head = tail;
        count++;
    }
    /**
     * pre: la lista debe tener elementos
     * @return se busca el ultimo elemento de la lista y es eliminado
     */
    @Override
    public E removeLast()
    {
        DoblementeEncadenadaNodo<E> temp = tail;
        tail = tail.previousElement;
        if (tail == null) {
            head = null;
        } else {
            tail.nextElement = null;
        }
        count--;
        return temp.data;
    }
}