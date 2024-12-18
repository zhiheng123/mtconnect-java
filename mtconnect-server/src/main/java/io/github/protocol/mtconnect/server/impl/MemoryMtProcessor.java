package io.github.protocol.mtconnect.server.impl;

import io.github.protocol.mtconnect.api.AssetRequest;
import io.github.protocol.mtconnect.api.DeviceRequest;
import io.github.protocol.mtconnect.api.MTConnectAssets;
import io.github.protocol.mtconnect.api.MTConnectDevices;
import io.github.protocol.mtconnect.server.MTProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 * MemoryMtProcessor is a simple implementation of MtProcessor that stores all the data in memory.
 */
public class MemoryMtProcessor implements MTProcessor {

    private final Map<String, MTConnectAssets> mtConnectAssetsMap = new HashMap<>();

    private MTConnectDevices devices;

    @Override
    public MTConnectAssets asset(AssetRequest assetRequest) {
        return mtConnectAssetsMap.get(assetRequest.getId());
    }

    @Override
    public MTConnectDevices device(DeviceRequest deviceRequest) {
        return devices;
    }

    public void updateDevices(MTConnectDevices devices) {
        this.devices = devices;
    }
}
