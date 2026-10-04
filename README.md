# Library Demo

A small console-based Java program that simulates a library. You add a list of books, then borrow them by title until you type `done`.

## Features

- Add any number of books at startup
- View the book list with each book's borrowed status
- Borrow books by title (case-insensitive)
- Friendly messages when a book isn't found or is already borrowed

## Project Structure

| File | Description |
|------|-------------|
| `Book.java` | Represents a book: its title and whether it is borrowed. Includes `borrow()` and `returnBook()` methods. |
| `Borrower.java` | Handles the borrowing loop: reads titles from the console, finds the matching book, and borrows it. |
| `LibraryDemo.java` | Entry point (`main`). Asks how many books to add, collects titles, prints the list, then starts the borrowing session. |

## Requirements

- Java Development Kit (JDK) 8 or later

## How to Compile and Run

From the folder containing the `.java` files:

```bash
javac *.java
java LibraryDemo
```

## Example Session

```
How many books add? 2
Title book 1: Dune
Title book 2: Emma

Books added
- Dune (borrowed: false)
- Emma (borrowed: false)
Enter a book title to borrow (or 'done' to stop):
dune
You borrowed Dune.
Enter a book title to borrow (or 'done' to stop):
Dune
Sorry, "Dune" is already borrowed.
Enter a book title to borrow (or 'done' to stop):
Hamlet
No book found with that title.
Enter a book title to borrow (or 'done' to stop):
done
```

## How It Works

1. `LibraryDemo` reads the number of books and each title, creating a `Book` object for each and storing them in an `ArrayList<Book>`.
2. The list is passed to a `Borrower`, which loops asking for titles.
3. For each title, `Borrower` searches the list with `equalsIgnoreCase`, then checks `isBorrowed()` before calling `borrow()`.
4. Typing `done` ends the program.

## Possible Improvements

- Add a menu option to return a book (`Book.returnBook()` already exists)
- Show the updated book list when the session ends
- Handle invalid input for the number of books (e.g. non-numeric text)
