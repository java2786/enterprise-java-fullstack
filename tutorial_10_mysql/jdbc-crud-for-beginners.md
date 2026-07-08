# JDBC CRUD for Absolute Beginners

### A Student Database Project using Java and MySQL

---

## Before We Start: Understanding Two New Words

If this is your first time working with a database from Java, two words are going to keep coming up: **Driver** and **Dependency**. Let us understand both in plain language before touching any code.

### What is a Driver?

Think of Suresh, who speaks only Hindi, wanting to talk to a shopkeeper in Chennai who speaks only Tamil. Suresh cannot talk to the shopkeeper directly. He needs a **translator** who understands both Hindi and Tamil.

In the same way, Java does not know how to talk to a MySQL database directly. Java speaks "Java language" and MySQL speaks its own "database language." A **JDBC Driver** is the translator that sits between them. It converts your Java method calls into commands that MySQL understands, and converts MySQL's replies back into something Java can use.

Every database company provides its own driver:
- MySQL provides a driver called **MySQL Connector/J**
- Oracle provides its own driver
- PostgreSQL provides its own driver

Since we are using MySQL in this tutorial, we need the **MySQL driver**.

### What is a Dependency?

Imagine Ramesh is building a small wooden table. He needs a hammer. He does not manufacture a hammer from raw iron ore himself — he simply buys one from a hardware shop and uses it.

A **dependency** is exactly this. It is a ready-made piece of code (usually packed as a `.jar` file in Java) written by someone else, which we simply plug into our project instead of writing that logic ourselves.

The MySQL driver we just talked about is not something built into Java. It comes as an external `.jar` file that we must **add as a dependency** to our project. Without adding this dependency, Java has no translator, and it simply cannot talk to MySQL.

That is the entire concept. Now let us set things up step by step.

---

## Step 1: Setting Up the Project

We will use **Maven**, which is a tool that manages dependencies for us automatically. Instead of manually downloading a `.jar` file from the internet, we just tell Maven "I need the MySQL driver" and it downloads and attaches it to our project for us.

If you are using an IDE like IntelliJ IDEA or Eclipse, create a **Maven project**. Maven projects always contain a file called `pom.xml`. This file is like a shopping list — you write down what dependencies (tools) your project needs, and Maven fetches them for you.

Open `pom.xml` and add the following inside the `<dependencies>` tag:

```xml
<dependencies>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
</dependencies>
```

That's it. Save the file. Maven will now download the MySQL driver jar file for you in the background. This single step is what allows Java to "talk" to MySQL.

> **Note for absolute beginners:** If you are not using Maven and simply want to try this in a plain Java project, you can manually download the `mysql-connector-j` jar file from the official MySQL website and add it to your project's classpath / build path. Maven is recommended because it removes this manual work.

---

## Step 2: Creating the Database and Table

Open MySQL Workbench (or any MySQL client) and run the following SQL script. We are building a small student database for a coaching institute, similar to what Suresh's Training Institute in Pune might maintain.

```sql
-- Create a new database
CREATE DATABASE student_portal;

-- Select the database to use
USE student_portal;

-- Create a table to store student records
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    course VARCHAR(50),
    marks INT
);

-- Insert a couple of sample records
INSERT INTO students (name, city, course, marks) VALUES ('Suresh Kumar', 'Pune', 'Java', 78);
INSERT INTO students (name, city, course, marks) VALUES ('Dinesh Patil', 'Chennai', 'Python', 85);
```

Run this script once. You should now have a database called `student_portal` with one table `students` containing two rows.

You can verify this by running:

```sql
SELECT * FROM students;
```

You should see Suresh Kumar and Dinesh Patil listed in the output.

---

## Step 3: The Five Building Blocks of Every JDBC Program

Every single JDBC program you will ever write, no matter how complex, follows the same five steps. Learn these once, and you will use them forever.

