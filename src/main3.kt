class MusicInstrument (val type: String, val name:String, val yearOfManufacture:String){
    fun getInstrument(){
        println("Тип инструмента: $type, Название: $name, Год изготовление: $yearOfManufacture")
    }

}
fun main() {
    val instrument= MusicInstrument("Струнный","Гитара","2015 год")
    instrument.getInstrument()
}
