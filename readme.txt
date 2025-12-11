At first glance, arrays and ArrayLists seem very similar. They’re both used to store collections of data in Java, and they often appear in similar situations. But once you take a closer look, you’ll notice that they serve different purposes and behave differently in actual programs.
An array is a fixed-size structure that stores elements of the same type, such as int, String, or char. One key thing to remember is that the size of an array cannot change after it’s created. Because of this, arrays are very fast and efficient when you know exactly how many elements you need. Accessing or updating a value is straightforward, since you can jump directly to any element using its index.
An ArrayList, however, offers more flexibility. It’s part of Java’s java.util package, so you need to import it before using it. The biggest advantage of an ArrayList is that its size can grow or shrink as needed. You can add or remove elements at any time, which makes it much more convenient when you’re working with data that changes or when you don’t know the number of elements ahead of time.
So even though arrays and ArrayLists both store multiple values, the main difference comes down to size and flexibility: arrays are fixed, while ArrayLists are dynamic and easier to adjust during runtime.
I pushed both files to GitHub from the terminal using:
1.	Git init – this initializes a new Git repository in the current folder, Git can start tracking changes to files
2.	Git add . – stages all files; it tells Git “These’re files I want to include in my next commit”
3.	Git commit – m “Description” – this creates a commit, which is a saved snapshot of the staged files with a message description
4.	Git remote add origin https://github.com/....... – this links my local repository to a remote repository on GitHub
5.	Git push -u origin main – this uploads my local commits to the main branch on GitHub
