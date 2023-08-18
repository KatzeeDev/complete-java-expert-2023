package seccion31;

import seccion31.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {

    public static void main(String[] args) {

        Componente gabinete = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente de poder 750w");
        Componente placaMadre = new Componente("Motherboard Asus Rog x570");
        Componente cpu = new Componente("Cpu AMD Ryzen 7 3700x");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente videoCard = new Componente("Rtx 3090");
        Componente gpu = new Componente("Nvidia GPU Rtx");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32 GB");
        Componente ssd = new Componente("Disco SSD 2tb");

        cpu.addComponente(ventilador)
                .addComponente(disipador);

        videoCard.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);

        placaMadre.addComponente(cpu)
                .addComponente(videoCard)
                .addComponente(ssd)
                .addComponente(ram);

        gabinete.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        metodoRecursivoJava8(gabinete, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }

    // Metodo Utilizando Java 8
    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));

    }

    // Metodo sin utilizar Java 8
    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijos()) {
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }

}
