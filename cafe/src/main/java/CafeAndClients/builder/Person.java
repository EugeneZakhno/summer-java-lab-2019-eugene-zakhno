package CafeAndClients.builder;


public class Person {

    private String name;
    private String surname;
    private String address;
    private int age;
    private String phoneNumber;



    public String getName() {
        return name;
    }

    public String getSurname() { return surname; }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withAddress(String address){
            newPerson.address = address;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber){
            newPerson.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }


        public Person build(){
            return newPerson;
        }

    }


    public String print() {
        String info = "";
        info += "Client: " + "\n";
        info += "name - " + name + "\n";
        info += "surname - " + surname + "\n";
        info += "age -  " + age + "\n";
        info += "adress - " + address + "\n";
        if (this.phoneNumber != null) {
            info += "phone number - " + phoneNumber + "\n";
        } else {
            info += "phone number - not" + "\n";
        }
        ;
        return info;
    }




}