package isp.lab6.exercise1;

import java.util.*;

public class Sensor implements Comparator<SensorReading> {
    private SENSOR_TYPE type;

    private String id;

    public Sensor(String id, SENSOR_TYPE type){
        this.type = type;
        this.id = id;
    }

    List<SensorReading> sensorReadingsList = new ArrayList<SensorReading>();

    public List<SensorReading> getSensorReadingsSortedByDateAndTime(){
        ///Collections.sort(sensorReadingsList);
        return sensorReadingsList;
    }
    @Override
    public int compare(SensorReading o1, SensorReading o2) {
        if(o1.getValue() > o2.getValue())
            return 1;
        if(o1.getValue() < o2.getValue())
            return -1;
        return 0;
    }

    public List<SensorReading> getSensorReadingsListSortedByValue(){
        ///Collections.sort(sensorReadingsList);
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
}
