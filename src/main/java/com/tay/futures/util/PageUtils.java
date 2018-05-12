package com.tay.futures.util;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class PageUtils {
    
    public static <T> List<T> getPageList(List<T> list, Integer pageNo, Integer pageSize) {
        Assert.isTrue(pageNo != null && pageNo > 0, "pageNo invalid:" + pageNo);
        Assert.isTrue(pageSize != null && pageSize > 0, "pageSize invalid" + pageSize);
        
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<T>();
        }
        int total = list.size();
        Integer fromIndex = (pageNo - 1) * pageSize;
        if (fromIndex > total - 1) {
            return new ArrayList<T>();
        }
        Integer endIndex = Math.min(fromIndex + pageSize, total);
        return Lists.newArrayList(list.subList(fromIndex, endIndex));
    }
}
