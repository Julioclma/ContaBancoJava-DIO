public class Conta {
    private Integer numero;
    private String agencia;
    private String nome;
    private Double saldo;

    public Conta(Integer numero, String agencia, String nome, Double saldo)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }
    public String getNome(){
        return this.nome;
    }
    public Double getSaldo(){
        return this.saldo;
    }


    public void getInfoAccount() {
        System.out.println("Olá "+this.getNome()+"," +
                " obrigado por criar uma conta em nosso banco," +
                        " sua agência é "+this.getAgencia()+", " +
                        "conta "+this.getNumero()+" e seu saldo "+this.getSaldo()+" já está disponível para saque");
    }
}
