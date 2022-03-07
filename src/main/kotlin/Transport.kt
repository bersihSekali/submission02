interface Transport {
    var weight : Float
    var capacity : String
    var speed : Float

    fun load(){
        print ("Goods are loaded successfully")
    }
    fun unload (){
        print ("Goods are unloaded successfully")
    }
    fun ship()
}