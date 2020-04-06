package isp.lab6.exercise1;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SensorsCluster {

    List<Sensor> sensorsList = new ArrayList<Sensor>();

    /**
     * this method should add a sensor in the sensorsList if the sensor with given id does not exits
     * @param sensorId the sensor id that is given
     * @param type the type of the sensor (one of TEMPERATURE,HUMIDITY,PRESSURE)
     * @return null if the sensor with the given id exits or the instance of the new sensor
     */
    public Sensor addSensor(String sensorId, SENSOR_TYPE type){
        for(Sensor s: sensorsList){
            if(sensorId!=s.getId())
                sensorsList.add(s =new Sensor(sensorId,type));
           return s;
        }
        return null;
    }

    /**
     * thie method should write a reading in the correct sensor by given id
     * @param sensorId the id given for the sensor to add reading
     * @param value the value for reading
     * @param dateTime the date and time for reading
     * @return true if the given id matches with a sensor and a new reading is added of return false is there is no sensor with the given id
     */
    public boolean writeSensorReading(String sensorId, double value , LocalDateTime dateTime){
        for(Sensor s : sensorsList){
            if(sensorId==s.getId()){
                s.addSensorReading(new SensorReading(dateTime,value));
                return true;
            }
        }
        return false;
    }

    /**
     * this method search for the sensor from sensorsList with the given id
     * @param sensorId the id given for the searching sensor
     * @return the instance of the searching sensor by the given id and the readings sorted by date and time and readings sorted by value
     */
    public Sensor getSensorById(String sensorId){
        for(Sensor s : sensorsList){
            if(sensorId.equals(s.getId()))
                return s;
            System.out.println("Readings sorted by date and time");
            System.out.println(s.getSensorReadingsSortedByDateAndTime());
            System.out.println("Readings sorted by value");
            System.out.println(s.getSensorReadingsListSortedByValue());
        }
        return null;
    }
}
