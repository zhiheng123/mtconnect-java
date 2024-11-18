package io.github.protocol.mtconnect.examples;

import io.github.openfacade.http.HttpClientConfig;
import io.github.protocol.mtconnect.api.MTConnectDevices;
import io.github.protocol.mtconnect.client.MTConnectClient;
import io.github.protocol.mtconnect.client.MTConnectClientConfiguration;
import io.github.protocol.mtconnect.common.XmlUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MTConnectClientExample {
    public static void main(String[] args) throws Exception {
        MTConnectClientConfiguration configuration = new MTConnectClientConfiguration();
        configuration.setHost("127.0.0.1");
        configuration.setPort(36633);

        HttpClientConfig httpClientConfig = new HttpClientConfig.Builder().build();
        configuration.setHttpConfig(httpClientConfig);
        MTConnectClient mtConnectClient = new MTConnectClient(configuration);

        MTConnectDevices devices = mtConnectClient.devices();
        log.info(XmlUtil.toXml(devices));
    }
}
