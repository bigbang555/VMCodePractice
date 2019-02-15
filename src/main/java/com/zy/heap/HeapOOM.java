package com.zy.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class HeapObject {

    }

    public static void main(String[] args) {
        List<HeapObject> list = new ArrayList<>();
        while (true) {
            list.add(new HeapObject());
        }
    }

}
