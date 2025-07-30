package alessiopanconi.u5w3d3.Es1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Date dataDiNascita = new Date(104,11,13);
        Info newInfo = new Info("Panconi",dataDiNascita,"Alessio");

        InfoAdapter newInfoAdapter = new InfoAdapter(newInfo);
        UserData newUserdata = new UserData();

        newUserdata.getData(newInfoAdapter);

        System.out.println(newUserdata);
    }
}