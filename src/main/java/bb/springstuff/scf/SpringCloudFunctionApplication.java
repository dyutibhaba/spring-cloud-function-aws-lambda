package bb.springstuff.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCloudFunctionApplication.class, args);
		// Function catalog going to be registered through order configuration.
		/*
		 * FunctionCatalog catalog = context.getBean(FunctionCatalog.class);
		 * //Function<String, String> function = catalog.lookup("uppercase");
		 *//**
			 * The imperative function but we can invoke it as reactive. But why it is
			 * important ?
			 * 
			 * Well, a variety of reasons. What if i wanna combine the imperative function
			 * with the reactive one.
			 * 
			 * 
			 */
		/*
		 * Function<Flux<String>, Flux<String>> function =
		 * catalog.lookup("reactiveUppercase|echo");
		 *//**
			 * The above line can be replaced with the below line. Then why catalog ? Its to
			 * handle the different complex cases like function composition.
			 *//*
				 * //Function<String, String> function = context.getBean("uppercase",
				 * Function.class); //System.out.println(function.apply("hello"));
				 * System.out.println(function.apply(Flux.just("hello")).blockFirst());
				 */
	}

	
	/*
	 * @Bean public Function<String, String> uppercase() { return v ->
	 * v.toUpperCase(); }
	 * 
	 * @Bean public Function<Flux<String>, Flux<String>> reactiveUppercase() {
	 * return flux -> flux.map(v -> v.toUpperCase()); }
	 * 
	 * @Bean public Function<String, String> echo() { return v -> {
	 * System.out.println("Echo "+v); return v; }; }
	 */

}
