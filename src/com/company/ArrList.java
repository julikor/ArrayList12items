package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ArrList {

    private Random r = new Random();
    private int[] arr = new int[12];

    public void add(int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = value;
                return;
            }
        }
    }

    public int size() {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }

        }

        return arr.length;

    }
}
