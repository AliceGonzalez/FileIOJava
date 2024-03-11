## Reading in from a file

The basic process to read in from file is the following:

- Create an Scanner object using the input file
- Loop through each line and read it in 
  - After reading in the line, process the line
  - Move on to the next line
- Exit the loop after reading in all lines.

One thing to note is that we need to do this inside of a try/catch block. 
We will not be looking at the try/catch block functionality today, but not that it is required by Java anytime we read in a file.


## and inside the code...

Notice in the example on line 21, we use the `hasNext()` command and on line 24, we use the `nextLine()` command. The `hasNext()` command returns a boolean as to whether there are more lines to read. If there are, the program continues to loop and then reads in that next line using the `nextLine()` command. Notice that we create a string variable called `lineIn` to read this value each time through the loop.