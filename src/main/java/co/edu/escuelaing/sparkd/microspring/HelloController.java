
package co.edu.escuelaing.sparkd.microspring;

/**
 *
 * @author SebastianPaez
 */
public class HelloController {
	@RequestMapping("/hola")
	static public String index() {
		return "Greetings from Micro Spring Boot!";
        }
	
}
