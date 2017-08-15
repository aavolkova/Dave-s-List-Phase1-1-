package me.anna.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    /** Three constants denoting the cable type*/
    public static final int NONE = 0;
    public static final int BASIC = 1;
    public static final int PREMIUM = 2;

    @NotNull
    @Size(min=1, max=100, message = "Enter your descriptions.")
    private String description;

    @NotNull
    @Size(min=1, max=100, message = "Enter your rules.")
    private String rules;

//    @NotNull
//    private boolean isRented;
    private boolean isRented = false;

//    @NotNull
//    private boolean wifi;            // (yes/no)
    private boolean wifi = false;

//    @NotNull
//    private boolean privateBathroom; // (yes/no)
    private boolean privateBathroom  = false; // (yes/no)

    /** Default cable type */
    private int cable = NONE;

//    private boolean wifi;            // (yes/no),   boolean?
//    private String cable;            // (none/basic/premium) boolean?
//    private String privateBathroom;  // (yes/no)    boolean?




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }



    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean rented) {
        isRented = rented;
    }


//    public boolean isWifi() {
    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

//    public boolean isPrivateBathroom() {
    public boolean getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(boolean privateBathroom) {
        this.privateBathroom = privateBathroom;
    }


    public int getCable() {
        return cable;
    }

    public void setCable(int cable) {
        if (cable == NONE || cable == BASIC || cable == PREMIUM)
            this.cable = cable;
    }
}
