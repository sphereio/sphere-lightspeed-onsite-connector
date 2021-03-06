package io.sphere.lightspeed.client;

import java.util.function.Function;

interface LightSpeedRequest<T> {

    Function<HttpResponse, T> resultMapper();

    HttpRequestIntent httpRequestIntent();

    /**
     Checks if the response can be handled by {@link #resultMapper()}.
     @param response the http response which shall be transformed
     @return true if the http response can be consumed, false otherwise
     */
    default boolean canHandleResponse(final HttpResponse response) {
        return response.hasSuccessResponseCode() && response.getResponseBody().isPresent();
    }
}
