# PostConstruct-PreDestroy
In Spring, you can either implements InitializingBean and DisposableBean interface or specify the init-method and destroy-method in bean configuration file for the initialization and destruction callback function. In this article, we show you how to use annotation @PostConstruct and @PreDestroy to do the same thing.
Note
The @PostConstruct and @PreDestroy annotation are not belong to Spring, it’s located in the J2ee library – common-annotations.jar. 
