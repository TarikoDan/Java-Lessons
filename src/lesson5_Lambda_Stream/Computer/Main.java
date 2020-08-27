package lesson5_Lambda_Stream.Computer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HardDrive hdd500_Samsung = new HardDrive("HD502HJ", DiskType.HDD, 512, MadeIn.KOREA);
        HardDrive hdd1TB_SeaGate = new HardDrive("ST1000DM010", DiskType.HDD, 1024, MadeIn.USA);
        HardDrive hdd2TB_SeaGate = new HardDrive("ST2000DM008", DiskType.HDD, 2048, MadeIn.USA);
        HardDrive hdd6TB_SeaGate = new HardDrive("ST6000NE000", DiskType.HDD, 6144, MadeIn.USA);
        HardDrive hdd1TB_Toshiba = new HardDrive("HDWD110UZSVA", DiskType.HDD, 1024, MadeIn.CHINA);
        HardDrive hdd4TB_Toshiba = new HardDrive("HDWD240UZSVA ", DiskType.HDD, 4096, MadeIn.CHINA);
        HardDrive ssd480_Intel = new HardDrive("SSDSC2KG480G801 ", DiskType.SSD, 480, MadeIn.USA);
        HardDrive ssd500_Samsung = new HardDrive("MZ-76E500BW ", DiskType.SSD, 512, MadeIn.KOREA);
        HardDrive ssd1Tb_Samsung = new HardDrive("MZ-V7E1T0BW ", DiskType.SSD, 1024, MadeIn.KOREA);

        Processor i7_6600U = new Processor("Intel i7 Skylake", 2, 3400, MadeIn.USA);
        Processor i5_6500 = new Processor("Intel i7 Skylake", 4, 3600, MadeIn.USA);
        Processor i7_6700 = new Processor("Intel i7 Skylake", 4, 4000, MadeIn.USA);
        Processor i7_7820X = new Processor("Intel i7 Skylake", 8, 4300, MadeIn.USA);
        Processor i5_6600 = new Processor("Intel i7 Skylake", 4, 3900, MadeIn.USA);
        Processor i7_9700 = new Processor("Intel i7 CoffeeLake", 8, 4700, MadeIn.USA);
        Processor i5_9400 = new Processor("Intel i5 CoffeeLake", 6, 4100, MadeIn.USA);
        Processor i7_1060G7 = new Processor("Intel i7 IceLake", 4, 3800, MadeIn.CHINA);
        Processor i5_1030G4 = new Processor("Intel i5 IceLake", 4, 3500, MadeIn.CHINA);
        Processor R5_3500 = new Processor("AMD Rysen5 3500", 6, 4100, MadeIn.INDIA);
        Processor R7_3700 = new Processor("AMD Rysen7 3700", 8, 4400, MadeIn.INDIA);

        Computer dell_laptop = new Computer("DelllatitudeE5570", 2015, 4, 352, hdd500_Samsung, i7_6600U);
        Computer dell_comp1 = new Computer("Dellskdjcfv", 2019, 8, 1999, hdd6TB_SeaGate, i7_1060G7);
        Computer dell_comp2 = new Computer("Dellsdsd", 2017, 6, 1617, ssd1Tb_Samsung, R7_3700);
        Computer dell_comp3 = new Computer("Dellqweq", 2018, 8, 1824, hdd4TB_Toshiba, i5_1030G4);
        Computer dell_comp4 = new Computer("Delldfvfg", 2016, 4, 931, hdd4TB_Toshiba, i7_6700);
        Computer dell_comp5 = new Computer("Dellfdv5dfv2fv", 2017, 4, 721, hdd2TB_SeaGate, i5_6500);
        Computer HP_comp1 = new Computer("HP-315649", 2019, 16, 2721, hdd6TB_SeaGate, R7_3700);
        Computer HP_comp2 = new Computer("HP-84984", 2018, 8, 1413, ssd1Tb_Samsung, i7_9700);
        Computer HP_comp3 = new Computer("HP-7852295", 2017, 6, 1143, hdd2TB_SeaGate, i7_7820X);
        Computer HP_comp4 = new Computer("HP-7852295", 2017, 4, 914, hdd1TB_Toshiba, i7_6700);
        Computer HP_comp5 = new Computer("HP-454578", 2016, 2, 514, hdd500_Samsung, i5_6600);
        Computer HP_comp6 = new Computer("HP-fff", 2015, 2, 374, hdd500_Samsung, i5_6500);
        Computer comp = new Computer("xxx", 2009, 1, 88, ssd480_Intel, i5_9400);

        Computer Lenovo_comp1 = new Computer("Lenovo ThinkPad", 2019, 8, 888, hdd1TB_SeaGate, R5_3500);
        Computer Lenovo_comp2 = new Computer("Lenovo ThinkPad", 2019, 8, 1288, ssd1Tb_Samsung, i7_1060G7);
        Computer Lenovo_comp3 = new Computer("Lenovo ThinkPad", 2018, 4, 999, ssd1Tb_Samsung, i7_7820X);
        Computer Lenovo_comp4 = new Computer("Lenovo ThinkPad", 2017, 4, 587, ssd1Tb_Samsung, i7_6700);
        Computer Lenovo_comp5 = new Computer("Lenovo ThinkPad", 2019, 6, 1122, ssd500_Samsung, R7_3700);


        List<Computer> computers = new ArrayList<>();
        Computer[] dell_comps = new Computer[]{dell_comp1, dell_comp2, dell_comp3, dell_comp4, dell_comp5, dell_laptop};
        Computer[] hp_comps = new Computer[]{HP_comp1, HP_comp2,HP_comp3,HP_comp4,HP_comp5,HP_comp6,comp};
        Computer[] Lenovo_comps = new Computer[]{Lenovo_comp4, Lenovo_comp3,Lenovo_comp2, Lenovo_comp1, Lenovo_comp5};
        computers.addAll(Arrays.asList(dell_comps));
        computers.addAll(Arrays.asList(hp_comps));
        computers.addAll(Arrays.asList(Lenovo_comps));
        System.out.println(computers);
        System.out.println("-------------------");

        Iterator<Computer> iterator = computers.iterator();
        while (iterator.hasNext()) {
            Computer next = iterator.next();
            System.out.println(next.price);
        }
        System.out.println("+++++++++sorted+++++++++");

        computers.sort((o1, o2) -> (int) (o2.price - o1.price));
        for (Computer computer : computers) {
            System.out.println(computer.price);
        }
        System.out.println("++++++++TreeSet++++++++++");

        Set<Computer> sortComps = new TreeSet<>(computers);
        for (Computer next : sortComps) {
            System.out.println(next.price);
        }
        System.out.println("+++++++++++++++++++");



//        for (Computer computer : computers) {
//            if (computer.year > 2010 ) {
//                System.out.println(computer.year);
//            }
//        }

//        for (Computer computer : computers) {
//            if (computer.year > 2010 && !computer.hardDrive.madeIn.equals(MadeIn.CHINA)) {
//                System.out.println(computer.hardDrive.madeIn);
//            }
//        }

        for (Computer computer : computers) {
            if (computer.hardDrive.disktype.equals(DiskType.SSD) && computer.processor.getType().contains("i7")) {
                System.out.println(computer.hardDrive.disktype + " " + computer.hardDrive.volume+ " " + computer.processor.type+ " " + computer.price);
            }
        }
    }
}
