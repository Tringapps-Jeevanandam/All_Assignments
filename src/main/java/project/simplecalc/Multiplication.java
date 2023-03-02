package project.simplecalc;

class Multiplication extends Operation {
    public Multiplication(double num1, double num2) {
      super(num1, num2);
    }
  
    protected double calculate() {
      return getNum1() * getNum2();
    }
  }