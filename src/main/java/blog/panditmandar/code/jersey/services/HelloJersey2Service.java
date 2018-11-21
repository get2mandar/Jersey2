package blog.panditmandar.code.jersey.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Hello Jersey 2 Service
 * @author Mandar Pandit
 */
@Path("/hello")
public class HelloJersey2Service {

	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String paramStr) {
		String message = "Say Hello Jersey : " + paramStr;
		return Response.status(200).entity(message).build();
	}

}
