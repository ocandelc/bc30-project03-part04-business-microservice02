package com.nttdata.bootcamp.bank.customer.service.inte;

import com.nttdata.bootcamp.bank.customer.model.document.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de interface de servicio para utilizar los métodos de CRUD.
 */
public interface CustomerServiceInte
{

    Mono<Customer> create(final Customer customer);

    Flux<Customer> readAll();

    Mono<Customer> readByCodeCustomer(String codeCustomer);

    Mono<Customer> updateById(final String id, final Customer customer);

    Mono<Void> deleteById(final String id);
}