package com.privasia.poller.core.utils;

import java.util.UUID;

public class Utils {

    public static String generateUUID32() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}
