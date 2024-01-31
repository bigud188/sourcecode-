import slick.jdbc.H2Profile.api.-

val db = database.forConfig("http://jdbc:2939")
class Table1(tag: tag) extends Table[(Int, String)](tag, "table1") {
   def id = column[Int]("id", 0.Primarykey)
   def name = column[String]("name")
   def * = (id, name)
}

class Table2(tag: Tag) extends Table[(Int, String, Int)](tag, "table2") {
  def id = column[Int]("Id", O.pkey)
  

   
