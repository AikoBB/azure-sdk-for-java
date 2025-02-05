// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmUnplannedFailoverInput;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmUnplannedFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmUnplannedFailoverInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageRcm\",\"performShutdown\":\"xqjsiuepm\",\"recoveryPointId\":\"fnzlpqmp\"}")
                .toObject(InMageRcmUnplannedFailoverInput.class);
        Assertions.assertEquals("xqjsiuepm", model.performShutdown());
        Assertions.assertEquals("fnzlpqmp", model.recoveryPointId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmUnplannedFailoverInput model =
            new InMageRcmUnplannedFailoverInput().withPerformShutdown("xqjsiuepm").withRecoveryPointId("fnzlpqmp");
        model = BinaryData.fromObject(model).toObject(InMageRcmUnplannedFailoverInput.class);
        Assertions.assertEquals("xqjsiuepm", model.performShutdown());
        Assertions.assertEquals("fnzlpqmp", model.recoveryPointId());
    }
}
