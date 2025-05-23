package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise16Test {

    @Test
    @DisplayName("Check if the plane and tractor are IMachine instances")
    void testIMachineInterface() {
        Tractor tractor = new Tractor(3000);
        Plane plane = new Plane("Plane");
        assertInstanceOf(IMachine.class, tractor, "tractor variable is not a instance of IMachine");
        assertInstanceOf(IMachine.class, plane, "plane variable is not a instance of IMachine");
    }
}