package Assignment_4


fun main(args: Array<String>) {
    val humanFactory = HumanFactory()
    val workObserver = WorkObserver()

    val driver = humanFactory.createHuman("Driver")
    println( driver.introduction())
    driver.registerObserver(workObserver)
    println(driver.work())
    driver.notifyObservers()

    val cook = humanFactory.createHuman("Cook")
    println(cook.introduction())
    cook.registerObserver(workObserver)
    println(cook.work())
    cook.notifyObservers()

    val child = humanFactory.createHuman("Child")
    println(child.introduction())
    child.registerObserver(workObserver)
    println(child.work())
    child.notifyObservers()

    val soldier = humanFactory.createHuman("Soldier")
    println(soldier.introduction())
    soldier.registerObserver(workObserver)
    soldier.notifyObservers()
}