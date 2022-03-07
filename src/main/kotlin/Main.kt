fun main() {
    val darat = LandTransport ( "Land", "Truck Cargo", 100f, "1000 kg", 12.01f)

    darat.ship()
    darat.load()
    println(Transportation(darat))
    darat.unload()

    println("\n")

    val udara = AirTransport ( "Air", "Plane Cargo", 132f, "500 kg", 666.2f)
    udara.ship()
    udara.load()
    println(Transportation(udara))
    udara.unload()

}

class Transportation<Z: Transport> (val t:Z){
    override fun toString(): String{
        return "$t"
    }
}