package com.example.config;

import com.alibaba.fastjson.serializer.ValueFilter;
import java.util.ArrayList;
import java.util.List;

public class ListLongToStringValueFilter implements ValueFilter {
  public ListLongToStringValueFilter() {
  }

  public Object process(Object object, String name, Object value) {
    if (value instanceof List) {
      List<?> target = (List)value;
      List<Object> ret = new ArrayList();
      target.forEach((item) -> {
        if (item instanceof Long) {
          ret.add(((Long)item).toString());
        } else {
          ret.add(item);
        }

      });
      return ret;
    } else {
      return value;
    }
  }
}
