package com.nts.smallryeopenapi.reproducer.impl;

import com.nts.smallryeopenapi.reproducer.api.filter.BeanParamBean;
import com.nts.smallryeopenapi.reproducer.api.json.DataJson;
import com.nts.smallryeopenapi.reproducer.api.filter.FilterBean;
import com.nts.smallryeopenapi.reproducer.api.json.Page;
import com.nts.smallryeopenapi.reproducer.api.RestInterface;

public class RestImpl implements RestInterface {
    @Override
    public DataJson create(DataJson json) {
        return null;
    }

    @Override
    public Page<DataJson> list(BeanParamBean params, FilterBean filter) {
        return null;
    }
}
