package codeInsrc


//class doIt{
 
//def a_method( )
  // {
   // echo "Lei"
   //}
//}

class doIt {
    def steps;
    doIt(steps) {
        this.steps = steps
    }
    def a_method() {
        steps.echo "Hello foo from src/org/any/MultiMethod.groovy"
    }
    def bar() {
        steps.echo "Hello bar from src/org/any/MultiMethod.groovy"
    }
}
