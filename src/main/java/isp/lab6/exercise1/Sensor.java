package isp.lab6.exercise1;

import java.util.*;
import java.util.Comparator;

public class Sensor  {
    private SENSOR_TYPE type;

    private String id;

    List<SensorReading> sensorReadingsList = new ArrayList<SensorReading>();

    public Sensor(String id, SENSOR_TYPE type){
        this.type = type;
        this.id = id;
    }
    public List<SensorReading> getSensorReadingsSortedByDateAndTime(){
            ///Collections.sort(sensorReadingsList);
        return sensorReadingsList;
    }

    public List<SensorReading> getSensorReadingsSortedByValue() {
        Collections.sort(sensorReadingsList, new Comparator<SensorReading>() {
            @Override
            public int compare(SensorReading o1, SensorReading o2) {
                if(o1.getValue()<o2.getValue())
                    return -1;
                if(o1.getValue()>o2.getValue())
                    return 1;
                return 0;
            }
        });
        for(SensorReading s : sensorReadingsList)
            System.out.println(s);
        return sensorReadingsList;
        }
    /**
     * thie method add a new reading to the sensorReadingList
     * @param sensorReading the given reading to add
     * @return true if the given reading exists (is not null) or false if it is null (it does not exists)
     */
    public boolean addSensorReading(SensorReading sensorReading){
        if(sensorReading!=null) {
            sensorReadingsList.add(sensorReading);
            return true;
        }
        return false;
    }
    public String getId(){
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sensor)) return false;
        Sensor sensor = (Sensor) o;
        return type == sensor.type &&
                id.equals(sensor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, sensorReadingsList);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", sensorReadingsList=" + sensorReadingsList +
                '}';
    }
}
