package com.adobe.aem.guides.bpit4622.core.models;


import java.util.List;

public interface Byline {
    /***
    * @return a string to display as the name.
    */
    String getName();

    /***
    * Occupations are to be sorted alphabetically in a descending order.
    *
    * @return a list of occupations.
    */
    List<String> getOccupations();

    /***
    * @return a boolean if the component has enough content to display.
    */
    boolean isEmpty();
}