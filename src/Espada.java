import java.util.Random;

public class Espada implements ArmaInterface {
    private Random sorteador = new Random();

    @Override
    public void atacar() {
        var dano = calcularDano();
        var chanceAtaqueExtra = sorteador.nextDouble();

        System.out.println("Ataque com espada: " + dano);
        if (chanceAtaqueExtra < 0.1) atacar();
    }

    private int calcularDano() {
        return sorteador.nextInt(10) + sorteador.nextInt(10) + 2;
    }
}
