package com.springinaction.autowiring.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hard-drive-hitachi")
public class HardDriveHitachi implements HardDrive {
}
