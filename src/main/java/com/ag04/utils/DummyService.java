package com.ag04.utils;

/**
 * author AntonioJuresic
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
