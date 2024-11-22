package org.builder;

import org.builder.domain.Address;
import org.builder.domain.Contact;
import org.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts ;

    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    public static class EmployeeBuilder implements IBuilder{

        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }
        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this;
        }
        public EmployeeBuilder setAddress(String address, String city, String country, String cp){
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone){
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String number, String extension, String type){
            this.phones.add(new Phone(number,extension,type));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address){
            this.contacts.add(new Contact(name,phone,address));
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(age, name, gender, address, phones, contacts);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, age=" + age +
                "\n, name='" + name + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                "}";
    }
}
