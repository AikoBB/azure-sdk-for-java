// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.ReplicaInner;
import com.azure.resourcemanager.signalr.models.ReplicaList;
import com.azure.resourcemanager.signalr.models.ResourceSku;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ReplicaListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"zdwlvwlyoupfgfb\",\"tier\":\"Basic\",\"size\":\"dyhgkfminsg\",\"family\":\"zfttsttktlahb\",\"capacity\":520028629},\"properties\":{\"provisioningState\":\"Failed\"},\"location\":\"zukxitmmqtgqq\",\"tags\":{\"isavok\":\"rnxrxcpj\",\"azivjlfrqttbajl\":\"dzf\"},\"id\":\"atnwxyiopi\",\"name\":\"kqqfk\",\"type\":\"vscx\"},{\"sku\":{\"name\":\"mligov\",\"tier\":\"Premium\",\"size\":\"kpmloa\",\"family\":\"ruocbgo\",\"capacity\":1644940787},\"properties\":{\"provisioningState\":\"Canceled\"},\"location\":\"bfhjxakvvjgsl\",\"tags\":{\"yw\":\"il\",\"gkxnyedabg\":\"t\"},\"id\":\"vudtjuewbcihx\",\"name\":\"uwhcjyxccybv\",\"type\":\"ayakkudzpx\"}],\"nextLink\":\"jplmagstcy\"}")
                .toObject(ReplicaList.class);
        Assertions.assertEquals("zukxitmmqtgqq", model.value().get(0).location());
        Assertions.assertEquals("rnxrxcpj", model.value().get(0).tags().get("isavok"));
        Assertions.assertEquals("zdwlvwlyoupfgfb", model.value().get(0).sku().name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals(520028629, model.value().get(0).sku().capacity());
        Assertions.assertEquals("jplmagstcy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaList model =
            new ReplicaList()
                .withValue(
                    Arrays
                        .asList(
                            new ReplicaInner()
                                .withLocation("zukxitmmqtgqq")
                                .withTags(mapOf("isavok", "rnxrxcpj", "azivjlfrqttbajl", "dzf"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("zdwlvwlyoupfgfb")
                                        .withTier(SignalRSkuTier.BASIC)
                                        .withCapacity(520028629)),
                            new ReplicaInner()
                                .withLocation("bfhjxakvvjgsl")
                                .withTags(mapOf("yw", "il", "gkxnyedabg", "t"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("mligov")
                                        .withTier(SignalRSkuTier.PREMIUM)
                                        .withCapacity(1644940787))))
                .withNextLink("jplmagstcy");
        model = BinaryData.fromObject(model).toObject(ReplicaList.class);
        Assertions.assertEquals("zukxitmmqtgqq", model.value().get(0).location());
        Assertions.assertEquals("rnxrxcpj", model.value().get(0).tags().get("isavok"));
        Assertions.assertEquals("zdwlvwlyoupfgfb", model.value().get(0).sku().name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals(520028629, model.value().get(0).sku().capacity());
        Assertions.assertEquals("jplmagstcy", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
