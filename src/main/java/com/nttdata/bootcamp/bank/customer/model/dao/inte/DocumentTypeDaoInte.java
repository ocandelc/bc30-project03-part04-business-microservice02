package com.nttdata.bootcamp.bank.customer.model.dao.inte;

import com.nttdata.bootcamp.bank.customer.model.document.DocumentType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface DocumentTypeDaoInte extends ReactiveMongoRepository<DocumentType, String> {
    Mono<DocumentType> readByCodeDocumentType(String codeDocumentType);
}
