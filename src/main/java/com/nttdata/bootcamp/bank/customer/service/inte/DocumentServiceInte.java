package com.nttdata.bootcamp.bank.customer.service.inte;

import com.nttdata.bootcamp.bank.customer.model.document.Document;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DocumentServiceInte {
    Mono<Document> create(final Document document);

    Flux<Document> readAll();

    Mono<Document> readByCodeDocument(String codeDocument);

    Mono<Document> updateById(final String id, final Document document);

    Mono<Void> deleteById(final String id);
}
