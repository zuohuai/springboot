# springboot

1.简介
----
服务于spring 框架的框架，基于约定由于配置的理念, 帮助开发者能够快速构建spring 项目


2.核心组件
-------
* AutoConfiguration
* Starter
* Actuator
* SpringBoot CLI

3.启动流程分析
-------
代码段:
````java
@SpringBootApplication
public class SpringBootFirstMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstMain.class, args);
    }
}
````
SpringBootApplication是一个复合注解包括以下注解:

 **SpringBootConfiguration(就是一个Configuration):**
 
 sping3之后实现了javaConfig 的方式, 实现无配置化
 ````java
 @Configuration //注解的配置类，实际是Component
 public class DemoConfiguration {
     @Bean //实现不用xml的方式, bean由spring 去管理
     DemoClass newDemoClass(){
         return new DemoClass();
     }
 }
 ````
 **EnableAutoConfiguration：实现自动装配**
    
    @AutoConfigurationPackage
    @Import(AutoConfigurationImportSelector.class)
  实现自动装配的实现核心类ImportSelector和ImportBeanDefinitionRegistrar
  
  ImportSelector
   ````java
    public class CacheImportSelector implements ImportSelector {
        @Override
       public String[] selectImports(AnnotationMetadata importingClassMetadata) {
           return new String[]{CacheService.class.getName()}; //对应的beanName
       }
    }
   ````  
   ImportBeanDefinitionRegistrar
  ````java
    public class LoggerServiceBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    
        @Override
        public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
            Class beanClass = LoggerService.class;
            String name = StringUtils.uncapitalize(beanClass.getSimpleName()); //首字母转成小写
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(beanClass);
            registry.registerBeanDefinition(name, rootBeanDefinition);
        }
    }
  ````  
    
 
 **ComponentScan: 扫描Service, Component 注解标识的类**
 
 **Spring Boot 中的SPI**
 SPI的全名为Service Provider Interface.这个是针对厂商或者插件的。
 
 * SPI的思想：
 
 系统里抽象的各个模块，往往有很多不同的实现方案，比如日志模块的方案，xml解析模块、jdbc模块的方案等。面向的对象的设计里，我们一般推荐模块之间基于接口编程，模块之间不对实现类进行硬编码。一旦代码里涉及具体的实现类，就违反了可拔插的原则，如果需要替换一种实现，就需要修改代码。为了实现在模块装配的时候能不在程序里动态指明，这就需要一种服务发现机制。java spi就是提供这样的一个机制：为某个接口寻找服务实现的机制
 
 * Spring Boot中的SPI：
 
 在springboot的自动装配过程中，最终会加载META-INF/spring.factories文件，而加载的过程是由SpringFactoriesLoader加载的。从CLASSPATH下的每个Jar包中搜寻所有META-INF/spring.factories配置文件，然后将解析properties文件，找到指定名称的配置后返回。需要注意的是，其实这里不仅仅是会去ClassPath路径下查找，会扫描所有路径下的Jar包，只不过这个文件只会在Classpath下的jar包中。
 ````
 protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
 		List<String> configurations = SpringFactoriesLoader.loadFactoryNames(getSpringFactoriesLoaderFactoryClass(),
 				getBeanClassLoader());
 		Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. If you "
 				+ "are using a custom packaging, make sure that file is correct.");
 		return configurations;
 	}
 ````
 
 **自定义Starter**
 
 常用命名规则： spring-booter-starter-{name}(官方), pring-booter-starter-{name}（非官方）
 
 
3.多数据源配置
-------
参考:
https://docs.spring.io/spring-boot/docs/2.1.13.BUILD-SNAPSHOT/reference/html/howto-data-access.html#howto-two-datasources

4.Actuator
-------
监控
 
 
 
 
 

