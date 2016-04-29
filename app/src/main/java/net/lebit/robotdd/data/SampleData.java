package net.lebit.robotdd.data;

import net.lebit.robotdd.models.Guest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ataeschner on 29.04.2016.
 */
public class SampleData {
    public static List<Guest> getSampleGuests() {
        List<Guest> tempGuests = new ArrayList<Guest>();

        Guest guest1 = new Guest();
        guest1.setName("Debbie Sam");
        guest1.setEmailAddress("deb@email.net");
        guest1.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest1.JPG");
        tempGuests.add(guest1);


        Guest guest2 = new Guest();
        guest2.setName("Keisha Williams");
        guest2.setEmailAddress("diva@comcast.com");
        guest2.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest2.JPG");
        tempGuests.add(guest2);


        Guest guest3 = new Guest();
        guest3.setName("Gregg McQuire");
        guest3.setEmailAddress("emailing@nobody.com");
        guest3.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest3.JPG");
        tempGuests.add(guest3);


        Guest guest4 = new Guest();
        guest4.setName("Jamal Puma");
        guest4.setEmailAddress("jamal@hotmail.com");
        guest4.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest4.JPG");
        tempGuests.add(guest4);


        Guest guest5 = new Guest();
        guest5.setName("Dora Keesler");
        guest5.setEmailAddress("dora@yahoo.com");
        guest5.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest5.JPG");
        tempGuests.add(guest5);

        Guest guest6 = new Guest();
        guest6.setName("Anthony Lopez");
        guest6.setEmailAddress("toney@gmail.com");
        guest6.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest6.JPG");
        tempGuests.add(guest6);

        Guest guest7 = new Guest();
        guest7.setName("Ricardo Weisel");
        guest7.setEmailAddress("ricardo@gmail.com");
        guest7.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest7.JPG");
        tempGuests.add(guest7);

        Guest guest8 = new Guest();
        guest8.setName("Angele Lu");
        guest8.setEmailAddress("angele@ymail.com");
        guest8.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest8.JPG");
        tempGuests.add(guest8);


        Guest guest9 = new Guest();
        guest9.setName("Brendon Suh");
        guest9.setEmailAddress("brendon@outlook.com");
        guest9.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest9.JPG");
        tempGuests.add(guest9);


        Guest guest10 = new Guest();
        guest10.setName("Pietro Augustino");
        guest10.setEmailAddress("pietro@company.com");
        guest10.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest10.JPG");
        tempGuests.add(guest10);


        Guest guest11 = new Guest();
        guest11.setName("Matt Zebrotta");
        guest11.setEmailAddress("matt@stopasking.com");
        guest11.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest11.JPG");
        tempGuests.add(guest11);

        Guest guest12 = new Guest();
        guest12.setName("James McGiney");
        guest12.setEmailAddress("james@outlook.com");
        guest12.setProfileImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest12.JPG");
        tempGuests.add(guest12);

        return tempGuests;
    }
}
