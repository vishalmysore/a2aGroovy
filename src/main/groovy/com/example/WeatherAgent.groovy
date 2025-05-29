package com.example

import com.t4a.annotations.Action
import com.t4a.annotations.Agent

//@Agent(groupName = "Weather Service", groupDescription = "Provides current weather info")
class WeatherAgent {
    
  //  @Action(description = "Get temperature for a given city")
    String getTemperature(String city) {
        "The current temperature in ${city} is 25°C"
    }
    
    static void main(String[] args) {
        def agent = new WeatherAgent()
        println agent.getTemperature("Toronto")
    }
}
