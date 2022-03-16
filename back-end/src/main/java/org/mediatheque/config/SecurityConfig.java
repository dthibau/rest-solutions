package org.mediatheque.config;

import org.mediatheque.jwt.JWTConfigurer;
import org.mediatheque.jwt.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	TokenProvider tokenProvider;
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**/*.js", "/**/*.css");
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//          .antMatchers("/", "/swagger-ui.html","/swagger-ui/**","/v3/**").permitAll()
//          .antMatchers(HttpMethod.GET,"/v1/**").authenticated()
//          .antMatchers("/v1/**").hasAnyRole("ADMIN")
//          .anyRequest()
//            .authenticated()
//            .and()
//            .formLogin()
//            .and()
//            .logout();
//	}
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable() // Jeton csrf n’est plus nécessaire
				// Rien dans la session HTTP
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests() // ACLs
	          .antMatchers("/", "/swagger-ui.html","/swagger-ui/**","/v3/**","/api/authenticate").permitAll()
	          .antMatchers(HttpMethod.GET,"/v1/**").authenticated()
	          .antMatchers("/v1/**").hasAnyRole("ADMIN")
				.anyRequest().authenticated().and()
				.apply(securityConfigurerAdapter()); // Configuration JWT
	}
	
	private JWTConfigurer securityConfigurerAdapter() {
        return new JWTConfigurer(tokenProvider);
    }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}secret").roles("USER").and().withUser("admin")
				.password("{noop}secret").roles("ADMIN");
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}

}
