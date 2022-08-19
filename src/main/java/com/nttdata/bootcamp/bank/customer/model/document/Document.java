package com.nttdata.bootcamp.bank.customer.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@org.springframework.data.mongodb.core.mapping.Document(collection="document")
public class Document {
    @Id
    private String id;
    private String state;
    private String codeDocumentType;
    private String codeClient;
    private String codeDocument;
    private String number;
}
