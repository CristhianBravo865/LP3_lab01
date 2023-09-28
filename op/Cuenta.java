import java.util.*;
public class Cuenta{
    private String numero;
    private double saldo;
    private char tipoCliente='C';
    static private int C=999;
    static private int B=4999;
    static private int E=7999;
    public Cuenta(double saldo){
        char t=TipoDeCliente();
        this.tipoCliente=t;
        String num=NumeroDeCuenta(this.tipoCliente);
        this.numero=num;
        if (saldo<50){
            System.out.println("Saldo fuera del limite minimo, vuelva a ingresar el saldo");
            Scanner sc=new Scanner(System.in);
            saldo=sc.nextDouble();
            sc.close();
        }
        this.saldo=saldo;
    }

    public Cuenta(){
        char t=TipoDeCliente();
        this.tipoCliente=t;
        String num=NumeroDeCuenta(this.tipoCliente);
        this.numero=num;
        this.saldo=0;
        
    }
    public void DepositarCantidad(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    public void RetrirarCantidad(double cantidad){
        this.saldo=this.saldo-cantidad;
    }
    public char TipoDeCliente(){
        System.out.println("Ingrese el tipo de de cliente C/B/E, si ingresa un caracter invalido se le asignara como C");
        Scanner sc=new Scanner(System.in);
        char t=sc.nextLine().charAt(0);
        if (t=='B'|| t=='E'){
            return t;
        }
        else{
            return 'C';
        }
    }
    public String NumeroDeCuenta(char tipoCliente){
        if (tipoCliente=='C'){
            C+=C;
            return "C"+C;
        }
        else if(tipoCliente=='B'){
            B+=B;
            return "B"+B;
        }
        else{
            E+=E;
            return "E"+E;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String toString(){
        return "Num: "+numero+" \n Saldo: "+saldo;
    }
}
