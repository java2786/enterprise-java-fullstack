# Expense Tracker for College Hostellers - Project Use Case

## Project Overview

You are tasked with building a **Personal Expense Tracker** for college students living in hostels. This command-line application will help students track their daily expenses, categorize spending, and understand where their money goes each month.

---

## Background Story

Meet **Suresh**, a second-year engineering student at Pune Institute of Technology. He receives ₹5,000 monthly pocket money from his parents. By the 20th of every month, Suresh runs out of money and has to borrow from his roommate Ramesh. He has no idea where his money disappears!

Suresh needs a simple tool to:
- Record every expense he makes
- See how much he spends on different categories
- Review his spending at the end of the month
- Make better financial decisions

You will build this tool for Suresh and students like him.

---

## Project Requirements

### Core Features (Must Have)

#### 1. Add Expense
Students should be able to add a new expense with the following details:
- **Date**: When the expense was made (format: DD-MM-YYYY)
- **Category**: Type of expense (predefined categories)
- **Amount**: Money spent (in ₹)
- **Description**: Short note about the expense

**Example:**
```
Date: 15-04-2024
Category: Food
Amount: ₹45
Description: Chai and samosa at campus canteen
```

#### 2. Predefined Expense Categories
- Food (mess, canteen, restaurants)
- Transport (auto, bus, train, petrol)
- Mobile Recharge
- Entertainment (movies, games, outings)
- Stationery (books, pens, notebooks)
- Personal Care (soap, shampoo, medicines)
- Hostel Dues (rent, maintenance)
- Others (miscellaneous)

#### 3. View All Expenses
Display all recorded expenses in a formatted table showing:
- Serial Number
- Date
- Category
- Amount
- Description

**Example Output:**
```
===============================================
          ALL EXPENSES
===============================================
S.No  Date         Category      Amount    Description
1     12-04-2024   Food          ₹120      Lunch at Udipi restaurant
2     13-04-2024   Transport     ₹30       Auto to college
3     14-04-2024   Mobile        ₹200      Jio recharge
===============================================
Total Expenses: ₹350
===============================================
```

#### 4. View Expenses by Category
Allow students to filter and view expenses for a specific category.

**Example:** Show all "Food" expenses

#### 5. Monthly Summary Report
Generate a summary showing:
- Total expenses for the month
- Category-wise breakdown with amounts
- Category-wise percentage of total spending
- Simple text-based bar chart for visual representation

**Example Output:**
```
===============================================
     MONTHLY EXPENSE SUMMARY - APRIL 2024
===============================================
Total Spent: ₹4,250

Category-wise Breakdown:
------------------------
Food            : ₹1,800  (42.35%)  ████████████████
Transport       : ₹900    (21.18%)  ████████
Mobile Recharge : ₹400    (9.41%)   ████
Entertainment   : ₹650    (15.29%)  ██████
Stationery      : ₹200    (4.71%)   ██
Personal Care   : ₹150    (3.53%)   █
Hostel Dues     : ₹0      (0.00%)   
Others          : ₹150    (3.53%)   █

💡 Tip: You spent most on Food!
===============================================
```

#### 6. Data Persistence
All expense records must be saved in a file so that data is not lost when the program closes. Students should be able to:
- Save new expenses automatically
- Load previous expenses when the program starts

**File Format Options:**
- CSV (Comma Separated Values)
- Text file with custom format
- JSON format

---

## Sample User Journey

### Day 1 - Monday Morning (Suresh's Routine)

**Scenario 1: Breakfast Expense**
```
Suresh buys chai and vada pav from the hostel canteen
Cost: ₹35
He opens the Expense Tracker and adds:
- Date: 06-05-2024
- Category: Food
- Amount: ₹35
- Description: Breakfast - chai and vada pav
```

**Scenario 2: Auto to College**
```
Suresh takes an auto to college
Cost: ₹25
He adds:
- Date: 06-05-2024
- Category: Transport
- Amount: ₹25
- Description: Auto to college
```

