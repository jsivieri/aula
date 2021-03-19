package joao.cliente;

import java.net.URL;

import static joao.ExemploService.meuNome;

public class Cliente {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/exemplo?wsdl");

        ExemploServiceImplService exemploServiceImplService = new ExemploServiceImplService(url);
        ExemploService exemploService = exemploServiceImplService.getExemploServiceImplPort();

        System.out.println(exemploService.);


    }
}