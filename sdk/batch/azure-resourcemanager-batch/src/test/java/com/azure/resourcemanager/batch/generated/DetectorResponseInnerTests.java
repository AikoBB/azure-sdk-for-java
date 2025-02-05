// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.DetectorResponseInner;
import org.junit.jupiter.api.Assertions;

public final class DetectorResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DetectorResponseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"value\":\"xmzsbbzogg\"},\"etag\":\"rxwburv\",\"id\":\"xxjnspydptk\",\"name\":\"enkouknvudw\",\"type\":\"iukbldngkpoci\"}")
                .toObject(DetectorResponseInner.class);
        Assertions.assertEquals("xmzsbbzogg", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DetectorResponseInner model = new DetectorResponseInner().withValue("xmzsbbzogg");
        model = BinaryData.fromObject(model).toObject(DetectorResponseInner.class);
        Assertions.assertEquals("xmzsbbzogg", model.value());
    }
}
