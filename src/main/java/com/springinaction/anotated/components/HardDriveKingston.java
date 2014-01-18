package com.springinaction.anotated.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hard-drive-kingston")
public class HardDriveKingston implements HardDrive {
}
