package org.terasology.signalling.components;

import org.terasology.entitySystem.Component;
import org.terasology.world.block.ForceBlockActive;

@ForceBlockActive
public class SignalDelayedActionComponent implements Component {
    public long executeTime;
}
