/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.honeycode.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.honeycode.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartTableDataImportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartTableDataImportJobRequestMarshaller {

    private static final MarshallingInfo<String> WORKBOOKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workbookId").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSource").build();
    private static final MarshallingInfo<String> DATAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataFormat").build();
    private static final MarshallingInfo<String> DESTINATIONTABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("tableId").build();
    private static final MarshallingInfo<StructuredPojo> IMPORTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importOptions").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken").build();

    private static final StartTableDataImportJobRequestMarshaller instance = new StartTableDataImportJobRequestMarshaller();

    public static StartTableDataImportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartTableDataImportJobRequest startTableDataImportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startTableDataImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startTableDataImportJobRequest.getWorkbookId(), WORKBOOKID_BINDING);
            protocolMarshaller.marshall(startTableDataImportJobRequest.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(startTableDataImportJobRequest.getDataFormat(), DATAFORMAT_BINDING);
            protocolMarshaller.marshall(startTableDataImportJobRequest.getDestinationTableId(), DESTINATIONTABLEID_BINDING);
            protocolMarshaller.marshall(startTableDataImportJobRequest.getImportOptions(), IMPORTOPTIONS_BINDING);
            protocolMarshaller.marshall(startTableDataImportJobRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
