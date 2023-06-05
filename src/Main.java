public class Main {
    public static void main(String[] args) {
        var guerreiro = new Guerreiro(new Espada());
        System.out.println("--- Espada ---");
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        
        System.out.println("--- Machado ---");
        guerreiro.setArma(new Machado());
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        
        System.out.println("--- Martelo ---");
        guerreiro.setArma(new Martelo());
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        
        System.out.println("--- Cajado do acaso ---");
        guerreiro.setArma(new CajadoDoAcaso());
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
    }
}
