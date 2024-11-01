package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.swing.*;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreplay@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;

    }



}
