class Movie (val name: String,val director:String, val releaseYear:String){
    fun getMovieInfo(){
        println("Фильм $name, режиссер $director, год $releaseYear")
    }

}
fun main() {
    val film= Movie("Гарри Поттер и философский камень ","Крис Коламбус", "2001")
    film.getMovieInfo()
}
