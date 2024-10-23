import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Omar Idris

class Main2 {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String> progLanguages = new LinkedList<String>();

    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");

    // 3. Remove the element "C++" from the list using .remove()
    progLanguages.remove("C++");

    // 4. Add an element "HTML" at index 2.
    progLanguages.add(2, "HTML");

    // 5. Iterate over progLanguages and use println() to output each element. 
    Iterator<String> iterator = progLanguages.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q
    Queue<String> q = new LinkedList<>();

    // 7. Add 5 first names to q.
    q.add("Alice");
    q.add("Bob");
    q.add("Charlie");
    q.add("David");
    q.add("Eve");

    // 8. Uncomment the following line
    System.out.println("Elements of queue: " + q);

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    String removedElement = q.remove();
    // Display the value of "Removed element: " + removedElement
    System.out.println("Removed element: " + removedElement);

    // 10. View the head of the queue using peek(). Output its value.
    System.out.println("Head of the queue: " + q.peek());

    // 11. Using for(String element : q), output all of the values in the queue
    for (String element : q) {
      System.out.println(element);
    }
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<>();

    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");

    // 14. pop() 1 book off the stack. Display its value
    String poppedBook = bookStack.pop();
    System.out.println("Popped book: " + poppedBook);

    // 15. Use the peek() method to view the top book on the stack
    System.out.println("Top book on the stack: " + bookStack.peek());

    // 16. push() "Web DB Technologies" onto the stack
    bookStack.push("Web DB Technologies");

    // 17. Use the peek() method to view the top book on the stack
    System.out.println("Top book on the stack after push: " + bookStack.peek());

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.
    int position = bookStack.search("Design Patterns");
    System.out.println("Position of 'Design Patterns' in stack: " + position);

    // 19. Call empty(). Output the results
    boolean isEmpty = bookStack.empty();
    System.out.println("Is the stack empty? " + isEmpty);

    // 20. Print the titles of all of the books on the stack
    System.out.println("Books on the stack:");
    for (String book : bookStack) {
      System.out.println(book);
    }
  }
}