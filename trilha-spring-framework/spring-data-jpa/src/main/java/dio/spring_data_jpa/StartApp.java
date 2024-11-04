package dio.spring_data_jpa;


import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

//        List<User> users = repository.findByNameContaining("Pedro");

//        User user = repository.findByUsername("richard32");

        List<User> users = repository.filtrarPorNome("Gildean");


        if(users.isEmpty()) throw new RuntimeException("Nenhum usuario foi encontrado!");
        for(User u: users){
            System.out.println(u);
        }
//        if(user == null) throw new RuntimeException("Nenhum usuario foi encontrado!");
//        System.out.println(user);


    }

    private void insertUser(){
        User user = new User();
        user.setName("Gildean");
        user.setUsername("gilms");
        user.setPassword("1234569");

        repository.save(user);

        for (User u: repository.findAll()){
            System.out.println(u);
        }

    }

}
