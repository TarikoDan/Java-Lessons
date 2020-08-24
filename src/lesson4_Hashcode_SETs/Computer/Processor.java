package lesson4_Hashcode_SETs.Computer;

public class Processor {
    String type;
    int coresNum;
    int frequency;
    MadeIn madeIn;

    public Processor(String type, int coresNum, int frequency, MadeIn madeIn) {
        this.type = type;
        this.coresNum = coresNum;
        this.frequency = frequency;
        this.madeIn = madeIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoresNum() {
        return coresNum;
    }

    public void setCoresNum(int coresNum) {
        this.coresNum = coresNum;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", coresNum=" + coresNum +
                ", frequency=" + frequency +
                ", madeIn=" + madeIn +
                '}';
    }
}
