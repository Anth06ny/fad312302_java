package main.beans;

public class LoadedDiceBean extends DiceBean {

    private int loadedFace;

    public LoadedDiceBean(int loadedFace) {
        this.loadedFace = loadedFace;
    }


    @Override
    public void roll() {
        if (random.nextBoolean()) {
            super.roll();
        } else {
            value = loadedFace;
        }
    }

    public int getLoadedFace() {
        return loadedFace;
    }

    public void setLoadedFace(int loadedFace) {
        this.loadedFace = loadedFace;
    }
}
