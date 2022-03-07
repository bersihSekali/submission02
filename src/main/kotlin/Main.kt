fun main() {
    val darat = LandTransport ( "Land", "Truck Cargo", 100f, "1000 kg", 12.01f)
    val udara = AirTransport ( "Air", "Plane Cargo", 132f, "500 kg", 666.2f)

    darat.ship()
    darat.load()
    println(Transportation(darat))
    darat.unload()

    println("\n")

    udara.ship()
    udara.load()
    println(Transportation(udara))
    udara.unload()

}