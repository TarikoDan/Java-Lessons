package lesson9_Threads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL commentUrl = new URL("https://jsonplaceholder.typicode.com/comments");
        HttpURLConnection commentConnection = (HttpURLConnection) commentUrl.openConnection();
        int respCommentsCode = commentConnection.getResponseCode();
        if (respCommentsCode == HttpURLConnection.HTTP_OK) {
            CommentsStream commentsStream = new CommentsStream(commentConnection);
            Thread commentsThread = new Thread(commentsStream);
            commentsThread.start();
        }
    }
}
