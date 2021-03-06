/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndexSettingsUpdate
 */
class ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller {

    public void marshall(
            ReplicaGlobalSecondaryIndexSettingsUpdate replicaGlobalSecondaryIndexSettingsUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndexSettingsUpdate.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndexSettingsUpdate.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndexSettingsUpdate.getProvisionedReadCapacityUnits() != null) {
            Long provisionedReadCapacityUnits = replicaGlobalSecondaryIndexSettingsUpdate
                    .getProvisionedReadCapacityUnits();
            jsonWriter.name("ProvisionedReadCapacityUnits");
            jsonWriter.value(provisionedReadCapacityUnits);
        }
        if (replicaGlobalSecondaryIndexSettingsUpdate
                .getProvisionedReadCapacityAutoScalingSettingsUpdate() != null) {
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate = replicaGlobalSecondaryIndexSettingsUpdate
                    .getProvisionedReadCapacityAutoScalingSettingsUpdate();
            jsonWriter.name("ProvisionedReadCapacityAutoScalingSettingsUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    provisionedReadCapacityAutoScalingSettingsUpdate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller();
        return instance;
    }
}
