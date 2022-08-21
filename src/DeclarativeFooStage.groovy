// src/DeclarativeFooStage.groovy
class DeclarativeFooStage {
    private final Script1 script1

    DeclarativeFooStage(Script1 script1) {
        this.script1 = script1
    }

    // You can pass as many parameters as needed
    void execute(String name, boolean param1) {
        script1.echo "Triggering script with name == ${name}"
        script1.sh "echo 'Execute your desired bash command here'"

        if (param1) {
            script1.sh "echo 'Executing conditional command, because param1 == true'"
        }
    }
}
