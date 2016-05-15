package it.xpeppers.learn;

import java.util.Date;

public class RealTimeProvider implements TimeProvider {

    public Date now() {
        return new Date();
    }

}
