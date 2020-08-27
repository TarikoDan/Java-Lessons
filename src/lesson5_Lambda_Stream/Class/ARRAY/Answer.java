package lesson5_Lambda_Stream.Class.ARRAY;

import java.util.List;

public class Answer {

    int minIndex;
    int maxIndex;
    void print(List<Integer> integers, int key) {
        this.minIndex = integers.indexOf(key);
        this.maxIndex = integers.lastIndexOf(key);
    }

    public Answer() {
    }

    public int getMinIndex() {
        return minIndex;
    }

    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "minIndex=" + minIndex +
                ", maxIndex=" + maxIndex +
                '}';
    }
}
