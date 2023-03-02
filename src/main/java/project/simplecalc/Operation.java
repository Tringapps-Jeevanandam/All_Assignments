package project.simplecalc;
 abstract class Operation {
  private double num1;
  private double num2;

  protected Operation(double num1, double num2) {
    this.setNum1(num1);
    this.setNum2(num2);
  }

  protected double getNum1() {
    return num1;
  }

  protected void setNum1(double num1) {
    this.num1 = num1;
  }

  protected double getNum2() {
    return num2;
  }

  protected void setNum2(double num2) {
    this.num2 = num2;
  }

  protected abstract double calculate();
}
