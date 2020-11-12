package homework2;

public class PhoneMain {

    public static void main(String... args) {

        MotorolaEdge phone1 = new MotorolaEdge( "Motorola Edge Plus","black",128 );
        MotorolaEdge phone2 = new MotorolaEdge("Motorola Edge","white",64);
        MotorolaG9 phone3 = new MotorolaG9("Motorola G9 Plus", "gray");

        phone1.addContact("1", "Monica", "Neculai", "0753577188");
        phone1.addContact("2", "Iulia", "Molnar", "026413886142");

        System.out.println("\n");

        phone2.addContact("1", "Adrian", "Trif", "0741611383");
        phone2.addContact("2", "Marius", "Bucur", "0732121136");
        phone2.addContact("3", "Andreea", "Bartos", "07668352131");

        System.out.println("\n");

        phone3.addContact("1", "Alex", "Chis", "0763857931");

        System.out.println("\n Contacts of phone1:");
        phone1.listContacts();

        System.out.println("\n Contacts of phone2:");
        phone2.listContacts();

        System.out.println("\n Send messages: ");

        phone1.sendMessage(phone1.getContacts().get(0).getPhoneNumber(), "Alex are jucarii!");
        phone2.sendMessage(phone2.getContacts().get(2).getPhoneNumber(), "Alex vrea mai multe jucarii!");

        System.out.println("\n Messages of phone1:");

        phone1.listMessages();

        System.out.println("\n Make calls: ");

        phone2.call(phone2.getContacts().get(1).getPhoneNumber());
        phone2.call(phone2.getContacts().get(2).getPhoneNumber());

        System.out.println("\n Calls history: ");
        phone2.viewHistory();
    }
}

