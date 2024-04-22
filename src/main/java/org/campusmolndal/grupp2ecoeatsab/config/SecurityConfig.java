package org.campusmolndal.grupp2ecoeatsab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Konfigurera autentisering med in-memory användarlagring
        auth
                .inMemoryAuthentication()
                .withUser("användare").password("{noop}lösenord").roles("ANVÄNDARE");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Konfigurera HTTP-autorisering
        http
                .authorizeRequests()
                .antMatchers("/offentlig/**").permitAll() // Tillåt åtkomst till offentliga resurser utan autentisering
                .anyRequest().authenticated() // Alla andra förfrågningar kräver autentisering
                .and()
                .formLogin() // Aktivera formulärbaserad inloggning
                .loginPage("/inloggning") // Ange anpassad inloggningssida
                .permitAll() // Tillåt åtkomst till inloggningssidan utan autentisering
                .and()
                .logout() // Aktivera utloggning
                .permitAll(); // Tillåt åtkomst till utloggningssidan utan autentisering
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // Skapa en instans av BCryptPasswordEncoder för att kryptera lösenord
        return new BCryptPasswordEncoder();
    }
}
