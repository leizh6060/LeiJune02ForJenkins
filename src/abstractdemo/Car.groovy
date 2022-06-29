package abstractDemo

abstract class Car {
        String name
        String color
        int model

        def startEngine() {
                println "engine stated for $name"
        }
        abstract def topSpeed()


}
