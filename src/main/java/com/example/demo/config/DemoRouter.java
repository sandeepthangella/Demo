package com.example.demo.config;


import com.example.demo.controller.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class DemoRouter {

    @Bean
    public RouterFunction<ServerResponse> routeTest(TestController testController) {
        return RouterFunctions
                .route(RequestPredicates.GET("/test")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                        testController::testMethod);

    }

}
