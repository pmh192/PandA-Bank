package ucsb.cs174a.resources;

import ucsb.cs174a.db.SQLConnector;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello-world")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorldResource {

    public HelloWorldResource() {
    }

    @GET
    public Response sayHello() {
        return Response.ok("Hello World").build();
    }

    @GET
    @Path("/connect")
    public Response connect() {

        SQLConnector.connect();
        return Response.ok("connect").build();
    }
}
