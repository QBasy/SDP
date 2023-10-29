package Assignment_4

interface Observer {
    fun update(human: Human)
}

abstract class Human {
    private val observers = mutableListOf<Observer>()

    fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        for (observer in observers) {
            observer.update(this)
        }
    }
    abstract fun introduction() :String

    abstract fun work(): String
}

class Driver : Human() {
    override fun introduction(): String {
        return "I'm Driver \nI am driving a vehicle"
    }

    override fun work(): String {
        return "*starts driving a car*\n"
    }
}

class Cook : Human() {
    override fun introduction(): String {
        return "I'm Cook \nI am Cooking food"
    }

    override fun work(): String {
        return "*starts cooking*\n"
    }
}

class Child : Human() {
    override fun introduction(): String {
        return "I'm Child \nI am studying in a school"
    }

    override fun work(): String {
        return "*starts studying*\n"
    }
}

class Different : Human() {
    override fun introduction(): String {
        return "still dont have same class of profession, but programmer Sayat promised to add this type of profession"
    }

    override fun work():String {
        return "not working"
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

class WorkObserver : Observer {
    override fun update(human: Human) {
        val isWorking = human.work() != "not working"
        val workingStatus = if (isWorking) "is working" else "is not working"
        println("It's ${human.javaClass.simpleName} profession, so $workingStatus")
    }
}