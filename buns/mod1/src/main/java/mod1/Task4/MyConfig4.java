package mod1.Task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig4 {

    @Bean
    public Pet4 DogBean() {
        return new Dog4();
    }

    @Bean
    public Person4 PersonBean() {
        return new Person4(DogBean());
    }
}
