package com.jm85martins.java9.streams;

import java.util.stream.Stream;

/**
 * Created by jorgemartins on 22/08/2017.
 */
public class StreamsSample {
    public void play(){
        Stream.of("Porto", "Coimbra", "Lisbon", "", "Braga").takeWhile(c -> !c.isEmpty()).forEach(System.out::println);
        //outputs: Porto, Coimbra, Lisbon

        Stream.of("Porto", "Coimbra", "Lisbon", "", "Braga").dropWhile(c -> !c.isEmpty()).forEach(System.out::println);
        //outputs: "", Braga
    }
}
