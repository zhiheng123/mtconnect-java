package io.github.protocol.mtconnect.server;

import io.github.shoothzj.http.facade.server.HttpServerConfig;
import lombok.Setter;

@Setter
public class MtConnectServerConfiguration {
    private String host;

    private int port;

    private HttpServerConfig httpConfig;

    public MtConnectServerConfiguration() {
    }

    public String host() {
        return host;
    }

    public int port() {
        return port;
    }

    public HttpServerConfig httpConfig() {
        return httpConfig;
    }
}
