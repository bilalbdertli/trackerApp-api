package com.example.todoappapi.Common;


import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@UtilityClass
public class CollectionUtils {
    public static <T> List<T> getPage(List<T> sourceList, int page, int pageSize){
        if(pageSize <= 0 || page <= 0){
            throw new IllegalArgumentException("invalid page size: " + pageSize);
        }
        int fromIndex = (page - 1) * pageSize;
        if(sourceList == null || sourceList.size() <= fromIndex){
            return Collections.emptyList();
        }
        return sourceList.subList(fromIndex,Math.min(fromIndex + pageSize, sourceList.size()));
    }

    public static boolean isEmpty(Collection<?> roleNames){
        return Objects.isNull(roleNames) || roleNames.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> roleNames){
        return !isEmpty(roleNames);
    }

}
