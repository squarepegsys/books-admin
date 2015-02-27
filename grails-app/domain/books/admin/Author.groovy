package books.admin

class Author {

    String firstName
    String lastName

    Date lastUpdated
    Date dateCreated

    static hasMany=[books: Book]
    static constraints = {

        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
    }


    // necessary for the author to appear correctly on the Book listing

    public String toString() {

        "${firstName} ${lastName}"
    }

}
