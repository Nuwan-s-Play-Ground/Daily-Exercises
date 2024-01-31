# Spring Bean Lifecycle Demo

This project demonstrates the usage of Spring interfaces, annotations, and lifecycle methods for managing the lifecycle of a Spring bean.

## SpringBean Class

The `SpringBean` class in the `com.vpn.bean` package serves as an example Spring bean, implementing various Spring interfaces and using lifecycle methods.

### Lifecycle Interfaces Implemented

- `BeanNameAware`: Obtains the bean name during initialization.
- `BeanFactoryAware`: Obtains the bean factory during initialization.
- `ApplicationContextAware`: Obtains the application context during initialization.
- `InitializingBean`: Performs additional initialization after properties are set.
- `DisposableBean`: Provides a hook for bean destruction.

### Lifecycle Annotations Used

- `@PostConstruct`: Annotated methods are executed after the bean has been constructed and all dependencies have been set.
- `@PreDestroy`: Annotated methods are executed before the bean is removed from the container.

## Usage

Clone the repository and explore the `SpringBean` class to understand how Spring manages the 
lifecycle of beans.


