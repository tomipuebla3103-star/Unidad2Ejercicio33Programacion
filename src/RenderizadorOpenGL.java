public class RenderizadorOpenGL {
    boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("OpenGL inicializado.");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("OpenGL dibujando: " + nombreMalla);
        } else {
            System.out.println("Error: contexto no inicializado.");
        }
    }

    public void liberarRecursos() {
        inicializado = false;
        System.out.println("Recursos OpenGL liberados.");
    }
}