**Scenario 3: Lunch**
```
Lunch at college mess
Cost: ₹60
He adds:
- Date: 06-05-2024
- Category: Food
- Amount: ₹60
- Description: Mess lunch
```

**Scenario 4: Mobile Recharge**
```
Evening: Jio recharge
Cost: ₹299
He adds:
- Date: 06-05-2024
- Category: Mobile Recharge
- Amount: ₹299
- Description: Jio 2GB/day plan
```

**Scenario 5: Evening Snacks with Friends**
```
Samosa and cold coffee at café near hostel
Cost: ₹80
He adds:
- Date: 06-05-2024
- Category: Food
- Amount: ₹80
- Description: Evening snacks with Ramesh
```

### End of Day - Review
Suresh views all his expenses for the day and realizes he spent ₹499 in just one day!

---

## Sample Data for Testing

Use this sample data to test your application:

### Week 1 - April 2024

**Student: Mukesh Kumar**

| Date | Category | Amount | Description |
|------|----------|--------|-------------|
| 01-04-2024 | Hostel Dues | ₹2,500 | Monthly hostel rent |
| 02-04-2024 | Food | ₹120 | Lunch at Udipi |
| 02-04-2024 | Transport | ₹30 | Auto to college |
| 03-04-2024 | Food | ₹45 | Chai samosa |
| 03-04-2024 | Stationery | ₹180 | Java programming book |
| 04-04-2024 | Food | ₹90 | Dinner outside |
| 04-04-2024 | Mobile | ₹199 | Airtel recharge |
| 05-04-2024 | Transport | ₹50 | Bus to home |
| 06-04-2024 | Entertainment | ₹250 | Movie ticket - Pushpa 2 |
| 06-04-2024 | Food | ₹150 | Popcorn and cold drink |
| 07-04-2024 | Food | ₹60 | Breakfast |
| 07-04-2024 | Personal Care | ₹120 | Shampoo and soap |

### Week 2 - April 2024

| Date | Category | Amount | Description |
|------|----------|--------|-------------|
| 08-04-2024 | Food | ₹85 | Lunch - dosa and coffee |
| 09-04-2024 | Transport | ₹25 | Auto fare |
| 10-04-2024 | Food | ₹200 | Birthday treat for Ramesh |
| 11-04-2024 | Entertainment | ₹100 | Play Store game purchase |
| 12-04-2024 | Food | ₹70 | Evening snacks |
| 13-04-2024 | Stationery | ₹50 | Notebooks and pens |
| 14-04-2024 | Transport | ₹40 | Auto fare |

---

## Application Menu Structure

Your program should have a simple text-based menu:

```
===============================================
    COLLEGE EXPENSE TRACKER
===============================================
1. Add New Expense
2. View All Expenses
3. View Expenses by Category
4. Monthly Summary Report
5. Search Expenses by Date
6. Exit
===============================================
Enter your choice (1-6): 
```

---

## Expected User Interactions

### Interaction 1: Adding an Expense
```
Enter your choice: 1

--- Add New Expense ---
Enter date (DD-MM-YYYY): 15-04-2024
Enter amount (₹): 45
Select category:
  1. Food
  2. Transport
  3. Mobile Recharge
  4. Entertainment
  5. Stationery
  6. Personal Care
  7. Hostel Dues
  8. Others
Choose (1-8): 1
Enter description: Chai and pakora at college canteen

✓ Expense added successfully!
```

### Interaction 2: Viewing All Expenses
```
Enter your choice: 2

===============================================
          ALL EXPENSES
===============================================
S.No  Date         Category      Amount    Description
1     12-04-2024   Food          ₹120      Lunch at Udipi
2     13-04-2024   Transport     ₹30       Auto to college
3     14-04-2024   Mobile        ₹200      Jio recharge
4     15-04-2024   Food          ₹45       Chai and pakora
===============================================
Total Expenses: ₹395
===============================================
```

