package com.sailthru.client;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * few static utility methods
 * @author Prajwal Tuladhar
 */
public class SailthruUtil {

    /**
     * generates MD5 Hash
     * @param String data
     * @return String 
     */
    public static String md5(String data) {
        try {
            return DigestUtils.md5Hex(data.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException e) {
            return DigestUtils.md5Hex(data.toString());
        }
    }

    /**
     * Converts String ArrayList to CSV String
     * @param ArrayList<String> list
     * @return String
     */
    public static String ArrayListToCSV(ArrayList<String> list) {
        StringBuilder csv = new StringBuilder();
        for (String str : list) {
            csv.append(str);
        }
        int lastIndex = csv.length() - 1;
        char last = csv.charAt(lastIndex);
        if (last == ',') {
            return csv.substring(0, lastIndex);
        }
        return csv.toString();
    }
}