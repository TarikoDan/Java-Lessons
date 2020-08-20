package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public class Main {
    public static void main(String[] args) {
        Sizes sizeL = Sizes.L;
        System.out.println(sizeL.euroSize);
        System.out.println(sizeL.getDescription());

        TShirt tShirtMWhite = new TShirt(Sizes.M, "White", 38.5);
        tShirtMWhite.putOnMAN();
        TShirt tShirtXSRed = new TShirt(Sizes.XS, "red", 97.12);
        Dress dressSBlack = new Dress(Sizes.S, "black", 157.5);
        Dress dressMBlack = new Dress(Sizes.M, "black", 157.5);
        Dress dressLBlack = new Dress(Sizes.L, "black", 157.5);
        Pents jensM = new Pents(Sizes.M, "blue", 43.0);
        Pents jensMWhite = new Pents(Sizes.M, "white", 48.0);
        Pents jensXL = new Pents(Sizes.XL, "blue", 43.0);
        Pents jensLWhite = new Pents(Sizes.L, "white", 48.0);
        Tie narrowTie = new Tie(Sizes.M, "black", 117.4);
        Tie wideTie = new Tie(Sizes.M, "coloured", 24.4);

        Wear[] wearSet = new Wear[]{dressLBlack,dressMBlack,dressSBlack,jensLWhite,jensM,jensMWhite,jensXL,narrowTie,tShirtMWhite,tShirtXSRed,wideTie};
        Atelier modaMarket = new Atelier(wearSet);
        System.out.println(modaMarket.optionMAN());
        System.out.println(modaMarket.optionWOMAN());

    }
}
