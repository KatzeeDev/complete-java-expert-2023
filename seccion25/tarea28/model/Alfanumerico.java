package seccion25.tarea28.model;

public class Alfanumerico implements Runnable {

    private Tipo tipo;

    public Alfanumerico(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 1; i < 10; i++) {
                System.out.println("Tipo Numero: " + i);
            }
        } else if (tipo == Tipo.LETRA) {
            char a;
            for (a = 'A'; a <= 'Z'; ++a)
                System.out.println("Tipo Letra: " + a);
        }
    }
}
