package blog.panditmandar.code.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * This is Main Class for Jersey REST Java Application
 * 
 * @author Mandar Pandit
 */
@ApplicationPath("rest")
public class RESTJerseyHelloWorldApp extends ResourceConfig {

	public RESTJerseyHelloWorldApp() {

		packages("blog.panditmandar.code.jersey.services");

	}
}
