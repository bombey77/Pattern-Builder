
public class Main {

    public static void main(String[] args) {

        final Contacts contacts = new Contacts.ContactsBuilder()
                .name("Roman")
                .surname("Motovilov")
                .address("Kremlivska")
                .age(30)
                .gender(true)
                .build();

        System.out.println(contacts.getName());
        System.out.println(contacts.getSurName());
        System.out.println(contacts.getAddress());
        System.out.println(contacts.getAge());
        System.out.println(contacts.getGender());
    }
}
