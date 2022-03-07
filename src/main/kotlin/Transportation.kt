class Transportation<Z: Transport> (val t:Z){
    override fun toString(): String{
        return "$t"
    }
}