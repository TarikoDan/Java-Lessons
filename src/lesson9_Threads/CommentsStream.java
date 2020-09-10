package lesson9_Threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class CommentsStream implements Runnable{
    private final HttpURLConnection httpURLConnection;

    public CommentsStream(HttpURLConnection httpURLConnection) {
        this.httpURLConnection = httpURLConnection;
    }

    @Override
    public void run() {
        InputStream commentsInputStream = null;
        try {
            commentsInputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            try {
                if (!((i = commentsInputStream.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuilder.append((char)i);
        }
        System.out.println(stringBuilder.toString());


    }
}
