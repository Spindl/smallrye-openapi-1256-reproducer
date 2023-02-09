package com.nts.smallryeopenapi.reproducer.api;

import com.nts.smallryeopenapi.reproducer.api.filter.BeanParamBean;
import com.nts.smallryeopenapi.reproducer.api.filter.Filter;
import com.nts.smallryeopenapi.reproducer.api.json.JsonBase;
import com.nts.smallryeopenapi.reproducer.api.json.Page;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

public interface GenericBaseInterface<T extends JsonBase, F extends Filter> {

    @Operation(summary = "list")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "500", description = "internal server error", //
            content = @Content(schema = @Schema(type = SchemaType.OBJECT)))
    Page<T> list(BeanParamBean params, F filter);
}
