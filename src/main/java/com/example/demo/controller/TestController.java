package com.example.demo.controller;

import org.bson.Document;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestController {

    public Mono<ServerResponse> testMethod(ServerRequest request) {
        List<Document> docsList = new ArrayList<>();
        docsList.add(new Document("Hello", "World"));
        Flux<Document> docs = Flux.fromIterable(docsList);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(docs, Document.class);
    }

}
