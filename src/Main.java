//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RenderizadorOpenGL opengl = new RenderizadorOpenGL();

    opengl.inicializarContexto();
    opengl.dibujarMalla("Personaje");
    opengl.dibujarMalla("Escenario");
    opengl.liberarRecursos();

    System.out.println("-------------------");

    RenderizadorDirectX directx = new RenderizadorDirectX();

    directx.inicializarContexto();
    directx.dibujarMalla("Personaje");
    directx.dibujarMalla("Escenario");
    directx.liberarRecursos();

    System.out.println("-------------------");

    RenderizadorVulkan vulkan = new RenderizadorVulkan();

    vulkan.inicializarContexto();
    vulkan.dibujarMalla("Personaje");
    vulkan.dibujarMalla("Escenario");
    vulkan.liberarRecursos();
}
