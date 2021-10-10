package br.com.musication.config;

import br.com.musication.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;
}
