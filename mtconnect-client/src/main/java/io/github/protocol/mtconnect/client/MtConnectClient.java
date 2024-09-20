package io.github.protocol.mtconnect.client;

import io.github.shoothzj.http.facade.client.HttpClient;
import io.github.shoothzj.http.facade.client.HttpClientFactory;

public class MtConnectClient {
    private final MtConnectClientConfiguration config;

    private final HttpClient httpClient;

    public MtConnectClient(MtConnectClientConfiguration configuration) {
        this.config = configuration;
        this.httpClient = HttpClientFactory.createHttpClient(configuration.httpConfig());
    }
}
