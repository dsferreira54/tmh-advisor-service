package fun.toomanyhats.client;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import fun.toomanyhats.model.Hat;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hats")
@RegisterRestClient(configKey = "catalog-service")
public interface CatalogServiceClient {
    @GET
    List<Hat> getAllHats();
}
