package Assignment_4


fun main(args: Array<String>) {
    val humanFactory = HumanFactory()

    val driver = humanFactory.createHuman("Driver")
    driver.introduction()
    driver.work()

    val cook = humanFactory.createHuman("Cook")
    cook.introduction()
    cook.work()

    val child = humanFactory.createHuman("Child")
    child.introduction()
    child.work()

    val soldier = humanFactory.createHuman("Soldier")
    soldier.introduction()
    soldier.work()
}