package com.nttdata.bootcamp.bank.customer.model.dao.inte;

import com.nttdata.bootcamp.bank.customer.model.document.Customer;
import com.nttdata.bootcamp.bank.customer.model.document.CustomerType;
import com.nttdata.bootcamp.bank.customer.model.document.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface DocumentDaoInte extends ReactiveMongoRepository<Document, String> {
    Mono<Document> readByCodeDocument(String codeDocument);
}
