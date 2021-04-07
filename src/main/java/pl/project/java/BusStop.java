package pl.project.java;

import javax.persistence.*;

@Entity
public class BusStop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String departureOneTime;
    private String departureTwoTime;
    private String departureThreeTime;
    private String departureFourTime;
    private String departureFiveTime;
    private String busStopName;
    private int busLineNumber;
    private String direction;

    @ManyToOne
    private Bus bus;

    public BusStop(String departureOneTime, String departureTwoTime, String departureThreeTime, String departureFourTime, String departureFiveTime, String busStopName, int busLineNumber, String direction)
    {
        this.busLineNumber = busLineNumber;
        this.busStopName = busStopName;
        this.departureOneTime = departureOneTime;
        this.departureTwoTime = departureTwoTime;
        this.departureThreeTime = departureThreeTime;
        this.departureFourTime = departureFourTime;
        this.departureFiveTime = departureFiveTime;
        this.direction = direction;
    }

    public BusStop() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartureOneTime() {
        return departureOneTime;
    }

    public void setDepartureOneTime(String departureOneTime) {
        this.departureOneTime = departureOneTime;
    }

    public String getDepartureTwoTime() {
        return departureTwoTime;
    }

    public void setDepartureTwoTime(String departureTwoTime) {
        this.departureTwoTime = departureTwoTime;
    }

    public String getDepartureThreeTime() {
        return departureThreeTime;
    }

    public void setDepartureThreeTime(String departureThreeTime) {
        this.departureThreeTime = departureThreeTime;
    }

    public String getDepartureFourTime() {
        return departureFourTime;
    }

    public void setDepartureFourTime(String departureFourTime) {
        this.departureFourTime = departureFourTime;
    }

    public String getDepartureFiveTime() {
        return departureFiveTime;
    }

    public void setDepartureFiveTime(String departureFiveTime) {
        this.departureFiveTime = departureFiveTime;
    }

    public int getBusLineNumber() {
        return busLineNumber;
    }

    public void setBusLineNumber(int busLineNumber) {
        this.busLineNumber = busLineNumber;
    }

    public String getBusStopName() {
        return busStopName;
    }

    public void setBusStopName(String busStopName) {
        this.busStopName = busStopName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
