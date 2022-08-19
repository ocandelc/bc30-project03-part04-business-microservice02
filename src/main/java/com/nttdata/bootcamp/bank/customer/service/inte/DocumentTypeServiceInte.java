package com.nttdata.bootcamp.bank.customer.service.inte;

import com.nttdata.bootcamp.bank.customer.model.document.DocumentType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DocumentTypeServiceInte {
    Mono<DocumentType> create(final DocumentType documentType);

    Flux<DocumentType> readAll();

    Mono<DocumentType> readByCodeDocumentType(String codeDocumentType);

    Mono<DocumentType> updateById(final String id, final DocumentType documentType);

    Mono<Void> deleteById(final String id);
}
