package io.github.protocol.mtconnect.server.impl;

import io.github.protocol.mtconnect.api.AssetRequest;
import io.github.protocol.mtconnect.api.DeviceRequest;
import io.github.protocol.mtconnect.api.MTConnectAssets;
import io.github.protocol.mtconnect.api.MTConnectDevices;
import io.github.protocol.mtconnect.server.MTProcessor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IoTDAMtProcessor implements MTProcessor {
    private String ak;

    private String sk;
    private String projectId;
    private String endpoint;

    public IoTDAMtProcessor(String ak, String sk, String projectId, String endpoint) {
        this.ak = ak;
        this.sk = sk;
        this.projectId = projectId;
        this.endpoint = endpoint;
    }

    @Override
    public MTConnectAssets asset(AssetRequest assetRequest) {
        return null;
    }

    @Override
    public MTConnectDevices device(DeviceRequest deviceRequest) {
        return null;
    }

    public static class Builder {
        private final IoTDAMtProcessor ioTDAMtProcessor = new IoTDAMtProcessor();

        public Builder setAk(String ak) {
            ioTDAMtProcessor.ak = ak;
            return this;
        }
        public Builder setSk(String sk) {
            ioTDAMtProcessor.sk = sk;
            return this;
        }

        public Builder setProjectId(String projectId) {
            ioTDAMtProcessor.projectId = projectId;
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            ioTDAMtProcessor.endpoint = endpoint;
            return this;
        }

        public IoTDAMtProcessor build(){
            return ioTDAMtProcessor;
        }
    }
}
