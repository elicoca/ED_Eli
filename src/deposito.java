
/**
 * Clase para calcular la capacidad de un depósito
 * @author Eli Coca
 * @version 2.1
 * @since Deposito 1.1
 */
public class deposito {
   
    //public static void main(String[] args) {   
    
    //}

    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;
    
    /**
     * Constructor sin parámetros auxiliar, por si se quieren pasar parámetros con valores vacíos
     * @since Deposito 1.0
     */     
    public void Deposito () {        
        //this(0,0,"");            
    } //Cierre del constructor
    
    /**
     * Constructor con los parámetros necesarios
     * @param valor_diametro float con el valor del diámetro del depósito
     * @param valor_altura float con el valor de la altura del depósito
     * @param valor_idDeposito String con el valor del id del depósito
     * @since Deposito 1.0
     */
    public void Deposito (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   
    }
    
    /**
     * Método setter para que avise en caso de valores no válidos
     * @param valor_diametro float con el valor del diámetro del depósito
     * @param valor_altura float con el valor de la altura del depósito
     * @param valor_idDeposito String con el valor del id del depósito
     * @since Deposito 1.0
     */
    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
            System.out.println("Deposito correcto");
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el depósito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un método y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     
    }

    /**
     * Método getter para acceder al parámetro Diametro
     * @return El valor del diámetro
     * @since Deposito 1.0
     */
    public float getDiametro () {
        return diametro; 
    } 
    
    /**
     * Método getter para acceder al parámetro Altura
     * @return El valor de la altura
     * @since Deposito 1.0
     */
    public float getAltura () {
        return altura; 
    } 
    
    /**
     * Método getter para acceder al parámetro Id
     * @return El valor del id
     * @since Deposito 1.0
     */
    public String getIdDeposito () {
        return idDeposito; 
    }
    
    /**
     * Método para calcular la capacidad de un depósito
     * @return La capacidad total según los parámetros de diámetro y altura
     * @since Deposito 1.0
     */
    public float valorCapacidad () {
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    
}