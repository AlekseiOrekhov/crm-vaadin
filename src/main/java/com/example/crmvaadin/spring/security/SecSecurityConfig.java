package com.example.crmvaadin.spring.security;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableWebSecurity
//@Configuration
//@EnableVaadin
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecSecurityConfig{
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user1 = User.withUsername("user1")
//                .password(passwordEncoder().encode("user1Pass"))
//                .roles("USER")
//                .build();
//        UserDetails user2 = User.withUsername("user2")
//                .password(passwordEncoder().encode("user2Pass"))
//                .roles("USER")
//                .build();
//        UserDetails admin = User.withUsername("admin")
//                .password(passwordEncoder().encode("adminPass"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user1, user2, admin);
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf()
//                .disable()
//                .authorizeRequests()
//                .antMatchers("/admin/**")
//                .hasRole("ADMIN")
//                .antMatchers("/anonymous*")
//                .anonymous()
//                .antMatchers("/login*")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/auth");
////                .loginProcessingUrl("/perform_login")
////                .defaultSuccessUrl("/homepage.html", true)
////                .failureUrl("/login.html?error=true")
////                .failureHandler(authenticationFailureHandler())
////                .and()
////                .logout()
////                .logoutUrl("/perform_logout")
////                .deleteCookies("JSESSIONID");
////                .logoutSuccessHandler(logoutSuccessHandler());
//        return http.build();
//        // ...
//    }
////    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http.csrf()
//                .disable()
////                .authorizeRequests()
////                .antMatchers("/admin/**")
////                .hasRole("ADMIN")
////                .antMatchers("/anonymous*")
////                .anonymous()
////                .antMatchers("/login*")
////                .permitAll()
////                .anyRequest()
////                .authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/auth");
////                .loginProcessingUrl("/perform_login")
////                .defaultSuccessUrl("/homepage.html", true)
////                .failureUrl("/login.html?error=true")
////                .failureHandler(authenticationFailureHandler())
////                .and()
////                .logout()
////                .logoutUrl("/perform_logout")
////                .deleteCookies("JSESSIONID");
////                .logoutSuccessHandler(logoutSuccessHandler());
////        return http.build();
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
////    @Override
//    public void configure(WebSecurity web) {
//        web.ignoring()
//                .antMatchers(
//                        "/favicon.ico",
//                        "/VAADIN/**",
//                        "/robots.txt",
//                        "/manifest.webmanifest",
//                        "/sw.js",
//                        "/offline-page.html",
//                        "/icons/**",
//                        "/images/**",
//                        "/frontend/**",
//                        "/webjars/**",
//                        "/h2-console/**",
//                        "/frontend-es5/**",
//                        "/frontend-es6/**",
//                        "/api/**",
//                        "/error/**");
//    }
}
