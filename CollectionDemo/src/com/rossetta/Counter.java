package com.rossetta;

public class Counter {

    int count = 0;

    public synchronized void getcount() {
        count++;
    }
}
