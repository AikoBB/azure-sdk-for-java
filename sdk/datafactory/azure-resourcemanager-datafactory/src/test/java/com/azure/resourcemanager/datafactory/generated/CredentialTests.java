// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Credential;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CredentialTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Credential model =
            BinaryData
                .fromString(
                    "{\"type\":\"Credential\",\"description\":\"pwpgddei\",\"annotations\":[\"datazovgkkumuikj\",\"datajcazt\"],\"\":{\"wxwcomli\":\"datansq\",\"yfdvlvhbwrnfxtgd\":\"dataytwvczcswkacve\",\"kcoeqswank\":\"datapqthehnmnaoya\"}}")
                .toObject(Credential.class);
        Assertions.assertEquals("pwpgddei", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Credential model =
            new Credential()
                .withDescription("pwpgddei")
                .withAnnotations(Arrays.asList("datazovgkkumuikj", "datajcazt"))
                .withAdditionalProperties(mapOf("type", "Credential"));
        model = BinaryData.fromObject(model).toObject(Credential.class);
        Assertions.assertEquals("pwpgddei", model.description());
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
