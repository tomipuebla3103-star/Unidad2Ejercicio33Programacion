public class RenderizadorDirectX {
    boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("DirectX inicializado.");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("DirectX dibujando: " + nombreMalla);
        } else {
            System.out.println("Error: contexto no inicializado.");
        }
    }

    public void liberarRecursos() {
        inicializado = false;
        System.out.println("Recursos DirectX liberados.");
    }
}
