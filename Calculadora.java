package hdt4;
/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022
 * Esta clase es la encargada de realizar las operacion de la calculadora, debe trabajar en cualquiera de los formatos que elija el usuario
 */
public class Calculadora {
    
   
    /**
     * la clase se instancia asi misma
     */
    private static final Calculadora singleton = new Calculadora();

    /**
     * se crea el constructor 
     */
    private Calculadora() {
    }
    
    /**
     * se crea una unica instancia
     */
    public static Calculadora getInstance() {
        return singleton;
    }

    /**
     * se utiliza un atribut pila para utilizar la clas abstract Factory
     */
    Stack pila;
    
    public void setPila(Stack factoryResult){
        pila = factoryResult;
    }
    
    /**
     * este metodo se encarga de leer, analizar y realizar las operaciones que se encuentran en el archivo
     * @param readItem entra en el metodo una cadena string, la cual posee el texto dentro del txt
     * @return regresa el resultado de las operaciones.
     */
    public int evaluar(String readItem){
        String caracter, variableS; //estas son variables temporales utilizadas para guardar el caracter siguiente del que se tiene y el resultado de las operaciones anteriores, respectivamente
        int cantidadE = 0; // esta variable es el tamaño del stack, y sirve como contador
        int variable = 0; // esta varibale es el resultado de las operaciones, varia despues de cada operacion
        int temp = 0; // esta variable contendra el operando
        //este ciclo toma cada caracter, y dependiendo de este procede
        for(int i = 0; i < readItem.length(); i++){
            caracter = Character.toString(readItem.charAt(i)); //aqui se obtiene el caracter y se guarda temporalmente para poder realizar una operacion
            //con el siguiente condicional se identifica si este es un numero
            if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9")){
                pila.push(caracter); //se coloca el caracter en la pola
            // si la condicion anterior no se cumple, se compara si el caracter es un signo de suma 
            }else if(caracter.equals("+")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                //este ciclo obtiene el valor del stack y lo suma con uno temporal
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp + variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);// se coloca el resultado de la suma en el stack
            // si la condicion anterior no se cumple, se compara si el caracter es un signo de resta
            }else if(caracter.equals("-")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                //este ciclo obtiene el valor del stack y lo resta con uno temporal
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp - variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);// se coloca el resultado de la resta en el stack
            // si la condicion anterior no se cumple, se compara si el caracter es un signo de multiplicacion
            }else if(caracter.equals("*")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                //este ciclo obtiene el valor del stack y lo multiplica con uno temporal
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp * variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);// se coloca el resultado de la multiplicacion en el stack
            // si la condicion anterior no se cumple, se compara si el caracter es un signo de division
            }else if(caracter.equals("/")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                //este ciclo obtiene el valor del stack y lo divide con uno temporal
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop()) / variable;
                }
                variableS = Integer.toString(temp);
                pila.push(variableS);// se coloca el resultado de la multiplicacion en el stack
            }
        }
        // retorna el valor final de las operaciones ya realizadas
        return Integer.parseInt((String) pila.pop());
    }
    
}
