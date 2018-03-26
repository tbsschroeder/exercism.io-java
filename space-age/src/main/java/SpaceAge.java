class SpaceAge {

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth(){
        //orbital period 365.25 Earth days, or 31557600 seconds
        return getSeconds() / 365.0 / 24.0 / 3600.0;
    }
    double onMercury(){
        //orbital period 0.2408467 Earth years
        return this.onEarth() / 0.2408467;
    }
    double onVenus(){
        //orbital period 0.61519726 Earth years
        return this.onEarth() / 0.61519726;
    }
    double onMars(){
        //orbital period 1.8808158 Earth years
        return this.onEarth() * 1.8808158;
    }
    double onJupiter(){
        //orbital period 11.862615 Earth years
        return this.onEarth() * 11.862615;
    }
    double onSaturn(){
        //orbital period 29.447498 Earth years
        return this.onEarth() * 29.447498;
    }
    double onUranus(){
        //orbital period 84.016846 Earth years
        return this.onEarth() * 84.016846;
    }
    double onNeptune(){
        //orbital period 164.79132 Earth years
        return this.onEarth() * 164.79132;
    }

}
