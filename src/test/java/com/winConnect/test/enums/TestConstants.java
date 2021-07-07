package com.winConnect.test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Define Constants.
 * Create a new enum Class for defining new constants
 */


@AllArgsConstructor
public enum TestConstants {
    TEST_FRAMEWORK("winConnect test framework"),
    TEST_COUNT("test count");

    @Getter
    String cssClass;
}
