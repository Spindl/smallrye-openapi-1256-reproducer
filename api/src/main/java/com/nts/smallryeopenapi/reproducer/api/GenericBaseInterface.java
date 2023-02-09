package com.nts.smallryeopenapi.reproducer.api;

import com.nts.smallryeopenapi.reproducer.api.filter.BeanParamBean;
import com.nts.smallryeopenapi.reproducer.api.filter.Filter;
import com.nts.smallryeopenapi.reproducer.api.json.JsonBase;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;

public interface GenericBaseInterface<T extends JsonBase, F extends Filter> {

    @Operation(summary = "list")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "500", description = "internal server error", //
            content = @Content(schema = @Schema(type = SchemaType.OBJECT)))
    List<T> list(BeanParamBean params, F filter);
}
