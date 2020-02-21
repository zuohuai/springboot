package com.edu.third;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class CacheImportSelector implements ImportSelector {
     @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{CacheService.class.getName()};
    }
}
