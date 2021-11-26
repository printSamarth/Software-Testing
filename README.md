# Software Testing: Multipurpose Calculator

## Source Code description:

our source code is multipurpose calculator. This calculator provides 3 main types of calculators:

1. Scientific Calculator
1. Fitness Calculator
1. Matrix Calculator

The main menu is when the code is executed is shown as follows:

![Main Menu](https://github.com/printSamarth/Software-Testing/blob/master/Image/main_menu.png)

### Scientific Calculator:
This calculator provides various scientific calculations:

* Addition, Subtraction, Multiplication, Division, Modulo
* Inverse, Factorial, Square Root, Base Conversion of numbers etc

![Scientific Calculator](https://github.com/printSamarth/Software-Testing/blob/master/Image/scientific.png)


### Fitness Calculator:
This calculator provides various fitness related calculations:

* BMI calculator, BMR Calculator, Body Fat Calculator, Calorie Calculator, Lean Body Mass Calculator etc.

![Fitness Calculator](https://github.com/printSamarth/Software-Testing/blob/master/Image/fitness.png)


### Matrix Calculator:

This calculator provides baic matrix related calculations like addition, subtraction, multiplication and transpose.

---
## Testing Strategy:

### Mutation Testing: 
We have performed mutation testing on the source code that is we have changed the operators like arithmatic operators, logical operators, conditional operators, removing function calls etc. 

### Testing Tools used:
We have used JUnit to perform the unit testing and PiTest to mutate the source code. 

As it is a maven project we can simply add dependency in the pom.xml file as follows:

![JUnit](https://github.com/printSamarth/Software-Testing/blob/master/Image/junit.png)

![PitTest](https://github.com/printSamarth/Software-Testing/blob/master/Image/pitTest.png)

## Running PitTest
To generate the mutaion report using PitTest we can use the maven command `mvn org.pitest:pitest-maven:mutationCoverage`

This will generate report inside the <em>target/pit-reports/YYYYMMDDHHMM/index.html</em>.

The PitTest report for this source code was generated as follows:

### PIT TEST REPORT 

![Pit Report](https://github.com/printSamarth/Software-Testing/blob/master/Image/pit-report.png)

## Individual Contributions:

<strong>Samarth Patel (MT2020036):</strong>
Implemented code base for scientific calculator and designed test cases for Fitness calculator.

<strong>Hemang Vyas (MT2020065):</strong>
Implemented code base for Fitness calculator and designed test cases for Scientific calculator.

<strong>Abhinav Singh (MT2020001):</strong>
Implemented code base for Matrix calculator and designed test cases for Matrix calculator.

