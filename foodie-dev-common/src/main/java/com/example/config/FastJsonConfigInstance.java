package com.example.config;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class FastJsonConfigInstance {
  public static FastJsonConfig instance = new FastJsonConfig();

  public FastJsonConfigInstance() {
  }

  static {
    instance.setDateFormat("yyyy-MM-dd HH:mm:ss");
    instance.setCharset(StandardCharsets.UTF_8);
    instance.setSerializerFeatures(SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty,
        SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect);
    SerializeConfig serializeConfig = SerializeConfig.globalInstance;
    serializeConfig.put(BigInteger.class, ToStringSerializer.instance);
    serializeConfig.put(Long.class, ToStringSerializer.instance);
    serializeConfig.put(Long.TYPE, ToStringSerializer.instance);
    instance.setSerializeConfig(serializeConfig);
    SerializeFilter[] serializeFilters = new SerializeFilter[]{new ListLongToStringValueFilter()};
    instance.setSerializeFilters(serializeFilters);
    Objects.requireNonNull(instance);
  }
}
