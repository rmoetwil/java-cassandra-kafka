package nl.wilron.jck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaCassandraKafkaApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(
				JavaCassandraKafkaApplication.class);
		application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		SpringApplication.run(JavaCassandraKafkaApplication.class, args);
	}
}
