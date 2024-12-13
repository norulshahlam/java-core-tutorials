package com.shah.javacoretutorials.tutorials.advance.compareDiff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.*;
import org.junit.jupiter.api.Test;

public class CompareDiffTest {

    @Test
    void compareValuesWithNestedObject() {
        // Create old and new nested objects
        Address oldAddress = new Address("123 Main St", "New York", "USA");
        Address newAddress = new Address("456 Elm St", "Los Angeles", "USA");

        // Create old and new ContactEntity objects
        ContactEntity oldContact = new ContactEntity("John Doe", "john@example.com", "1234567890", oldAddress);
        ContactEntity newContact = new ContactEntity("Jane Doe", "jane@example.com", "0987654321", newAddress);

        // Use ReflectionDiffBuilder to compare the objects
        DiffResult<ContactEntity> diffResult = new ReflectionDiffBuilder<>(oldContact, newContact, ToStringStyle.DEFAULT_STYLE).build();

        // Print the differences
        diffResult.getDiffs().forEach(diff ->
                System.out.println(diff.getFieldName() + ": " + diff.getLeft() + " -> " + diff.getRight()));
    }
}

@AllArgsConstructor
@Data
@EqualsAndHashCode
class ContactEntity {
    private String name;
    private String email;
    private String mobileNo;
    private Address address;

}

@AllArgsConstructor
@Data
class Address {
    private String street;
    private String city;
    private String country;
}
