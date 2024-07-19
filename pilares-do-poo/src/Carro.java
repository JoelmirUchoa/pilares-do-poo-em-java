                  //extends para a funcao herança funcionar
public class Carro  extends Veiculo {
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
    //Nem tudo precisa estar visível,Encapsulamento: esconder ação que só vai estar visível dentro da própria classe
    private void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }
    private void confereCambio() {
        System.out.println("conferindo cambio em P");
    }
}
