package train.astractions;

import java.io.Serializable;
import java.util.Objects;

public abstract class CarriageModule {
    private int passengerCapacity;

    public CarriageModule (int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public CarriageModule (CarriageModule resourceModule) {
        if (resourceModule != null) {
            this.passengerCapacity = resourceModule.getPassengerCapacity();
        }
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public abstract CarriageModule getClone();

    @Override
    public String toString() {
        return "CarriageModule{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarriageModule that = (CarriageModule) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity);
    }
}
