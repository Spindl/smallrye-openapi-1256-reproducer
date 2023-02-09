package com.nts.smallryeopenapi.reproducer.api.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Page<T> implements Iterable<T> {
    private List<T> page = new ArrayList<>();

    public List<T> getPage() {
        return page;
    }

    public void setPage(List<T> page) {
        this.page = page;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
