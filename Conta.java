public class Conta {
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    private Data dataAbertura;

    // Construtor padrão (sem argumentos)
    public Conta() {
        this.titular = "Titular não especificado";
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0.0;
        this.dataAbertura = new Data(1, 1, 2000); // Data padrão (01/01/2000)
    }

    // Construtor que aceita o nome do titular
    public Conta(String titular) {
        this.titular = titular;
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0.0;
        this.dataAbertura = new Data(1, 1, 2000); // Data padrão (01/01/2000)
    }

    // Construtor completo
    public Conta(String titular, int numero, int agencia, double saldoInicial, Data dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.dataAbertura = dataAbertura;
    }

    // Métodos getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    // Métodos
    public boolean saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double calculaRendimento(double taxa) {
        return saldo * taxa;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Número: " + numero + ", Agência: " + agencia + ", Saldo: " + saldo +
                ", Data de Abertura: " + dataAbertura;
    }
}
