package ut4pruebasintesisalbertogarciafdez;
/**
 *  ENTORNOS DE DESARROLLO (ETS) - ACTIVIDAD 2 (UT4)
 * @author Alberto Julio García Fernández
 */
public class Calculadora {

    private int operador1;
    private int oper2;
    private int operador;

    public int getOperador1() {
        return operador1;
    }

    public int getOperador2() {
        return oper2;
    }

    public int getOperacion() {
        return operador;
    }

    /**
     * 
     * @param operador1 Valor de tipo entero que se lee desde programa principal
     */
    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }
    
    /**
     * 
     * @param operador2 Valor de tipo entero que se lee desde programa principal
     */
    public void setOperador2(int operador2) {
        this.oper2 = operador2;
    }

    /**
     * 
     * @param operacion Valor de tipo entero que se lee desde programa principal
     */
    public void setOperacion(int operacion) {
        this.operador = operacion;
    }
    
        
}
