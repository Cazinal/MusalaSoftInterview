package com.phonebook;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
  // List instead of Map, for better printing performance.
  private List<Contact> contacts = new ArrayList<>();

  // Compile pattern here, just once to improve performance
  private static final Pattern pattern = Pattern.compile("(\\+359|0|00359)(8[7-9][2-9][0-9]{6})");
  private static final String countryCode = "+359";

  public void addContact(String name, String number) {
    Contact contact = new Contact(name, number);
    if (contacts.contains(contact)) return;

    Matcher matcher = pattern.matcher(number);
    if (!matcher.matches()) return;
    contact.setNumber(countryCode + matcher.group(2));
    contacts.add(contact);
    Collections.sort(contacts);
  }

  public void removeContact(String name) {
    contacts.removeIf(c -> c.getName().equals(name));
    Collections.sort(contacts);
  }

  public String getNumber(String name) {
    for (Contact contact : contacts) {
      if (contact.getName().equals(name)) {
        return contact.getNumber();
      }
    }

    return null;
  }

  public void call(Contact contact) {
    // In a real PhoneBook we'd have code that actually makes a call here
    contact.incrementOutgoingCalls();
  }

  public void printContacts() {
    for (Contact contact : contacts) {
      contact.print();
    }
  }

  public void printMostCalled() {
    // TODO needs to be efficient. Is Map efficient enough?
    // TODO Or try to create our own Comparator to sort by outgoingCalls?.
  }

  public static void main(String[] args) {
    PhoneBook pb = new PhoneBook();
    File file = new File(PhoneBook.class.getResource("contacts.txt").getFile());

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String line = br.readLine();

      while (line != null) {
        String[] splitLine = line.split(", ");
        pb.addContact(splitLine[0], splitLine[1]);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.err.printf("\nCould not read file. Exception msg: %s", e.getMessage());
    }

    pb.printContacts();
  }
}
