package com.example.kpp3;

import org.junit.jupiter.api.Test;

import org.example.KPP3;
import static org.junit.jupiter.api.Assertions.*;
class KPP3Test {
    @Test
    public void testIntersectionTrue() {
        // Тест на перетин відрізків (відрізки перетинаються)
        assertEquals(1, KPP3.checkIntersection(1, 5, 3, 7));
    }

    @Test
    public void testIntersectionFalse() {
        // Тест на невідповідність (відрізки не перетинаються)
        assertEquals(0, KPP3.checkIntersection(1, 3, 5, 7));
    }

    @Test
    public void testIntersectionEdgeCase() {
        // Тест на крайній випадок (відрізки доторкаються)
        assertEquals(1, KPP3.checkIntersection(1, 5, 5, 7));
    }
  
}