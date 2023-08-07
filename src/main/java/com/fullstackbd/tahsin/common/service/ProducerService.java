package com.fullstackbd.tahsin.common.service;

public interface ProducerService {
    <T> void produce(T event);
}
