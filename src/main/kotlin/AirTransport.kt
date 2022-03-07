class AirTransport(
    var aircraftType : String,
    var airlineName : String,
    override var weight: Float,
    override var capacity: String,
    override var speed: Float)
    : Transport {

    override fun ship() {
        println("In air transport, shipping is done via air cargo")
    }

    override fun toString(): String {
        return "\n====Air Transport====\n"+
                "Aircraft Type : $aircraftType \n"+
                "Aircraft Name: $airlineName \n"+
                "Weight : $weight \n"+
                "Capacity :  $capacity \n"+
                "Speed : $speed km/h" +
                "==============="
    }
}