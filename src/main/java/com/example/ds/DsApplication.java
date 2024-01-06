package com.example.ds;


import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DsApplication {

    public static void main(String[] args) {

        Person person1 = new Person(1, "a");
        Person person2 = new Person(1, "a");
        Map<Person,String> map=new HashMap<>();
        map.put(person1,"Cse");
        map.put(person2,"it");

        map.forEach((key,value)->
                System.out.println(key.name +" : "+value)

        );

        for(Person person: map.keySet()){
            System.out.println(map.get(person));
        }

    }

    }




class Person{
    int id;
    String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

}
