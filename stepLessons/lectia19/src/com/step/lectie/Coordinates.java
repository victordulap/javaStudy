package com.step.lectie;

import java.util.Objects;

public class Coordinates {
    private Double latitude;
    private Double longitude;

    public Coordinates(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Coordinates that = (Coordinates) o;
//        return Objects.equals(latitude, that.latitude) &&
//                Objects.equals(longitude, that.longitude);
        if (o == null) return false;
        if (!(o instanceof Coordinates)) return false;

        Coordinates coord = (Coordinates) o;
        return latitude.equals(coord.latitude) && longitude.equals(coord.longitude);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(latitude, longitude);
        // 7 rand
        int hash = 7;

        // 16 rand
        hash = 16 * hash + Objects.hashCode(latitude);
        hash = 16 * hash + Objects.hashCode(longitude);

        return hash;
    }
}
