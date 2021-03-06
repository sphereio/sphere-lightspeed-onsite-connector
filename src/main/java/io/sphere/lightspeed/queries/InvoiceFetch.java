package io.sphere.lightspeed.queries;

import com.fasterxml.jackson.core.type.TypeReference;
import io.sphere.lightspeed.models.Invoice;
import io.sphere.lightspeed.models.Referenceable;

public class InvoiceFetch extends BaseModelFetch<Invoice> {

    private InvoiceFetch(final String resourceUrl) {
        super(resourceUrl, resultTypeReference());
    }

    public static TypeReference<Invoice> resultTypeReference() {
        return new TypeReference<Invoice>(){
            @Override
            public String toString() {
                return "TypeReference<Invoice>";
            }
        };
    }

    public static InvoiceFetch of(final Referenceable<Invoice> invoiceRef) {
        return new InvoiceFetch(invoiceRef.getUri());
    }
}
