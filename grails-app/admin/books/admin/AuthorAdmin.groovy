
package books.admin

class AuthorAdmin {

    static options = {
        list includes: ["lastName", "firstName", "lastUpdated","dateCreated"]
        create includes: ["firstName","lastName"]
        edit  includes: ["firstName","lastName"]

    }

}
