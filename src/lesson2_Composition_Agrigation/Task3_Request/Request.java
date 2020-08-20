package lesson2_Composition_Agrigation.Task3_Request;


import java.time.LocalDate;
import java.util.Date;

public class Request {

    private int number;
    private String date;
    private Type type;
    private Client client;

    public Request() {
    }

    public Request(int number, String date, Type type, Client client) {
        this.number = number;
        this.date = date;
        this.type = type;
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Request{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", client=" + client +
                '}';
    }
}
enum Type {
    AFFIRMATION, DECLARATION, INITIALIZATION, AGGREGATION, COMPOSITION, CLAIM,
}

