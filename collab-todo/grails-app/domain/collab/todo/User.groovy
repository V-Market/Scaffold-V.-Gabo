package collab.todo

class User {

    String userName
    String firstName
    String lastName

    static hasMany = [categories:Category ,todos:Todo]

    static constraints = {
        userName(blank: false,unique: true)
    }
    String toString(){
        userName
    }
}
