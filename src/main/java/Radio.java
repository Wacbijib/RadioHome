public class Radio {
    private int radioStation;
    private int radioVolume;
    private int maxRadioStaton;

    public Radio() {
        maxRadioStaton = 10;
    }

    public Radio(int radioStationCount) {
        maxRadioStaton = radioStationCount - 1;
    }

    public void next() {
        if (radioStation != maxRadioStaton) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prev() {
        if (radioStation != 0) {
            radioStation--;
        } else {
            radioStation = maxRadioStaton;
        }
    }

    public void volumeUp() {
        if (radioVolume != 100) {
            radioVolume++;
        } else {
            radioVolume = 100;
        }
    }

    public void volumeDown() {
        if (radioVolume != 0) {
            radioVolume--;
        } else {
            radioVolume = 0;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > maxRadioStaton) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 100) {
            return;
        }
        this.radioVolume = radioVolume;
    }
}