| Step | What it does | Real-world analogy |
|------|--------------|---------------------|
| 1. Load the driver | Tells Java which translator to use | Hiring the Hindi-Tamil translator |
| 2. Create a Connection | Opens a phone line to the database | Suresh dialing the shopkeeper's number |
| 3. Create a Statement | Prepares the SQL command to send | Writing down what Suresh wants to say |
| 4. Execute the query | Sends the command and gets a result | Actually speaking to the shopkeeper |
| 5. Close the connection | Hangs up the phone line | Ending the call politely |

Keep this table in mind. Every code block below is simply a variation of these five steps.

---

## Step 4: Common Connection Details

Before writing code, note down these four values. You will use them in every program.

```java
String url = "jdbc:mysql://localhost:3306/student_portal";
String username = "root";
String password = "your_mysql_password";
```

- `localhost` means the database is running on your own computer.
- `3306` is the default port number MySQL uses.
- `student_portal` is the database name we created in Step 2.
- Replace `your_mysql_password` with the actual password you set when installing MySQL.

---

## Step 5: CREATE — Inserting a New Student

Let us add a new student, Mahesh Joshi from Mumbai, into the table using Java.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_portal";
        String username = "root";
        String password = "your_mysql_password";

        String sql = "INSERT INTO students (name, city, course, marks) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "Mahesh Joshi");
            statement.setString(2, "Mumbai");
            statement.setString(3, "React");
            statement.setInt(4, 90);

            int rowsInserted = statement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### What is happening here, line by line

- `DriverManager.getConnection(...)` performs Step 1 and Step 2 together. It automatically finds the right driver based on the `url` you passed, and opens a connection.
- We use `PreparedStatement` instead of a plain `Statement`. Think of the `?` marks as blank spaces in a form that Mahesh fills in later. This is the standard, safe way to insert values in JDBC (it also protects against a common security issue called SQL Injection).
- `setString(1, "Mahesh Joshi")` fills the first `?` with the name. Numbering starts from 1, not 0.
- `executeUpdate()` is used whenever you are **changing** data (INSERT, UPDATE, DELETE). It returns the number of rows affected.
- The `try (...)` block is called **try-with-resources**. It automatically closes the connection and statement for you once the block finishes, so you do not have to remember to close them manually. This directly covers Step 5 from our table above.

---

## Step 6: READ — Fetching All Students

