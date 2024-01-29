package com.zergatstage.grdltst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person obj;
    @Test
    @DisplayName("Check object creation")
    void PersonTest(){
        obj = new Person("Test");
        assertNotNull(obj);
        assertEquals(obj.getName(), "Test");
    }
}