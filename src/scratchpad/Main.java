package scratchpad;

import java.io.*;
import java.util.*;

/*
 * 
 */
@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        AssaultRifle ar = new AssaultRifle();
        ar.setAmmoType("5.56mm");
        String arAmmoType = ar.getAmmoType();
        ar.setAmmoClipSize(30);
        int arAmmoClipSize = ar.getAmmoClipSize();
        
        ToyRifleM16 toyRifleM16 = new ToyRifleM16();
        toyRifleM16.setAmmoType("BB");
        String toyM16AmmoType = toyRifleM16.getAmmoType();
        toyRifleM16.setAmmoClipSize(20);
        int toyM16AmmoClipSize = toyRifleM16.getAmmoClipSize();
        
        ar.fire();
        toyRifleM16.fire();
        System.out.printf("AR : %s, %d\n", arAmmoType, arAmmoClipSize);
        System.out.printf("ToyM16 : %s, %d\n", toyM16AmmoType, toyM16AmmoClipSize);
    }

}

class Weapon {

    private int ammoClipSize = 0;
    private String ammoType = "NONE";

    public void fire() {
        System.out.println("bang");
    }

    public int getAmmoClipSize() {
        return ammoClipSize;
    }

    public void setAmmoClipSize(int ammo) {
        this.ammoClipSize = ammo;
    }
    
    public String getAmmoType() {
        return this.ammoType;
    }
    
    public void setAmmoType(String _ammoType) {
        this.ammoType = _ammoType;
    }
}

class AssaultRifle extends Weapon {
    
}

class ToyRifle extends Weapon {
    public void fire() {
        System.out.println("tak");
    }
}

class ToyRifleM16 extends ToyRifle {
    
}
