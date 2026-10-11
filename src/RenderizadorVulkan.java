public class RenderizadorVulkan {

    boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("Vulkan inicializado.");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("Vulkan dibujando: " + nombreMalla);
        } else {
            System.out.println("Error: contexto no inicializado.");
        }
    }

    public void liberarRecursos() {
        inicializado = false;
        System.out.println("Recursos Vulkan liberados.");
    }
}
