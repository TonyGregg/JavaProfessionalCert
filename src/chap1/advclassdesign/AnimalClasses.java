package chap1.advclassdesign;

/**
 * Created by genil on 2/11/19 at 18 26
 **/
public enum  AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE);

    boolean hasHair;

    public boolean isHasHair() {
        return hasHair;
    }

    private AnimalClasses(Boolean hasHair) {
        this.hasHair = hasHair;

    }
}
