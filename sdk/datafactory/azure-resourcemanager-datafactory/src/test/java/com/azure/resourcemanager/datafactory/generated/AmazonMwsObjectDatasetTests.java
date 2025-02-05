// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonMwsObjectDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AmazonMwsObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonMwsObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AmazonMWSObject\",\"typeProperties\":{\"tableName\":\"datan\"},\"description\":\"lxcltjhbcycg\",\"structure\":\"datakcsihxvta\",\"schema\":\"datawf\",\"linkedServiceName\":{\"referenceName\":\"pxpry\",\"parameters\":{\"gugwlux\":\"databubwhzq\",\"mkdhwqcqweba\":\"datahtq\",\"phujeucosvk\":\"datamfpk\",\"llgnueezfpffb\":\"dataeergvypaxpjpy\"}},\"parameters\":{\"gzyojfchicpare\":{\"type\":\"Array\",\"defaultValue\":\"datavmcgm\"},\"ojuxil\":{\"type\":\"Bool\",\"defaultValue\":\"dataksgqhb\"},\"fldfljwt\":{\"type\":\"Object\",\"defaultValue\":\"datalkc\"}},\"annotations\":[\"datatsflotumbm\",\"datagftshfgmuxuqiags\",\"dataoikuqirhsk\",\"datapaowkgvnlfueyxfz\"],\"folder\":{\"name\":\"lrjugcfebpiucenb\"},\"\":{\"lsxr\":\"datalldfknbdzw\"}}")
                .toObject(AmazonMwsObjectDataset.class);
        Assertions.assertEquals("lxcltjhbcycg", model.description());
        Assertions.assertEquals("pxpry", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("gzyojfchicpare").type());
        Assertions.assertEquals("lrjugcfebpiucenb", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonMwsObjectDataset model =
            new AmazonMwsObjectDataset()
                .withDescription("lxcltjhbcycg")
                .withStructure("datakcsihxvta")
                .withSchema("datawf")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("pxpry")
                        .withParameters(
                            mapOf(
                                "gugwlux",
                                "databubwhzq",
                                "mkdhwqcqweba",
                                "datahtq",
                                "phujeucosvk",
                                "datamfpk",
                                "llgnueezfpffb",
                                "dataeergvypaxpjpy")))
                .withParameters(
                    mapOf(
                        "gzyojfchicpare",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datavmcgm"),
                        "ojuxil",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataksgqhb"),
                        "fldfljwt",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datalkc")))
                .withAnnotations(
                    Arrays.asList("datatsflotumbm", "datagftshfgmuxuqiags", "dataoikuqirhsk", "datapaowkgvnlfueyxfz"))
                .withFolder(new DatasetFolder().withName("lrjugcfebpiucenb"))
                .withTableName("datan");
        model = BinaryData.fromObject(model).toObject(AmazonMwsObjectDataset.class);
        Assertions.assertEquals("lxcltjhbcycg", model.description());
        Assertions.assertEquals("pxpry", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("gzyojfchicpare").type());
        Assertions.assertEquals("lrjugcfebpiucenb", model.folder().name());
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
