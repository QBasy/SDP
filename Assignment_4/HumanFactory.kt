package Assignment_4

abstract class Human {
    abstract fun introduction()

    abstract fun work()
}

class Driver : Human() {
    override fun introduction() {
        println("I'm Driver \nI am driving a vehicle ")
    }

    override fun work() {
        println("*starts driving a car*\n")
    }
}

class Cook : Human() {
    override fun introduction() {
        println("I'm Cook \nI am Cooking food\n")
    }

    override fun work() {
        println("*starts cooking*\n")
    }
}

class Child : Human() {
    override fun introduction() {
        println("I'm Child \nI am studying in a school\n")
    }

    override fun work() {
        println("*starts studying*\n")
    }
}

class Different : Human() {
    override fun introduction() {
        println("still dont have same class of profession, but programmer Sayat promised to add this type of profession\n")
    }

    override fun work() {
        println("*and he also can't work*\n")
    }
}


class HumanFactory {
    fun createHuman(profession: String): Human {
        return when (profession.toLowerCase()) {
            "driver" -> Driver()
            "cook" -> Cook()
            "child" -> Child()
            else -> { Different() }
        }
    }
}