package org.assignmentTracker.util;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    public static int generateID(){
        int min = 100000000;
        int max = 999999999;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    public static long generateStudNum(){
        int min = 100000000;
        int max = 999999999;
        long randomNum = Long.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1));
        return randomNum;
    }

}
