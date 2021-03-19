package joao;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ExemploService {

    @WebMethod
    String nome();

}