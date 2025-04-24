package fun.toomanyhats.resource;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import fun.toomanyhats.client.CatalogServiceClient;
import fun.toomanyhats.model.Hat;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/recommendations")
public class RecommendationResource {
    @Inject
    @RestClient
    CatalogServiceClient catalogServiceClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hat> getAllHats() {
        return catalogServiceClient.getAllHats();
    }
}
