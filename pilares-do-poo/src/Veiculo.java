       //Abstração
public abstract class Veiculo {
    //Herança: Características e comportamentos comuns, podem ser compartilhados através de uma hierarquia de objetos.
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    //Abstração: quando mais de uma classe precisa ter a mesma função
    public abstract void ligar();
    //carro e moto será obrigado ter o método ligar.
    /*public void ligar() {
        System.out.println("");
    }*/
}
