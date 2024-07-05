package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */

public class PhoneBook {

    private Map<String, List<String>> phonebook = new LinkedHashMap<>();


    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
//       this.phonebook = ;
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String solution = null;
    for (Map.Entry<String, List<String>> entry : phonebook.entrySet()){
        if (entry.getValue().contains(phoneNumber)){
            solution = entry.getKey();
        }
    }
    return solution;
    }

    public List<String> getAllContactNames() {
//        return (List<String>) phonebook.keySet();
        List<String> solution = new ArrayList<>(phonebook.keySet());
        return solution;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}


/*
objective- make a phonebook map to a name to phone number

note: this uses a map interface
- keys must be unique in a map
-you use keys to retrieve values
-values can be duplicated, keys cannot
-a map can contain null keys and values
-you can iteratore over the keys or values in a map using keyset() or values() or entrySet() methods
-use .put to initialize a key value pair

INSTRUCTIONS TO COMPLETE LAB:
-make a phonebook class that holds names and phone numbers
-use an associative data type (one which stores items as keys paired with values)
-fill in all the methods to make it complete


 */
