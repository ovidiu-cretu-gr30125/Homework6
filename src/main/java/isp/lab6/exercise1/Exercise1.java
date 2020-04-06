package isp.lab6.exercise1;

import java.time.LocalDateTime;

public class Exercise1 {

    public static void main(String[] args) {
        SensorsCluster sensorCluster = new SensorsCluster();
        sensorCluster.addSensor("id1", SENSOR_TYPE.HUMIDITY);
        sensorCluster.addSensor("id2", SENSOR_TYPE.TEMPERATURE);
        sensorCluster.addSensor("id3", SENSOR_TYPE.PRESSURE);

        sensorCluster.writeSensorReading("id2", 15, LocalDateTime.of(2020, 04, 02, 4, 35, 00));
        sensorCluster.writeSensorReading("id1", 5, LocalDateTime.of(2019, 03, 02, 9, 45, 00));
        sensorCluster.writeSensorReading("id2", 10, LocalDateTime.of(2020, 05, 02, 4, 34, 00));
        sensorCluster.writeSensorReading("id3", 25, LocalDateTime.of(2020, 06, 02, 12, 20, 00));
        sensorCluster.writeSensorReading("id3", 5, LocalDateTime.of(2020, 06, 02, 8, 15, 00));

        System.out.println(sensorCluster.toString());
        System.out.println("......................");
        sensorCluster.getSensorById("id2");
        System.out.println(" ");
        sensorCluster.getSensorById("id3");
    }
}


