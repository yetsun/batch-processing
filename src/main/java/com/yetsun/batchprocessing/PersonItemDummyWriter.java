package com.yetsun.batchprocessing;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonItemDummyWriter implements ItemWriter<Person> {
    @Override
    public void write(List<? extends Person> items) throws Exception {
        System.out.println(items);
        items.forEach(System.out::println);
    }
}
