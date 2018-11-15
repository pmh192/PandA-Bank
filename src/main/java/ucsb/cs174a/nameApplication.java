package ucsb.cs174a;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ucsb.cs174a.resources.HelloWorldResource;

public class nameApplication extends Application<nameConfiguration> {

    public static void main(final String[] args) throws Exception {
        new nameApplication().run(args);
    }

    @Override
    public String getName() {
        return "name";
    }

    @Override
    public void initialize(final Bootstrap<nameConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final nameConfiguration configuration, final Environment environment) {
        HelloWorldResource helloWorldResource = new HelloWorldResource();

        environment.jersey().register(helloWorldResource);
    }

}
