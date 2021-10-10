package br.com.musication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusicationApplication {

    public static void main( String[] args ) {
        SpringApplication.run( MusicationApplication.class, args );
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
