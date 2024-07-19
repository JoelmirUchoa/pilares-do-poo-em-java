public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("87654321");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("12345678");
        //z400.ligar();

        //Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação.
        Veiculo coringa = z400;//ou jeep;
        coringa.ligar();
    }
}
