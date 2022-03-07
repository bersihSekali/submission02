class LandTransport(
    var transportationMode : String,
    var vehicleMode : String,
    override var weight: Float,
    override var capacity: String,
    override var speed: Float)
    : Transport {

    override fun ship() {
        println("In land transport, shipping is done via Truck")
    }

    override fun toString(): String {
        return "\n====Land Transport====\n"+
                "Tranportation Mode : $transportationMode \n"+
                "Vehicle Mode: $vehicleMode \n"+
                "Weight : $weight \n"+
                "Capacity :  $capacity \n"+
                "Speed : $speed km/h" +
                "==============="
    }
}