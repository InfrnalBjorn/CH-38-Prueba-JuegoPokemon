public class App {

    public static void main(String args[]) {
        int ataqueJigglypuff;
        int ataquePikachu;
        String ganador;
        int turno;
        int vidaJigglypuff;
        int vidaPikachu;

        // Asignamos la cantidad de vida para ambos pokémones
        vidaPikachu = 100;
        vidaJigglypuff = 100;

        // Se define el turno aleatoriamente
        // 0 para Pikachu
        // 1 para Jigglypuff
        turno = (int) (Math.random() * 2);

        // Entramos en el ciclo
        System.out.println("Vida de Pikachu: " + vidaPikachu + " HP");
        System.out.println("Vida de Jigglypuff: " + vidaJigglypuff + " HP");

        while (vidaPikachu >= 0 && vidaJigglypuff >= 0) {
            // Asignamos la cantidad de ataque que tendrá cada pokémon
            ataquePikachu = (int) (Math.random() * 56);
            ataqueJigglypuff = (int) (Math.random() * 46);

            if (turno == 1) {
                System.out.println("\nTurno: Jigglypuff");
                System.out.println("La vida actual de Pikachu: " + vidaPikachu + " HP");
                vidaPikachu -= ataqueJigglypuff;
                System.out.println("Ataque de Jigglypuff: -" + ataqueJigglypuff);
                System.out.println("Vida de Pikachu restante: " + vidaPikachu + " HP");
                turno = 0;
            } else {
                System.out.println("\nTurno: Pikachu");
                System.out.println("La vida actual de Jigglypuff: " + vidaJigglypuff + " HP");
                vidaJigglypuff -= ataquePikachu;
                System.out.println("Ataque de Pikachu: -" + ataquePikachu);
                System.out.println("Vida de Jigglypuff restante: " + vidaJigglypuff + " HP");
                turno = 1;
            }
        }

        if (vidaPikachu <= 0) {
            ganador = "El ganador es Jigglypuff";
        } else {
            ganador = "El ganador es Pikachu";
        }

        System.out.println("\n" + ganador);
    }
}