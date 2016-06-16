/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package Main;

import java.util.ArrayList;
import java.util.List;

public class app {


    public int personAgeAggregator(List<Person> personArrayList) throws Exception {
        int age=0;
        try {
            for (int i =0; i <personArrayList.size();i++) {
                Person p = personArrayList.get(i);
                age += p.getAge();
            }
        } catch (Exception e1) {
            throw new NullPointerException();
        }
        return age;
    }

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.setName("sathya");
        person.setAge(25);


        person1.setName("Ganesh");
        person1.setAge(26);


        person2.setName("Ram");
        person2.setAge(23);


        person3.setName("Dude");
        person3.setAge(20);
        List<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        //Return my chosen person
        app app = new app();
        int returnedTotalAge = app.personAgeAggregator(personArrayList);
        System.out.println(returnedTotalAge);

    }


}
