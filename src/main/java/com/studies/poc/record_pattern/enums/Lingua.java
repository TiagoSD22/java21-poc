package com.studies.poc.record_pattern.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum Lingua {
    ENGLISH("en"),
    PORTUGUESE("pt"),
    CHINESE("zh"),
    FRENCH("fr"),
    GERMAN("de");

    private final String value;

    public String value() {
        return value;
    }
}
