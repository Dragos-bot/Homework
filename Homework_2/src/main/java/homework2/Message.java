package homework2;

public class Message {


    private String number;
    private String text;
    private final static int max_number_of_caracteres = 500;

    public Message(String number, String text) {
        this.number = number;
        if(text.length() <= max_number_of_caracteres)
            this.text = text;
        else
            System.out.println("Number of characters should be less then " + max_number_of_caracteres);
    }

    public String getContact() {
        return number;
    }

    public void setContact(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