### Interaction 3: Filtering by Category
```
Enter your choice: 3

Select category to view:
  1. Food
  2. Transport
  3. Mobile Recharge
  4. Entertainment
  5. Stationery
  6. Personal Care
  7. Hostel Dues
  8. Others
Choose (1-8): 1

===============================================
       FOOD EXPENSES
===============================================
S.No  Date         Amount    Description
1     12-04-2024   ₹120      Lunch at Udipi
2     15-04-2024   ₹45       Chai and pakora
===============================================
Total Food Expenses: ₹165
===============================================
```

---

## Technical Concepts to Apply

### 1. File Operations
- Create and open files for reading/writing
- Save expense data to file after every addition
- Load existing data when program starts
- Handle file not found errors gracefully

### 2. Date and Time Module
```python
# You need to work with dates
# Example date: 15-04-2024
# Extract month, year for monthly reports
# Validate date format
# Compare dates for filtering
```

### 3. Data Structures

**Lists:** Store multiple expenses
```python
# Example structure (you design your own)
expenses = [expense1, expense2, expense3, ...]
```

**Dictionaries:** Store individual expense details
```python
# Example structure (you design your own)
expense = {
    'date': '15-04-2024',
    'category': 'Food',
    'amount': 45,
    'description': 'Chai and pakora'
}
```

### 4. Functions
You should create separate functions for each feature:
- `add_expense()` - Add new expense
- `view_all_expenses()` - Display all expenses
- `view_by_category()` - Filter by category
- `monthly_summary()` - Generate summary report
- `save_to_file()` - Save data to file
- `load_from_file()` - Load data from file
- `calculate_total()` - Calculate total expenses
- `create_bar_chart()` - Create text-based visualization

### 5. Text-based Bar Chart
Create a simple visualization using characters:

```
Food            : ₹1,800  (42%)  ████████████████
Transport       : ₹900    (21%)  ████████
Mobile Recharge : ₹400    (9%)   ████
```

**Logic:** Each `█` represents a certain percentage (example: 1 block = 2.5%)

---

## Validation Rules

Your program should validate:

1. **Date Format**
   - Must be DD-MM-YYYY
   - Example: 15-04-2024 ✓
   - Example: 15/04/2024 ✗
   - Example: 2024-04-15 ✗

2. **Amount**
   - Must be a positive number
   - Can have decimals (₹45.50)
   - Cannot be zero or negative

3. **Category**
   - Must be from predefined list
   - Case insensitive (food = Food = FOOD)

4. **Description**
   - Cannot be empty
   - Should be meaningful text

5. **Menu Choice**
   - Must be between 1-6
   - Invalid choice should show error and ask again

---

## Error Handling Scenarios

Your program should handle:

1. **File not found** - Create new file if it doesn't exist
2. **Invalid date format** - Show error and ask again
3. **Invalid amount** - Show error and ask again
4. **Invalid category** - Show error and ask again
5. **Invalid menu choice** - Show error and display menu again
6. **Empty description** - Show error and ask again
7. **Corrupted file data** - Handle gracefully, don't crash

---

## Bonus Challenges (Optional)

If you want to go beyond basic requirements:

1. **Budget Alert**
   - Let users set a monthly budget (₹5,000)
   - Alert when spending crosses 80% of budget
   - Show remaining budget

2. **Edit/Delete Expense**
   - Allow editing wrong entries
   - Allow deleting expenses

3. **Weekly Summary**
   - Generate week-wise reports
   - Compare week-by-week spending

4. **Export Report**
   - Save monthly summary to a separate text file
   - Create a formatted report for printing

5. **Search by Date Range**
   - Show expenses between two dates
   - Example: All expenses from 01-04-2024 to 15-04-2024

6. **Top Expenses**
   - Show top 5 highest expenses
   - Identify spending patterns

