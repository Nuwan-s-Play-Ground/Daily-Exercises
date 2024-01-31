# Spring Configuration and Bean Initialization Demo

This project demonstrates a simple Spring application setup with configuration, component scanning, and bean definitions.

## Project Structure

- `AppConfig`: Configuration class with component scanning and bean definitions.
- `AppInitializer`: Class to initialize the Spring application context.
- `SpringBean2`: Sample bean class.

## AppConfig Class

The `AppConfig` class is annotated with `@ComponentScan` and `@Configuration`, defining beans using `@Bean` annotations for `SpringBean2`, `String`, and `LocalDate`.

### Beans Defined

- **SpringBean2**: A sample bean class.
- **myString**: A bean of type `String` with the value "IJSE".
- **localDate**: A bean of type `LocalDate` representing the current date.

## AppInitializer Class

The `AppInitializer` class registers the `AppConfig` class and refreshes the Spring application context.

## Build and Run

Clone the repository and execute the following commands to build and run the project:


