package org.launchcode.studio7;

public interface OpticalDisc {

    void spinDisc(); //public is the only accessor in interface
    void storeData(String data);
    boolean isFull();

}
