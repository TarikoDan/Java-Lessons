package lesson5_Lambda_Stream.Computer;

public class HardDrive {
    String model;
    DiskType disktype;
    int volume;
    MadeIn madeIn;

    public HardDrive(String model, DiskType disktype, int volume, MadeIn madeIn) {
        this.model = model;
        this.disktype = disktype;
        this.volume = volume;
        this.madeIn = madeIn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DiskType getDisktype() {
        return disktype;
    }

    public void setDisktype(DiskType disktype) {
        this.disktype = disktype;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", disktype=" + disktype +
                ", volume=" + volume +
                ", madeIn=" + madeIn +
                '}';
    }
}
