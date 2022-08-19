package com.nttdata.bootcamp.bank.customer.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
/**
 * Clase de tipo document para obtener o establecer los datos de cada atributo.
 */
@Data
@AllArgsConstructor
@org.springframework.data.mongodb.core.mapping.Document(collection="document_type")
public class DocumentType {
    @Id
    private String id;
    private String name;
    private String description;
    private String state;
    private String codeDocumentType;
}
