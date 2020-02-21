package com.edu.third;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

public class LoggerServiceBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class beanClass = LoggerService.class;
        String name = StringUtils.uncapitalize(beanClass.getSimpleName()); //首字母转成小写
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(beanClass);
        registry.registerBeanDefinition(name, rootBeanDefinition);
    }
}
