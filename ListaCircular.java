/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022

 */
// implementa una lista de enlazado circular

public abstract class ListaCircular<E> extends AbstractList<E>{
    
    // guarda la referencia al otro elemento
    protected Node<E> tail; 

   // guarda el tamaño de la lista
    protected int count;

    // constructor
    public ListaCircular()
    {
        tail = null;
        count = 0;
    }

    // se agrega al inicio de la lista
    @Override
    public void addFirst(E value)
    {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }




   // elimina el ultimo dato en la lista
    @Override
    public E removeLast()
    {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        Node<E> temp = tail;
        if (finger == tail)
        {   
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    // se agrega en la lista

    public void addLast(E value)
    {
        addFirst(value);
        tail = tail.next();
    }

    
}
