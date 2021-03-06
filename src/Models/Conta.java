package Models;
/*
 * @author Gustavo e Laert
 */
public class Conta implements ContaI{
    
    protected double depositoInicial;
    protected double saldo;
    protected Cliente cliente;
    protected int numConta;
    protected String tipo;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setNumConta(int num){
        numConta = num;
    }
    
    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    
    @Override
    public Cliente getDono() {
        return cliente;
    }
    
    @Override
    public int getNumero() {
       return numConta;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public void remunera() {
    }
    
    @Override
    public boolean deposita(double valor) {
        return valor > 0;
    }
    
    @Override
    public boolean saca(double valor) {
        return valor > 0;
    }
}
