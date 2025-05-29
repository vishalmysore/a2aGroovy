package com.example

import com.t4a.annotations.Action
import com.t4a.annotations.Agent

@Agent(groupName = "Property Maintenance", groupDescription = "Provides lawn mowing and snow cleaning services")
class MaintenanceAgent {

    @Action(description = "Schedule a lawn mowing service")
    String scheduleLawnMowing(String address, String preferredDate) {
        return "Lawn mowing service scheduled for ${address} on ${preferredDate}"
    }

    @Action(description = "Get lawn mowing service price estimation")
    String getLawnMowingPrice(String lawnSize) {
        return "Estimated price for ${lawnSize} lawn is \$50"
    }

    @Action(description = "Schedule snow removal service")
    String scheduleSnowRemoval(String address, String urgency) {
        return "Snow removal service scheduled for ${address} with ${urgency} priority"
    }

    @Action(description = "Get snow removal price estimation")
    String getSnowRemovalPrice(String drivewaySize, String snowDepth) {
        return "Estimated price for ${drivewaySize} driveway with ${snowDepth} snow is \$75"
    }

    static void main(String[] args) {
        def agent = new MaintenanceAgent()
        println agent.scheduleLawnMowing("123 Main St", "2024-03-20")
        println agent.scheduleSnowRemoval("123 Main St", "high")
    }
}