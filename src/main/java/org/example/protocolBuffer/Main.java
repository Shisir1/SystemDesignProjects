package org.example.protocolBuffer;

import com.google.protobuf.InvalidProtocolBufferException;

import static org.example.protocolBuffer.PersonOuterClass.*;

public class Main {
    public static void main(String[] args) {
        //create new person instance
        Person person = Person.newBuilder()
                .setName("Shisir Humagain")
                .setId(1234)
                .setEmail("shisir.java@gmail.com")
                .build();

        //Serialize the person object to bytes
        byte[] serializedPerson = person.toByteArray();

        //deserialize the bytes back to a person object
        try{
            Person newPerson = Person.parseFrom(serializedPerson);

            System.out.println("Name: " + newPerson.getName());
            System.out.println("ID: " + newPerson.getId());
            System.out.println("Email: " + newPerson.getEmail());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }
}
