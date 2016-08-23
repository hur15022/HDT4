package hdt4;
/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022a de elementos pa
 * clase que crea los nodos
 * @param <E> generico
 */

public class DoblementeEncadenadaNodo<E>{

    /**
     * atributo utilizado para almacenar valores
     */
    protected E data;

    /**
     * se almacena la referencia al siguiente nodo
     */
    protected DoblementeEncadenadaNodo<E> nextElement;

    /**
     * se almacena la referencia al nodo anterior
     */
    protected DoblementeEncadenadaNodo<E> previousElement;

    /**
     * @param v es un valor el cual se agrega al nodo
     * @param next se ingresa como parametro la referencia al nodo siguiente
     * @param previous se ingresa como parametro la referencia al nodo anterior
     * post: este metodo crea nodos con sus valores respectivos
     */
    public DoblementeEncadenadaNodo(E v, DoblementeEncadenadaNodo<E> next, DoblementeEncadenadaNodo<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    /**
     * @param v es un parametro que entra en el metodo como valor del nodo
     * post: construye un elemento del nodo
     */
    public DoblementeEncadenadaNodo(E v)
    {
        this(v,null,null);
    }

}
