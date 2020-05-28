package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType= positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        if (this.employer == null && this.name == null
                && this.location == null && this.positionType == null
                && this.coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        }
        String nameValue = this.name;
        String employerValue = this.getEmployer().toString();
        String locationValue = this.getLocation().toString();
        String positionTypeValue = this.getPositionType().toString();
        String coreCompetencyValue = this.getCoreCompetency().toString();

        if (this.employer.getValue() == null) {
            employerValue = "Data not available";
        }
        if (this.name == null) {
            nameValue = "Data not available";
        }
        if (this.location.getValue() == null) {
            locationValue = "Data not available";
        }
        if (this.positionType.getValue() == null) {
            positionTypeValue = "Data not available";
        }
        if (this.coreCompetency.getValue() == null) {
            coreCompetencyValue = "Data not available";
        }

        return "\nID: " + this.id+ "\nName: " + nameValue + "\nEmployer: "
                + employerValue + "\nLocation: " + locationValue
                + "\nPosition Type: " + positionTypeValue
                + "\nCore Competency: " + coreCompetencyValue + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
