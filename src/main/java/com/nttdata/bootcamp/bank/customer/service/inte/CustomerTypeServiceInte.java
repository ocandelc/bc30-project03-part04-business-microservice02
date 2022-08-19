package com.nttdata.bootcamp.bank.customer.service.inte;

import com.nttdata.bootcamp.bank.customer.model.document.Customer;
import com.nttdata.bootcamp.bank.customer.model.document.CustomerType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de interface de servicio para utilizar los métodos de CRUD.
 */
public interface CustomerTypeServiceInte
{

    Mono<CustomerType> create(final CustomerType customerType);

    Flux<CustomerType> readAll();

    Mono<CustomerType> readByCodeCustomerType(String codeCustomerType);

    Mono<CustomerType> updateById(final String id, final CustomerType customerType);

    Mono<Void> deleteById(final String id);
}