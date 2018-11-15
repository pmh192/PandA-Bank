package ucsb.cs174a.resources;

import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

public class HelloWorldResourceTest {

    @Test
    public void sayHello() {
        Response response = new HelloWorldResource().sayHello();
        assertEquals("Hello World", response.getEntity().toString());
    }
}