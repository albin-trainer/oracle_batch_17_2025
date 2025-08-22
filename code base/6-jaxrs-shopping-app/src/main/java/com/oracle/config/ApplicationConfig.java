package com.oracle.config;
import java.util.Set;


import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

import org.glassfish.jersey.server.ResourceConfig;
import com.oracle.exception.handler.ExceptionHandler;
public class ApplicationConfig  extends ResourceConfig{
public ApplicationConfig() {
	packages("com.oracle.api");
	register(ExceptionHandler.class); //registering as a resource
	
	
   // register(MultiPartFeature.class);

    OpenAPI oas = new OpenAPI()
            .addServersItem(new Server().url("/6-jaxrs-shopping-app/onlineapi"));

    SwaggerConfiguration oasConfig = new SwaggerConfiguration()
            .openAPI(oas)
            .prettyPrint(true)
            .resourcePackages(Set.of("com.oracle"));
         
    OpenApiResource openApiResource = new OpenApiResource();
    openApiResource.setOpenApiConfiguration(oasConfig);

    register(openApiResource);

    System.out.println("Swagger OpenAPI registered...");
}
}
