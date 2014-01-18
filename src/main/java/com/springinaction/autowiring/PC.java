package com.springinaction.autowiring;

import com.springinaction.autowiring.components.HardDrive;
import com.springinaction.autowiring.components.SamsungHardDrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PC {

    @Autowired
    @SamsungHardDrive
    private HardDrive hardDrive;

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
