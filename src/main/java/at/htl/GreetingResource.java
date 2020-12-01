package at.htl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.util.Date;
import java.util.zip.DataFormatException;

@Path("/angular")
public class GreetingResource {

    @Path("/helloworld")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Angular with Quarkus working! " ;
    }
}