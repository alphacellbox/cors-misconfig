package cellboxowasp.corsmisconfig.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("select email,password,enabled from users where email=?")
                .authoritiesByUsernameQuery("select email,roles from authorities where email=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/users/register","/index", "/css/**", "/js/**", "/img/**")
                .permitAll()
//                .antMatchers("/users/**","/categories/**")
//                .hasAuthority("ADMIN")
//                .antMatchers("/posts/**")
//                .hasAnyAuthority("ADMIN","USER")
                .anyRequest().authenticated()
                .and().formLogin()
                .loginPage("/login").usernameParameter("email")
                .permitAll().and().logout().logoutSuccessUrl("/").permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/403");
    }
}
