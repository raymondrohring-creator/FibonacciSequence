# Fibonacci Sequence (Java)

This simple Java program prints the Fibonacci sequence up to a number of terms specified by the user. It uses an iterative approach and reads input from the console.

## 📌 Features

* Prompts the user for the number of Fibonacci terms to display
* Uses a straightforward loop-based implementation
* Outputs each term on a new line
* Beginner-friendly example for learning loops, variables, and user input in Java

## 🧩 Code Overview

```java
package day6;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence you would like to view...");
        int terms = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        
        for (int i = 1; i <= terms; i++)
        {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
```

## ▶️ How to Run

1. **Clone this repository**

   ```bash
   git clone https://github.com/your-username/your-repo.git
   ```

2. **Navigate into the project directory**

   ```bash
   cd your-repo
   ```

3. **Compile the program**

   ```bash
   javac day6/Fibonacci.java
   ```

4. **Run the program**

   ```bash
   java day6.Fibonacci
   ```

5. **Enter the number of terms** when prompted.

## 💡 Example Output

```
Enter the number of terms in the Fibonacci sequence you would like to view...
5
Fibonacci sequence:
0
1
1
2
3
```

## 📘 What is the Fibonacci Sequence?

The Fibonacci sequence is a series of numbers in which each term is the sum of the two preceding terms, typically beginning with **0** and **1**:

```
0, 1, 1, 2, 3, 5, 8, 13, ...
```

It appears in mathematics, nature, computer science, and many algorithms.

## 🛠️ Requirements

* Java Development Kit (JDK) 8 or later
* A terminal or IDE that can compile and run Java code

## 📄 License

This project is open-source. Feel free to modify or reuse as needed.
