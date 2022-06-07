package codeInsrc


//class doIt{
 
//def a_method( )
  // {
   // echo "Lei"
   //}
//}

class doIt {
    def steps2;
    doIt(steps2) {
        this.steps2 = steps2
    }
    def a_method() {
        steps2.echo "Hello foo from src/org/any/MultiMethod.groovy"
    }
    def bar() {
        steps2.echo "Hello bar from src/org/any/MultiMethod.groovy"
    }
}
