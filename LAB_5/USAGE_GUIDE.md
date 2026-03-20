# LAB_5 - Interactive Programs Usage Guide

## Programs with User Input

### 1. QueueDemo.java
**Purpose**: Demonstrates queue operations with bus stand scenario

**Sample Usage**:
```
java QueueDemo
Queue Demo (Bus Stand Queue) - Max size: 10
1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 1
Enter integer to insert: 10
Inserted: 10

1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 1
Enter integer to insert: 20
Inserted: 20

1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 3
Queue: 10 20 

1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 2
Deleted: 10

1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 3
Queue: 20 

1. Insert  2. Delete  3. Display  4. Exit
Enter choice: 4
Exiting...
```

**Exception Handling**:
- **Overflow**: Insert 10 items (when queue is full)
- **Underflow**: Try to delete from empty queue

---

### 2. HexCheck.java
**Purpose**: Validate if a string is a valid hexadecimal number

**Sample Usage**:
```
java HexCheck
Enter a string to check if it's hexadecimal: 1A2F
"1A2F" is a valid hexadecimal number.
Ending the program
```

**Another Example**:
```
java HexCheck
Enter a string to check if it's hexadecimal: 1G2F
Exception caught: Not a hexadecimal number: 1G2F
Ending the program
```

**Valid Hex Inputs**: 
- 1A2F
- 0xDEADBEEF
- ABCD123
- 0x789

**Invalid Hex Inputs**: 
- 1G2F (contains G)
- XYZ (no hex digits)
- 12K3L (invalid characters)

---

### 3. UtopiaTax.java
**Purpose**: Calculate tax and net pay based on hours worked

**Sample Usage**:
```
java UtopiaTax
Enter hours worked: 40

Utopia Tax Calculation:
Hours worked: 40.0
Hourly rate: $12.0
Gross pay: $480.0
Tax (15%): $72.00
Net pay: $408.00
```

**Another Example**:
```
java UtopiaTax
Enter hours worked: 8

Utopia Tax Calculation:
Hours worked: 8.0
Hourly rate: $12.0
Gross pay: $96.0
Tax (15%): $14.40
Net pay: $81.60
```

---

### 4. StudentDemo.java
**Purpose**: Accept student name and grades, calculate if passed or failed

**Sample Usage**:
```
java StudentDemo
Enter name: John Smith
Name: John Smith
Enter 3 marks: 60 55 70
Passed
```

**Another Example (Failed)**:
```
java StudentDemo
Enter name: Jane Doe
Name: Jane Doe
Enter 3 marks: 40 35 30
Failed
```

**Pass Criteria**: Average > 50

---

## Programs with Command Line Arguments

### 5. QuizGrader.java
**Purpose**: Grade a multiple choice quiz with 8 questions

**Sample Usage 1 - All Correct**:
```
java QuizGrader C A B D B C C A
[Shows PASSED - 8 correct, 0 wrong, 0 unanswered]
```

**Sample Usage 2 - Mixed Answers** (matching PDF example):
```
java QuizGrader C B B D B C A X
[Shows PASSED - 5 correct, 2 wrong, 1 unanswered]
```

**Sample Usage 3 - All Wrong**:
```
java QuizGrader A A A A A A A A
[Shows FAILED - 1 correct, 7 wrong, 0 unanswered]
```

**Sample Usage 4 - Many Unanswered**:
```
java QuizGrader C X X X X X X X
[Shows FAILED - 1 correct, 0 wrong, 7 unanswered]
```

**Command Line Argument Format**:
- Position 1: Answer for Question 1 (C, A, B, D, B, C, C, or A)
- Position 2: Answer for Question 2
- ...and so on
- Use 'X' to indicate unanswered question

---

## Programs with No Input

### 6. ElectricalProductDemo.java
**Purpose**: Demonstrate product inheritance and updating attributes

**Usage**:
```
java ElectricalProductDemo

Product ID: 101, Name: LED Bulb, Category ID: 1, Unit Price: 299.0, Voltage Range: 220V, Wattage: 9.0
Updated details:
Product ID: 101, Name: LED Bulb, Category ID: 1, Unit Price: 349.0, Voltage Range: 220V, Wattage: 12.0
```

---

### 7. FruitDemo.java
**Purpose**: Demonstrate fruit class with multiple objects

**Usage**:
```
java FruitDemo

Name: Apple, Type: Single, Price: 50.0
Name: Banana, Type: Bunch, Price: 30.0
```

---

## Correct Answers Reference (for QuizGrader)

Question | Answer
---------|--------
1        | C
2        | A
3        | B
4        | D
5        | B
6        | C
7        | C
8        | A

**Pass Criteria**: 5 or more correct answers

---

## Compilation All Files

```bash
cd LAB_5
javac *.java
```

No errors should appear if all files are correct.

---
