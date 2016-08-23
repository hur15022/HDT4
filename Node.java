/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * Descripción: funciona como nodos, a manera de referencia de elementos para las implementaciones de lista
 * @param <E> generico
 */

public class Node <E>{
    
    /**
     *En este metodo se almacenan los valores
     */
    protected E data;

    /**
     * se moviliza el puntero al otro dato
     */
    protected Node<E> nextElement;

   
    public Node(E v, Node<E> next)
    {
       data = v;
       nextElement = next;
    }

    /**
     * 
     * constructor de la nueva cola
     */
    public Node(E v)
    {
        this(v,null);
    }

    /**
     * retorna una nueva dirreccion
     */
    public Node<E> next()
    {
        return nextElement;
    }

    /**
     * @param next referencia
     * post: asigna esa referencia al siguiente elemento
     */
    public void setNext(Node<E> next)
    {
        nextElement = next;
    }

    
  

    /*
	*se asigna valor
     
     */
    public void setValue(E value)
    {
        data = value;
    }

  public E value()
    {
         return data;
    }
}
