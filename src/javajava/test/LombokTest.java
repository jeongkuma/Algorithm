package javajava.test;


import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class LombokTest {
    public static void main(String[] args) {
        lombokTest();
    }

    public static void lombokTest(){


        LombokEntity ent =
                LombokEntity.builder()
                        .id("ID1")
                        .pw("PW1")
                        .build();

        log.log(Level.INFO, ent.toString());

        ent = convert(ent);

        log.log(Level.INFO, ent.toString());

    }


    public static LombokEntity convert(LombokEntity ent) {
        ent = LombokEntity.builder()
                .pw("PW2")
                .build();
        return ent;

    }

}
