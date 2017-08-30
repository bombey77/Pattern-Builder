
public class Contacts {

    private String name;
    private String surName;
    private String address;
    private int age;
    private boolean gender;

    Contacts(final ContactsBuilder contactsBuilder) {
        this.name = contactsBuilder.name;
        this.surName = contactsBuilder.surName;
        this.address = contactsBuilder.address;
        this.age = contactsBuilder.age;
        this.gender = contactsBuilder.gender;
    }

    public static class ContactsBuilder {

        private String name;
        private String surName;
        private String address;
        private int age;
        private boolean gender;

        public ContactsBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public ContactsBuilder surname(final String surName) {
            this.surName = surName;
            return this;
        }

        public ContactsBuilder address(final String address) {
            this.address = address;
            return  this;
        }

        public ContactsBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public ContactsBuilder gender(final boolean gender) {
            this.gender = gender;
            return this;
        }

        public Contacts build() {
            return new Contacts(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }
}
