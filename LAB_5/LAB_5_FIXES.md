# LAB_5 - All Programs Fixed and Updated

## Summary of Changes Made According to PDF Requirements

### Q.1 - QueueDemo (Queue as Bus Stand) ✓
**Status**: FIXED - Added interactive user input menu
**Changes**:
- Added Scanner-based interactive menu system
- Options: Insert, Delete, Display, Exit
- Demonstrates overflow and underflow exception handling
- Allows user to insert and delete elements interactively
- Queue uses circular array with size 10

**How to Run**:
```
javac QueueDemo.java QueueImpl.java QueueOverflowException.java QueueUnderflowException.java
java QueueDemo
```

---

### Q.2 - HexCheck (Hexadecimal Validator) ✓
**Status**: FIXED - Added user input instead of hardcoded values
**Changes**:
- Now accepts string input from user via Scanner
- User-defined exception: `NotHexadecimalException`
- Validates hex format (0-9, A-F, can have 0x prefix)
- Finally block always prints "Ending the program"
- Handles both valid and invalid hex numbers

**How to Run**:
```
javac HexCheck.java
java HexCheck
```

**Test Cases**:
- Valid: 1A2F, 0xDEADBEEF, 123ABC
- Invalid: 1G2F, XYZ, 12K

---

### Q.3 - ElectricalProductDemo (Inheritance) ✓
**Status**: VERIFIED - Correctly implemented
**Features**:
- Product class: ID, Name, Category ID, UnitPrice
- ElectricalProduct extends Product: VoltageRange, Wattage
- Methods: setWattage(), setUnitPrice()
- Display method shows all attributes
- Creates 1 object and displays before/after updates

**Output**:
```
Product ID: 101, Name: LED Bulb, Category ID: 1, Unit Price: 299.0, Voltage Range: 220V, Wattage: 9.0
Updated details:
Product ID: 101, Name: LED Bulb, Category ID: 1, Unit Price: 349.0, Voltage Range: 220V, Wattage: 12.0
```

---

### Q.4 - FruitDemo (Fruit Class) ✓
**Status**: VERIFIED - Correctly implemented
**Features**:
- Fruit class attributes: name, type (Single/Bunch), price
- Constructor with all parameters
- displayFruit() method
- Creates 2 Fruit objects and displays them

**Output**:
```
Name: Apple, Type: Single, Price: 50.0
Name: Banana, Type: Bunch, Price: 30.0
```

---

### Q.5 - UtopiaTax (Tax & Net Pay Calculation) ✓
**Status**: FIXED - Added user input for hours worked
**Changes**:
- Now accepts hours worked from user input
- Tax rate: 15% (fixed)
- Hourly rate: $12.00 (fixed)
- calculateTax(double grossPay) - computes 15% of gross pay
- calculateNetPay(double hoursWorked) - computes net pay
- Formatted output with proper currency display

**How to Run**:
```
javac UtopiaTax.java
java UtopiaTax
Enter hours worked: 40
```

**Sample Output**:
```
Utopia Tax Calculation:
Hours worked: 40.0
Hourly rate: $12.0
Gross pay: $480.0
Tax (15%): $72.00
Net pay: $408.00
```

---

### Q.6 - StudentDemo (Student Class) ✓
**Status**: VERIFIED - Works correctly with user input
**Features**:
- Student class with methods:
  - inputName(String name) - accepts and returns student name
  - average(int m1, int m2, int m3) - returns true if avg > 50
- Accepts student name and 3 marks via Scanner
- Displays pass/fail status

**How to Run**:
```
javac StudentDemo.java
java StudentDemo
```

---

### Q.7 - QuizGrader (Multiple Choice Quiz) ✓
**Status**: FIXED - Improved output formatting to match PDF
**Features**:
- 8 multiple choice questions
- Correct answers stored in array: C, A, B, D, B, C, C, A
- Pass mark: 5 out of 8
- Enum Result type: CORRECT, WRONG, UNANSWERED
- Program arguments for submitted answers
- X represents unanswered question
- Formatted table output with statistics

**How to Run**:
```
javac QuizGrader.java
java QuizGrader C B B D B C A X
```

**Output Format** (matching PDF):
```
QUIZ GRADING REPORT
==========================================
QUESTION | SUBMITTED ANS | CORRECT ANS | RESULT
------------------------------------------
       1 |             C |           C | CORRECT
       2 |             B |           A | WRONG
       3 |             B |           B | CORRECT
       4 |             D |           D | CORRECT
       5 |             B |           B | CORRECT
       6 |             C |           C | CORRECT
       7 |             A |           C | WRONG
       8 |             X |           A | UNANSWERED
------------------------------------------
No. of correct answers: 5
No. of wrong answers: 2
No. of questions unanswered: 1
The candidate PASSED.
==========================================
```

---

## Exception Classes (Supporting Files)

### QueueOverflowException.java ✓
- Message: "Queue overflow: Cannot insert, queue is full."

### QueueUnderflowException.java ✓
- Message: "Queue underflow: Cannot delete, queue is empty."

### QueueImpl.java ✓
- Interface defining: insert(), delete(), display() methods

---

## Compilation & Testing

All files compile without errors:
```
cd LAB_5
javac *.java
```

All programs tested and working:
- ✓ ElectricalProductDemo
- ✓ FruitDemo
- ✓ QuizGrader (with multiple test cases)
- ✓ QueueDemo (interactive)
- ✓ HexCheck (interactive)
- ✓ UtopiaTax (interactive)
- ✓ StudentDemo (interactive)

---

## Key Improvements Made

1. **QueueDemo**: Changed from hardcoded demo to interactive menu-driven program
2. **HexCheck**: Changed from hardcoded test cases to user input
3. **UtopiaTax**: Added user input for hours worked instead of fixed 40 hours
4. **QuizGrader**: Improved output formatting with proper table layout matching PDF example
5. All files properly handle exceptions as per PDF requirements
6. All interactive programs use Scanner for user input
7. All output formats match or exceed PDF specifications

---

**Status**: All Lab 5 programs are now complete and working correctly! ✓
