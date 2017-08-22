package com.jm85martins.java9;

import com.jm85martins.java9.factorymethods.CollectionSamples;
import com.jm85martins.java9.interfaces.ConcretSample;
import com.jm85martins.java9.streams.StreamsSample;

/**
 * Created by jorgemartins on 22/08/2017.
 */
public class Main {
    public static void main(String args[]) {
        new CollectionSamples().play();
        new ConcretSample().play();
        new StreamsSample().play();
    }
}
