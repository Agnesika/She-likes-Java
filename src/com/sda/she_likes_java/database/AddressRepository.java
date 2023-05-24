package com.sda.she_likes_java.database;

import java.util.List;

public class AddressRepository {

    private static final String allAddressesQuery = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            """;
    private static final String findAddressById = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE ID = %d -- %d just represents a number
            """;
    private static final String getFindAddressesByCityAndCountry = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE CITY = %s AND COUNTRY = %s
            """;
    public static List<Address> getAllUsers() {
        return List.of();
    }
}
