// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobDataset;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureBlobDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureBlob\",\"typeProperties\":{\"folderPath\":\"datayhssrlvkpkpkocm\",\"tableRootLocation\":\"datacebxx\",\"fileName\":\"datayicyvspeslhwy\",\"modifiedDatetimeStart\":\"datagvrccpu\",\"modifiedDatetimeEnd\":\"datadhg\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"datardyddtpfcudvaf\",\"deserializer\":\"datafbq\",\"\":{\"rdw\":\"dataqnxhgk\",\"zvcmbpwd\":\"dataejpec\",\"bvtzldzchub\":\"dataudayprldidwmtf\",\"zuvigvl\":\"datagwn\"}},\"compression\":{\"type\":\"datafrbzakp\",\"level\":\"datacqra\",\"\":{\"cw\":\"datajpsucmxi\",\"jgsatky\":\"dataxyn\"}}},\"description\":\"cb\",\"structure\":\"datagcru\",\"schema\":\"datahirc\",\"linkedServiceName\":{\"referenceName\":\"gcvsvkkjbjolpy\",\"parameters\":{\"igowxxbhtpsyioqe\":\"datakvuznadvhmlie\",\"wanvmwdvgjqcrbko\":\"dataqwtqszzgyksik\",\"gyweo\":\"datapnbn\"}},\"parameters\":{\"kchkapit\":{\"type\":\"String\",\"defaultValue\":\"datacmahiwfrya\"},\"t\":{\"type\":\"SecureString\",\"defaultValue\":\"datahfyf\"},\"wh\":{\"type\":\"Object\",\"defaultValue\":\"dataep\"}},\"annotations\":[\"datafdgbggcjxzhbl\"],\"folder\":{\"name\":\"eh\"},\"\":{\"mbhdo\":\"dataym\"}}")
                .toObject(AzureBlobDataset.class);
        Assertions.assertEquals("cb", model.description());
        Assertions.assertEquals("gcvsvkkjbjolpy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("kchkapit").type());
        Assertions.assertEquals("eh", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobDataset model =
            new AzureBlobDataset()
                .withDescription("cb")
                .withStructure("datagcru")
                .withSchema("datahirc")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("gcvsvkkjbjolpy")
                        .withParameters(
                            mapOf(
                                "igowxxbhtpsyioqe",
                                "datakvuznadvhmlie",
                                "wanvmwdvgjqcrbko",
                                "dataqwtqszzgyksik",
                                "gyweo",
                                "datapnbn")))
                .withParameters(
                    mapOf(
                        "kchkapit",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datacmahiwfrya"),
                        "t",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datahfyf"),
                        "wh",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataep")))
                .withAnnotations(Arrays.asList("datafdgbggcjxzhbl"))
                .withFolder(new DatasetFolder().withName("eh"))
                .withFolderPath("datayhssrlvkpkpkocm")
                .withTableRootLocation("datacebxx")
                .withFileName("datayicyvspeslhwy")
                .withModifiedDatetimeStart("datagvrccpu")
                .withModifiedDatetimeEnd("datadhg")
                .withFormat(
                    new DatasetStorageFormat()
                        .withSerializer("datardyddtpfcudvaf")
                        .withDeserializer("datafbq")
                        .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
                .withCompression(
                    new DatasetCompression()
                        .withType("datafrbzakp")
                        .withLevel("datacqra")
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureBlobDataset.class);
        Assertions.assertEquals("cb", model.description());
        Assertions.assertEquals("gcvsvkkjbjolpy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("kchkapit").type());
        Assertions.assertEquals("eh", model.folder().name());
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
