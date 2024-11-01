package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${name:noreplay-DIO}")
    private String nome;
    @Value("${email}")

    private String email;
    @Value("${telefones}")

    private List<Long> telefones;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail:" + email
                + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");


    }

}
