package isp.lab6.exercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Objects;

public class SensorReading implements Comparable<SensorReading>  {
    private LocalDateTime dateAndTime;

    private double value;

    public SensorReading(LocalDateTime dateAndTime,double value){
        this.dateAndTime=dateAndTime;
        this.value=value;
    }
    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }
    /**
     * Compare Sensors by date and time
     * @param o one of the sensor to compare
     * @return 1 and -1 if the date and time are different and 0 if the date and time are the same
     */
    @Override
    public int compareTo(SensorReading o) {
        if (this.dateAndTime.compareTo(o.dateAndTime) > 0)
            return 1;
        if (this.dateAndTime.compareTo(o.dateAndTime) == 0)
            return 0;
        return -1;
    }

    /**
     * this equals method use the dataAndTime parameter to compare objects
     * @param o the object given as an argument to compare
     * @return false if the dataAndTime or there is nothing in the o object are not the same and true if they are
     */
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof SensorReading)) return false ;
        SensorReading other = (SensorReading) o;
        return this.dateAndTime==other.dateAndTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateAndTime, value);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SensorReading{" +
                "dateAndTime=" + dateAndTime +
                ", value=" + value +
                '}';
    }
}
