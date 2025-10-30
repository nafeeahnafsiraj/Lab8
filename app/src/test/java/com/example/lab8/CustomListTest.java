package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * Tests whether hasCity() correctly identifies if a city is present in the list
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Calgary", "AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    /**
     * Tests whether delete() removes a city from the list correctly and the city count decreases accordingly
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }
}
