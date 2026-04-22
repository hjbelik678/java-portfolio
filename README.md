# 🚀 Java Portfolio | Henry Belik
**Physics & Computer Science Undergraduate | St. Cloud State University**

Welcome to my repository of Java implementations and algorithmic explorations. This collection documents my progress through undergraduate coursework, covering everything from fundamental data structure design to recursive problem-solving and Object-Oriented polymorphism.

---

## 📂 Project Directory

### 1. Custom Data Structures
* **`ArrayList`**: A scratch-built dynamic array implementation.
    * **Key Features**: Manual memory management with `ensureCapacity`, dynamic resizing via `Arrays.copyOf`, and standard `List` operations.
* **`Queue Project`**: Implementations of stack and queue data structures.
    * **Focus**: Logic for `Collapse` and `rearrange` operations using stack/queue principles.
* **`ArrayIntList` / `ArrayListMain`**: Specialized implementations for numerical processing.
    * **Logic**: Parsing large datasets, calculating statistical aggregates (min, max, average), and handling index-based manipulations.

### 2. Object-Oriented Design & Polymorphism
* **`Critter Project`**: A simulation of various entities interacting within a grid-based environment.
    * **Focus**: Heavy use of inheritance and polymorphism to manage diverse behaviors (e.g., `Bird`, `Frog`, `Wolf`, `Mouse`) within a single framework.
* **`Shape Project`**: A geometric class hierarchy.
    * **Logic**: Uses abstract classes and interfaces to calculate dimensions (Volume/Area) for complex 3D shapes like `Cone`, `Cylinder`, and `RectangularPrism`.
* **`Sports Project`**: A class hierarchy for sports players.
    * **Focus**: Distinguishing player types (`Soccer`, `Basketball`, `Tennis`) through method overriding and inheritance.
* **`Library Project`**: A complex item-tracking system.
    * **Focus**: Managing diverse media types (`Book`, `CD`, `Journal`, `Video`) using a unified `LibraryItem` interface.
* **`CS_2170_Restauraunt_project`**: A restaurant management system.
    * **Logic**: Simulates front-of-house and kitchen operations, managing `Waiters`, `Tables`, `Menus`, and `MenuItems` in an object-oriented architecture.

### 3. Recursive Algorithms & Problem Solving
* **`SortMethods`**: A robust implementation of **Merge Sort**.
    * **Technical Highlights**: Recursive divide-and-conquer strategy achieving $O(n \log n)$ time complexity.
* **`Selection Sort Project`**: Implementation of iterative sorting algorithms.
    * **Focus**: Variations of selection sort, including dual and backwards sorting methods.
* **`Crawl`**: Recursive directory traversal tool.
    * **Logic**: Depth-first search (DFS) to map file system hierarchies, utilizing recursive indentation logic.
* **`Homework 7/8/9`**: A collection of algorithmic problem-solving exercises.
    * **Highlights**: Sets, Map manipulation (`subMap`, `OneToOneChecker`), recursive math problems (`waysToClimb`, `countBinary`, `subSets`), and point geometry processing.
* **`rearrange`**: Specialized list-manipulation logic.
    * **Logic**: In-place modification of collections.
* **`In Class Projects`**: Miscellaneous exercises covering sorting, searching, linked lists (`ListNode`), and palindromic strings.

### 4. Text Processing & Utilities
* **`SetSearch`**: Advanced text analysis tool.
    * **Logic**: Uses `TreeSet` and `HashMap` to parse large text files (e.g., `bible.txt`) with `Iterator`-based filtering to safely remove patterns.
* **`Grocery Project`**: A shopping list management utility.
    * **Features**: Combines date handling (`MyDate`), item order logic, and rational number mathematics.
* **`bird`**: A small-scale exercise in simple class inheritance.

---

## 🛠️ Getting Started

### Prerequisites
* **Java JDK**: Version 17 or higher.
* **IDE**: VS Code (with the *Extension Pack for Java*) or Eclipse.

### Compilation & Execution
Since these projects are organized into standalone modules, navigate to the specific project folder and compile using `javac`:

1. **Navigate**: `cd "Project Name"`
2. **Compile**: `javac -d bin src/*.java`
3. **Run**: `java -cp bin MainClassName`

*Note: Projects utilizing external files (e.g., `bible.txt`) assume the file is located in the root project directory.*

---

## 👨‍💻 About Me
**Henry Belik**
*Physics & Computer Science Major | St. Cloud State University*

This repository highlights my commitment to writing clean, modular, and efficient Java code. My background in computational physics influences my approach to problem-solving, favoring efficiency and logical structure in my code architecture.

---
*Last Updated: April 2026*
