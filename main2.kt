class LibraryBook (val isbn: Int, val title:String, val author:String){
    fun getBookDetails(){
        println("ISBN: $isbn, Название: $title, Автор: $author")
    }

}
fun main() {
    val book= LibraryBook(5653445,"Основы Алгебры","Омский Д.А")
    book.getBookDetails()
}
