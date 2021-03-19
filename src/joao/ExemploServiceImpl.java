package joao;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "joao.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public String nome() {
        final String s = "João Marcos";
        return s;
    }


}