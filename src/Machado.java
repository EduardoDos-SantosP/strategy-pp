import java.util.Random;

public class Machado implements ArmaInterface {
    @Override
    public void atacar() {
        var sorteador = new Random();
        var dano = 0;
        for (var i = 0; i < 4; i++) 
            dano += sorteador.nextInt(6) + 1;
        System.out.println("Ataque com machado: " + dano);
    }
}
