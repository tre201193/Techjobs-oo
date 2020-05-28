package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return this.getId() == that.getId();
    }
}
