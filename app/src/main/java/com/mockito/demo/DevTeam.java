package com.mockito.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nling on 3/16/2017.
 */
public class DevTeam {

    private static final String TAG = DevTeam.class.getSimpleName();

    private List<Developer> developerList;

    public DevTeam() {
        developerList = new ArrayList<>();
    }

    public void addDevelopers(Developer... developers) {

        if (developers != null && developers.length > 0) {

            for (Developer dev : developers) {
                developerList.add(dev);
            }
        }
    }

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public int getDevelopersNumber() {
        return developerList.size();
    }

    public int getDevelopersSize() {
        return developerList.size();
    }

    /**
     * @param name
     */
    public List<Developer> getDeveloperByName(String name) {
        List devs = new ArrayList<>();
        for (Developer dev : developerList) {
            if (name.equals(dev.getName())) {
                devs.add(dev);
            }
        }

        return devs;
    }
}
