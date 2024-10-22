package org.example;

public class KPP3 {

    public KPP3(){
    }
    public static int checkIntersection(int a, int b, int c, int d) {
        if (Math.max(a, b) < Math.min(c, d) || Math.max(c, d) < Math.min(a, b)) {
            return 0;
        }
        return 1;
    }
}
