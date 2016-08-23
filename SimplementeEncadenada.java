/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022

*/
 // implementacion de lista como una lista simplemente encadenada


public abstract class SimplementeEncadenada<E>  extends AbstractList<E>{
    
    /**
     * tamano de la lista
     */
    protected int count;

    /**
     * referencia hacia el primer elemento
     */
    protected Node<E> head;

    /**
     * constructor de SimplementeEncadenada, crea una lista vacia
     */
    public SimplementeEncadenada()
    {
      head = null;
      count = 0;
    }
    
    /**
     *
     * @return la cantidad de elementos en la lista
     */
    @Override
    public int size()
    {
        return count;
    }
  
    /**
     *
     * @param value se agrega al inicio de la lista
     */
    @Override
    public void addFirst(E value)
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }
  
    /**
     * pre: la lista no debe etar vacia
     * @return el primer elemento y lo borra
     */
    @Override
    public E removeFirst()
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    /**
     * pre: la lista no debe estar vacia
     * @return el primer valor de la lista
     */
    @Override
    public E getFirst()
    {
        return head.value();
    }
  
    /**
     * pre: la lista no debe estar vacia
     * post: agrega el elemento al final de la lista
     */
    @Override
    public void addLast(E value)
    {
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }
		 
            finger.setNext(temp);
        } else head = temp;
	
	count++;
    }
   
    /**
     * pre: el valor existe
     * @param value valor a buscar
     * @return verdadero si y solo si la lista contiene ese valor
     */
    public boolean contains(E value)
    {
        Node<E> finger = head;
	  
        while (finger != null &&
             !finger.value().equals(value))
        {
          finger = finger.next();
        }
        return finger != null;
    }  
}
