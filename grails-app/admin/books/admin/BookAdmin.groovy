package books.admin

class BookAdmin {

    static options = {

        list includes: ["title", "author", "lastUpdated","dateCreated"]
        create includes: ["title", "author"]
        edit includes: ["title", "author"]
    }
}