package pl.project.java;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bus
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int busLineNumber;
    private String directionOne;
    private String directionTwo;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BusStop> busStopSet;

    public Bus(int busLineNumber, String directionOne, String directionTwo)
    {
        this.busLineNumber = busLineNumber;
        this.directionOne = directionOne;
        this.directionTwo = directionTwo;
    }

    public Bus()
    {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBusLineNumber() {
        return busLineNumber;
    }

    public void setBusLineNumber(int busLineNumber) {
        this.busLineNumber = busLineNumber;
    }

    public String getDirectionOne() {
        return directionOne;
    }

    public void setDirectionOne(String directionOne) {
        this.directionOne = directionOne;
    }

    public String getDirectionTwo() {
        return directionTwo;
    }

    public void setDirectionTwo(String directionTwo) {
        this.directionTwo = directionTwo;
    }
}
