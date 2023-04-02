package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T>{
    private ArrayList<T> zesty;
    private Map<T, Integer> jason;

    public ArrayUtility(T[] zestys) {
        this.zesty = new ArrayList<T>(Arrays.asList(zestys));
        this.jason = new HashMap<>();
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer counter = 0;
        for (T t : arrayToMerge){
            zesty.add(t);
        }
        for (T david : zesty) {
            if (david == valueToEvaluate){
               counter++;
            }
        }
        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        for (T i : arrayToMerge){
            zesty.add(i);
        }
        for (T t: zesty) {
            if (jason.containsKey(t)) {
                jason.put(t, jason.get(t) + 1);
            } else {
                jason.put(t, 1);
            }
        }
        T common = zesty.get(0);
        int largest = 0;
        for (Map.Entry<T,Integer> entry : jason.entrySet()) {
            if (largest < entry.getValue()) {
                largest = entry.getValue();
                common = entry.getKey();
            }
        }
        return common;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int occurrence = 0;
        for (T t: zesty) {
            if (t == valueToEvaluate){
                occurrence++;
            }
        }
        return occurrence;
    }

    public T[] removeValue(T valueToRemove) {
        int count = 0;
        for (T element : zesty) {
            if (element.equals(valueToRemove)) {
                count++;
            }
        }

        T[] newArray = (T[]) Array.newInstance(zesty.get(0).getClass(), zesty.size() - count);
        int index = 0;
        for (T element : zesty) {
            if (!element.equals(valueToRemove)) {
                newArray[index++] = element;
            }
        }

        return newArray;
    }
}
