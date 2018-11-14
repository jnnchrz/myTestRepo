package pl.infoshare.ten.ZadDom.model;

import java.time.LocalDate;

public class Stypendysta extends Student {

    private double stypendium;

    public Stypendysta(LocalDate dataurodzenia, char sex, int numerIndeksu, double stypendium) {
        super(dataurodzenia, sex, numerIndeksu);
        this.stypendium = stypendium;
    }

    public double getStypendium() {
        return stypendium;
    }

    public void setStypendium(double stypendium) {
        this.stypendium = stypendium;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwota stypendium: " + stypendium + "/n";
    }
}
