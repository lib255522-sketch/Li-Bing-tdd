package org. example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int divide(int a, int b) {
            if (b == 0)
                throw new IllegalArgumentException("Cannot divide by zero");
            return a / b;
        }
    }
