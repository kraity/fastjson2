package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;

public class SerializeBeanInfo {

    public final FieldInfo[] fields;
    public final FieldInfo[] sortedFields;
    protected final Class<?> beanType;
    protected final String typeName;
    protected final String typeKey;
    protected final JSONType jsonType;
    protected int features;

    public SerializeBeanInfo(Class<?> beanType, //
                             JSONType jsonType, //
                             String typeName, //
                             String typeKey,
                             int features,
                             FieldInfo[] fields, //
                             FieldInfo[] sortedFields
    ) {
        this.beanType = beanType;
        this.jsonType = jsonType;
        this.typeName = typeName;
        this.typeKey = typeKey;
        this.features = features;
        this.fields = fields;
        this.sortedFields = sortedFields;
    }

    public int getFeatures() {
        return features;
    }
}
