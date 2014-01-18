package com.springinaction.anotated;

import com.springinaction.anotated.components.HardDrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notebook {

    @Autowired
    @Qualifier("hard-drive-hitachi")
    private HardDrive hardDrive;

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
