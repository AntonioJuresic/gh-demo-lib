package com.ag04.utils;

/**
 * author AntonioJuresic
 * company Agency04
 * age 22
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
