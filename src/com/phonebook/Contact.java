package com.phonebook;

import com.sun.istack.internal.NotNull;

import java.util.List;

public class Contact implements Comparable<Contact> {
  @NotNull
  private String name;

  @NotNull
  private String number;

  private int outgoingCalls;

  public Contact() {

  }

  public Contact(String name, String number) {
    this.name = name;
    this.number = number;
  }

  /**
   * Required to make sorting lists containing {@link Contact} easier
   * using {@link java.util.Collections#sort(List)}
   *
   * @param o Another contact to compare this one to.
   * @return
   */
  @Override
  public int compareTo(Contact o) {
    return name.compareTo(o.getName());
  }

  // TODO HashMaps use a combination of equals and HashCode
  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Contact)) return false;
    Contact otherContact = (Contact) other;
    return name.equals(otherContact.getName());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public int getOutgoingCalls() {
    return outgoingCalls;
  }

  public void setOutgoingCalls(int outgoingCalls) {
    this.outgoingCalls = outgoingCalls;
  }

  public void incrementOutgoingCalls() {
    this.outgoingCalls++;
  }

  public void print() {
    System.out.println(name + ", " + number);
  }
}
