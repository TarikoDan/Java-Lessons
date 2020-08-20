package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public enum Sizes {
    XXS(40) {
        @Override
        String getDescription() {return "Smallest";};
    },
    XS(42) {
        @Override
        String getDescription() {return "Extra Small";};
    },
    S(44) {
        @Override
        String getDescription() {return "Small";};
    },
    M(46) {
        @Override
        String getDescription() {return "Medium";};
    },
    L(48) {
        @Override
        String getDescription() {return "Large";};
    },
    XL(50) {
        @Override
        String getDescription() {return "Extra Large";};
    },
    XXL(52) {
        @Override
        String getDescription() {return "Large";};
    };
    public int euroSize;
    abstract String getDescription();

    Sizes() {
    }

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
}
