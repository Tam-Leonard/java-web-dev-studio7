package org.launchcode.studio7;
//BONUS MISSION: This is made b/c the BaseDisc boolean didn't apply to vinyl
//moved isInserted from BaseDisc
//then extended this class to all that apply to computer discs
public abstract class ComputerDisc extends BaseDisc {
    private boolean isInserted;
    public ComputerDisc(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.isInserted = false;
    }

    public ComputerDisc(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
        this.isInserted = false;
    }
    public boolean isInserted() { return this.isInserted; };
    public void insert(){
        this.isInserted = true;
    }
}
