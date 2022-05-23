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



//        ent = setBuilded(ent);

        setVoid(ent);
        log.log(Level.INFO, ent.toString());

    }


    public static LombokEntity normalBuilded(LombokEntity ent) {
        ent = LombokEntity.builder()
                .pw("PW2")
                .build();
        return ent;

    }


    public static LombokEntity comeBuilded(LombokEntity ent) {
        ent = ent.builder()
                .pw("PW3")
                .build();
        return ent;

    }


    public static LombokEntity setBuilded(LombokEntity ent) {
        ent.setPw("PW4");
        return ent;

    }

    public static void setVoid(LombokEntity ent) {
        ent.setPw("PW5");
    }

}
