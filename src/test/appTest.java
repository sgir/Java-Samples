/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package test;

import Main.Person;
import Main.app;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class appTest {

    @Test
    public void testMethodReturnsCorrectAge() throws Exception {
        //construct expected person ArrayList
        ArrayList<Person> personArrayList = constructExpectedPersonArraylist();
        int expectedAge = 100; //25*4
        app app = new app();
        Assert.assertEquals("The Person age Aggregator works", expectedAge, app.personAgeAggregator(personArrayList));
    }

    @Test
    public void testMethodReturnsZero() throws Exception {
        ArrayList<Person> personArrayList = new ArrayList<>();
        app app = new app();
        Assert.assertEquals("Aggregator works", 0, app.personAgeAggregator(personArrayList));
    }

    @Test(expected = NullPointerException.class)
    public void testMethodThrowsException() throws Exception {
        ArrayList<Person> personArrayList = null;
        app app = new app();
        app.personAgeAggregator(personArrayList);
    }

    public ArrayList<Person> constructExpectedPersonArraylist() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("A", 25));
        persons.add(new Person("B", 25));
        persons.add(new Person("C", 25));
        persons.add(new Person("D", 25));
        return persons;
    }
}