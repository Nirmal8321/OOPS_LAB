# LAB_5 Quick Reference Card

## Programs Overview

| Q# | Program | Type | Input | Output |
|----|---------|------|-------|--------|
| 1  | QueueDemo | Interactive Queue | Menu-driven | Queue operations |
| 2  | HexCheck | Interactive Validator | String input | Valid/Invalid hex |
| 3  | ElectricalProductDemo | Inheritance Demo | Hardcoded | Product details |
| 4  | FruitDemo | Object Creation | Hardcoded | Fruit data |
| 5  | UtopiaTax | Calculator | Hours worked | Tax & net pay |
| 6  | StudentDemo | Class Methods | Name & marks | Pass/Fail |
| 7  | QuizGrader | Quiz Grader | Command args | Grade report |

---

## Quick Run Commands

### Compile All
```bash
cd LAB_5
javac *.java
```

### Run Programs

**Q1 - Queue (Interactive)**
```bash
java QueueDemo
Choice: 1→2→3→4 (Insert, Delete, Display, Exit)
```

**Q2 - Hex Check (Interactive)**
```bash
java HexCheck
Input: 1A2F or 1G2F
```

**Q3 - Electrical Product (No Input)**
```bash
java ElectricalProductDemo
```

**Q4 - Fruit (No Input)**
```bash
java FruitDemo
```

**Q5 - Tax Calculator (Interactive)**
```bash
java UtopiaTax
Input: Hours (e.g., 40)
```

**Q6 - Student (Interactive)**
```bash
java StudentDemo
Input: Name, then 3 marks
```

**Q7 - Quiz Grader (Arguments)**
```bash
java QuizGrader C A B D B C C A
java QuizGrader C B B D B C A X
```

---

## Test Cases for QuizGrader

| Case | Command | Expected |
|------|---------|----------|
| Perfect | `java QuizGrader C A B D B C C A` | 8 correct → PASSED |
| Mixed | `java QuizGrader C B B D B C A X` | 5 correct, 2 wrong, 1 unanswered → PASSED |
| Failure | `java QuizGrader A A A A A A A A` | 1 correct → FAILED |

---

## Files in LAB_5
- QueueDemo.java ✓
- QueueImpl.java ✓
- QueueOverflowException.java ✓
- QueueUnderflowException.java ✓
- HexCheck.java ✓
- ElectricalProductDemo.java ✓
- FruitDemo.java ✓
- UtopiaTax.java ✓
- StudentDemo.java ✓
- QuizGrader.java ✓

---

## Key Features Fixed

1. ✓ QueueDemo - Interactive menu system
2. ✓ HexCheck - User input via Scanner
3. ✓ UtopiaTax - Hours input via Scanner
4. ✓ QuizGrader - Enhanced formatted output
5. ✓ All exception handling working
6. ✓ All programs tested and verified

---

**All LAB_5 programs are complete, fixed, and ready!**
