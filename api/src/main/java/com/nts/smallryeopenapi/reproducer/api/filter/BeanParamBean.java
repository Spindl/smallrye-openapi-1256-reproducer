package com.nts.smallryeopenapi.reproducer.api.filter;

import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

public class BeanParamBean {

    @QueryParam("param")
    @Parameter(description = "A parameter")
    private String param;
}
