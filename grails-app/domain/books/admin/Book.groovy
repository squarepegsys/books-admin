package books.admin

class Book {

    String title

    Date lastUpdated
    Date dateCreated

    static belongsTo = [author: Author]

    static constraints = {

        title nullable: false, blank:false
    }
}
