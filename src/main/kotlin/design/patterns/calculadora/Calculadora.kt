package design.patterns.design.patterns.calculadora

class Calculadora {
    fun sumar(a: Int, b: Int): Int{
        return a + b;
    }

    //Si la funcion es de una sola linea se puede simplificar asi
    fun restar(a:Int, b:Int) = a - b;

    fun multiplicar(a:Int, b:Int) = a*b;

    fun dividir(dividendo: Float, divisor: Float):Float{
        return if(divisor <= 0){
            0F;
        }else{
            dividendo/divisor;
        }
    }

}