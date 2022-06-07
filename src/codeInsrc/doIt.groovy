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
    def a_method( String name) {
     steps2.echo "Hello ${name} foo from src/codeInsrc/doIt.groovy"
    }
    def bar() {
        steps2.echo "Hello bar from src/org/any/MultiMethod.groovy"
    }
}
