package isp.lab6.exercise1;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class sensorClusterTest {
    @Test
    public void sensorClusterTest(){
        SensorsCluster sensorCluster = new SensorsCluster();
        sensorCluster.addSensor("id1", SENSOR_TYPE.HUMIDITY);
        sensorCluster.addSensor("id2", SENSOR_TYPE.TEMPERATURE);
        sensorCluster.addSensor("id3", SENSOR_TYPE.PRESSURE);

        sensorCluster.writeSensorReading("id2", 15, LocalDateTime.of(2020, 04, 02, 4, 35, 00));
        sensorCluster.writeSensorReading("id1", 5, LocalDateTime.of(2019, 03, 02, 9, 45, 00));
        sensorCluster.writeSensorReading("id2", 10, LocalDateTime.of(2020, 05, 02, 4, 34, 00));
        sensorCluster.writeSensorReading("id3", 25, LocalDateTime.of(2020, 06, 02, 12, 20, 00));
        sensorCluster.writeSensorReading("id3", 5, LocalDateTime.of(2020, 06, 02, 8, 15, 00));
        assertEquals("SensorsCluster{sensorsList=[Sensor{type=HUMIDITY, id='id1', sensorReadingsList=[SensorReading{dateAndTime=2019-03-02T09:45, value=5.0}]}, Sensor{type=TEMPERATURE, id='id2', sensorReadingsList=[SensorReading{dateAndTime=2020-04-02T04:35, value=15.0}, SensorReading{dateAndTime=2020-05-02T04:34, value=10.0}]}, Sensor{type=PRESSURE, id='id3', sensorReadingsList=[SensorReading{dateAndTime=2020-06-02T12:20, value=25.0}, SensorReading{dateAndTime=2020-06-02T08:15, value=5.0}]}]}",sensorCluster.toString());
    }
}