Now let us read and print every student from the table.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadStudents {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_portal";
        String username = "root";
        String password = "your_mysql_password";

        String sql = "SELECT * FROM students";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                String course = resultSet.getString("course");
                int marks = resultSet.getInt("marks");

                System.out.println(id + " | " + name + " | " + city + " | " + course + " | " + marks);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### What is happening here

- We used a plain `Statement` here instead of `PreparedStatement` since there is no user input to fill in — the query has no `?` marks.
- `executeQuery()` is used only for `SELECT` statements, since it returns data. This is different from `executeUpdate()`, which returns just a number.
- `ResultSet` is like a table sitting in memory, containing all rows returned by the query. It acts like a pointer starting **before** the first row.
- `resultSet.next()` moves the pointer to the next row and returns `true` if a row exists, `false` if there are no more rows. This is why we use it inside a `while` loop — to go through every row one by one.
- `getInt("id")` and `getString("name")` fetch column values by their column name.

---

## Step 7: UPDATE — Changing a Student's Marks

Let us say Dinesh Patil scored better in a re-evaluation, and his marks need to be updated from 85 to 92.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_portal";
        String username = "root";
        String password = "your_mysql_password";

        String sql = "UPDATE students SET marks = ? WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, 92);
            statement.setString(2, "Dinesh Patil");

            int rowsUpdated = statement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Notice the pattern is nearly identical to the INSERT example. This is the real beauty of JDBC — once you understand `PreparedStatement` with `?` placeholders, INSERT, UPDATE, and DELETE all feel like the same skill applied differently.

---

## Step 8: DELETE — Removing a Student

Suppose Suresh Kumar has left the institute and his record needs to be removed.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_portal";
        String username = "root";
        String password = "your_mysql_password";

        String sql = "DELETE FROM students WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "Suresh Kumar");

            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Once again, note that `executeUpdate()` is used, since DELETE also changes data rather than reading it.

---

## Quick Comparison Table: The Four Operations

| Operation | SQL Keyword | JDBC Method Used | Statement Type |
|-----------|-------------|-------------------|-----------------|
| Create | INSERT | executeUpdate() | PreparedStatement |
| Read | SELECT | executeQuery() | Statement or PreparedStatement |
| Update | UPDATE | executeUpdate() | PreparedStatement |
| Delete | DELETE | executeUpdate() | PreparedStatement |

Keep this table pinned near your desk until these four operations become second nature.

---

## Common Beginner Mistakes to Avoid

1. **Forgetting to add the dependency in `pom.xml`.** This causes a `ClassNotFoundException` or `No suitable driver found` error, since Java has no translator to talk to MySQL.
2. **Wrong database URL, username, or password.** This causes a `Communications link failure` or `Access denied` error. Always double check port number (3306) and password.
3. **Forgetting to start the MySQL server** before running the Java program. JDBC cannot connect to a database that is not running.
4. **Using `executeQuery()` for INSERT/UPDATE/DELETE**, or `executeUpdate()` for SELECT. Remember: Query is for reading, Update is for changing.
5. **Forgetting the database name in the URL**, for example writing `jdbc:mysql://localhost:3306/` instead of `jdbc:mysql://localhost:3306/student_portal`.

---

## Quiz: Test Your Understanding

1. What is the main purpose of a JDBC driver?
2. Why do we add the MySQL connector as a dependency in `pom.xml` instead of writing that code ourselves?
3. Which method is used to execute a SELECT query — `executeQuery()` or `executeUpdate()`?
4. What does `resultSet.next()` do inside a while loop?
5. In `PreparedStatement`, does parameter numbering with `?` start from 0 or 1?
6. What error would you likely see if you forgot to add the MySQL dependency to your project?
7. What is the purpose of `try-with-resources` in the CRUD examples above?

### Answer Key

1. It acts as a translator between Java and the MySQL database, converting Java calls into a language MySQL understands and vice versa.
2. Because someone else has already written, tested, and maintained this logic. Reusing it as a dependency saves time and avoids repeating work, just like buying a hammer instead of forging one.
3. `executeQuery()`, since SELECT reads data and returns a `ResultSet`.
4. It moves the cursor to the next row in the result set and returns `true` if a row exists, allowing us to loop through every row returned by the query.
5. Numbering starts from 1, not 0.
6. A `ClassNotFoundException` or a "No suitable driver found" error, since Java cannot locate the MySQL driver class.
7. It automatically closes the `Connection`, `Statement`, and `ResultSet` objects once the block finishes running, so we do not have to manually close them or risk forgetting to do so.

---

## Mini Assignments

### Easy

1. Insert a new student named **Kamlesh Rane** from **Nagpur**, enrolled in the **SQL** course, with **70** marks.
2. Write a program to print only the `name` and `marks` columns of all students, instead of all five columns.

### Medium

3. Write an UPDATE program to increase every student's marks by 5 points where the course is `'Java'`.
4. Write a READ program that only prints students whose marks are greater than 80 (hint: modify the SQL query with a `WHERE marks > 80` clause).

### Stretch

5. Write a single Java program with a menu (using `Scanner` and a `switch` statement) that lets the user choose between Insert, Read, Update, and Delete, all from one running program instead of four separate files.
6. Add a new column `email` to the `students` table using `ALTER TABLE`, and write a JDBC program to update the email for a given student name.

---

## Resume Bullet Template

Once you complete this project, you can add a line like this to your resume:

> Developed a Java-based Student Record Management System using JDBC and MySQL, implementing complete CRUD (Create, Read, Update, Delete) operations with PreparedStatement to ensure secure and reusable database queries.