---

## Project Deliverables

You need to submit:

1. **Python source code** (`.py` file)
2. **Sample data file** (CSV/TXT/JSON with test data)
3. **README file** explaining:
   - How to run the program
   - Features implemented
   - File structure used
   - Any assumptions made

4. **Test report** showing:
   - Screenshots of different features
   - Sample outputs
   - Error handling demonstrations

---

## Evaluation Criteria

Your project will be evaluated on:

1. **Functionality (40%)**
   - All core features working correctly
   - Proper data storage and retrieval
   - Accurate calculations

2. **Code Quality (30%)**
   - Proper use of functions
   - Clean and readable code
   - Meaningful variable names
   - Comments explaining logic

3. **User Experience (15%)**
   - Clear menu and instructions
   - Formatted output
   - Error messages are helpful
   - Easy to navigate

4. **Error Handling (15%)**
   - Validates user input
   - Handles file errors
   - Program doesn't crash on invalid input
   - Graceful error messages

---

## Real-world Learning Outcomes

By completing this project, you will:

✓ Understand how real expense tracking apps work  
✓ Learn to work with files for data persistence  
✓ Practice breaking down problems into functions  
✓ Handle dates and time in programming  
✓ Create meaningful data visualizations  
✓ Build error-proof applications  
✓ Develop problem-solving skills  
✓ Create portfolio-worthy project  

---

## Tips for Success

1. **Start Simple**: First make "add expense" and "view all" work, then add other features
2. **Test Frequently**: After adding each feature, test it thoroughly
3. **Use Sample Data**: Load the provided sample data to test filtering and reports
4. **Draw on Paper**: Sketch your data structure and file format before coding
5. **One Function at a Time**: Complete one function fully before moving to next
6. **Ask Questions**: If stuck, discuss with your instructor or peers
7. **Version Control**: Save different versions as you progress (v1, v2, v3)
8. **Comment Your Code**: Explain why you did something, not just what

---

## Getting Started Checklist

Before you start coding:

- [ ] Understand all requirements clearly
- [ ] Decide on file format (CSV/TXT/JSON)
- [ ] Design your data structure (how to store one expense)
- [ ] List all functions you need to create
- [ ] Plan your menu structure
- [ ] Create sample test data
- [ ] Set up your development environment
- [ ] Create project folder structure

---

## Sample Test Cases

Test your program with these scenarios:

**Test Case 1: First Time User**
- Run program (no existing file)
- Add first expense
- Check if file is created
- Close and reopen - data should persist

**Test Case 2: Multiple Expenses Same Category**
- Add 5 Food expenses
- View by Food category
- Verify all 5 are shown
- Check total is correct

**Test Case 3: Monthly Summary**
- Add expenses from sample data (Week 1 + Week 2)
- Generate monthly summary
- Verify calculations are correct
- Check percentages add up to 100%

**Test Case 4: Invalid Inputs**
- Try entering invalid date format
- Try entering negative amount
- Try entering text as amount
- Try entering invalid menu choice
- Verify proper error messages

**Test Case 5: Empty Categories**
- Generate monthly report
- Check if categories with ₹0 show correctly
- Verify zero percentage and empty bar

---

## Questions to Think About

Before coding, answer these:

1. How will you represent one expense in Python?
2. How will you store multiple expenses?
3. What file format will you use and why?
4. How will you calculate monthly totals from dates?
5. How will you create the bar chart visualization?
6. How will you handle the first time the program runs (no file exists)?
7. How will you validate user input?
8. How will you organize your code into functions?

---

## Inspiration

Think of this as building a mini version of apps like:
- Walnut
- Money Manager
- ET Money
- Expense IQ

But simpler, focused, and perfect for college students!

---

**Good luck, and happy coding!**

*Remember: The best way to learn programming is by building real projects that solve real problems. This project will teach you more than 10 theoretical exercises!*

---

