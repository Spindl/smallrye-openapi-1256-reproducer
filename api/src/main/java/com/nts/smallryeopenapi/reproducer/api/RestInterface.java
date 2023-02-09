package com.nts.smallryeopenapi.reproducer.api;

import com.nts.smallryeopenapi.reproducer.api.filter.BeanParamBean;
import com.nts.smallryeopenapi.reproducer.api.filter.FilterBean;
import com.nts.smallryeopenapi.reproducer.api.json.DataJson;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;

@Path("reproducer/reproducers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Tag(name = "reproducers", description = "This resource is there for reproducing bug 1256.")
public interface RestInterface extends GenericBaseInterface<DataJson, FilterBean> {

    @POST
    @Operation(summary = "create")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "500", description = "internal server error", //
            content = @Content(schema = @Schema(type = SchemaType.OBJECT)))
    DataJson create(DataJson json);

    @GET
    @Override
    List<DataJson> list(@BeanParam BeanParamBean params, @BeanParam FilterBean filter);
}
