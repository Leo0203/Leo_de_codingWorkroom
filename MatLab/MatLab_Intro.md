# Save and Load Files
1. ```
    >> save filename.mat
    ```
    This command will save the data into the a matlab file.
2. ```
    >> clean
    ``` 
    This command will empty the workspace.
3. ```
    >> load filename.mat
    ```
    This command will load the data into the workspace.
4. ```
    >> clc
    ```
    This command will empty the command tab.
5. When closing MatLab the workspace is cleared. Data needed can be saved using  the above method before the window is closed and load the file when the data are needed. When you want to save or load specific variable, use the command below
    ```
    >> load myData k
    >> save myDatak k
    ```

# Build in Functions and Constants
1. ```
    sqrt()
    ```
    This function return the square root of the numeric input
2. ```
    format long
    x
    ```
    This command returns more decimal places of a variable
    ```
    format short
    x
    ```
    This command returns less decimal places of a variable

# Live Script
1. Create a new live script in the top menu and type blocks of code in the grey box to have them executed at one time. 
2. In the live editor, click on the white space to give descriptions of the codes
3. Hit run button at the top menu to run all codes in the live script at once
4. Select a section of code and hit "run section" to only execute the section selected
5. Hit section break at top right to create a new section in the live script

# Simple Array
1. A single number is a scalar, a 1 by 1 array
2. A single row array is created using the following method
    ```
    x = [3 5]
    x = [3,5]
    x = [3, 5]
    ```
    These all give a 1*2 array 
3. Use ; to separate numbers in different rows
    ```
    x = [1;3]
    ```
    This gives an 2*1 array 
    ```
    x = [3 4 5; 6 7 8]
    ```
    This is a 2*3 matrix with row one being 3 4 5 and row two being 6 7 8
4. Calculations are allowed in the square brackets
5. An array usually has consecutive numbers or numbers with patterns
    ```
    x = 1:2:10
    ```
    This create an row array with its elements being 1, 3, 5, 7, 9
6. If you know the number of elements, starting and ending point
    ```
    x = linspace(0, 1, 5)
    ```
    This gives a row array with five equally spaced elements, starting from 0 to 1
7. the symbol ' transpose a vector

# Creating Array with Functions
1. create a matrix with random elements 
    ```
    x = rand(5, 6)
    x = rand(5)
    ```
    This creates a 5*6 matrix with random number for each element
    The second one creates 5*5 square matrix

2. zeros and ones function can create matrix containing only ones and zeros
    ```
    x = ones(2, 3)
    x = zeros(6, 3)
    ```
    The first one creates 2*3 matrix with one as all of the elements
    The second one creates 6*3 matrix with zero as all of the elements\

3. To find a size of a matrix use the function below
    ```
    size(x)
    ```

# Array Indexing
1. To get a specific element from an array
    ```
    y = A(5, 7)
    y = A(end, 7)
    y = A(end - 2, end - 3)

    row = 2
    column = 3
    y = A(row, column)

    y = A(3)
    ```
    This gets the element a57 from matrix A
    The second line gets the element in the last row and column 7
    The last line will give the third element when going through every columns by sequence

2. To get multiple elements, use : to span all the elements in the entire dimension
    ```
    x = A(:, 1)
    x = A(1:3, :)
    ```
    First gives first column of A
    Second gives 1, 2, 3 rows of matrix A
3. To get an element in a vector
    ```
    x = v(3)
    x = v(3, 6, 9)
    x = v(3: 5)
    x(2) = 0.5
    ```
    The first one returns the thrid element in the vector v
    The second one returns a new vector with 3, 6, 9 elements of the vector v
    The third one returns new vector with 3 to 5th elements of the vector v
    The forth one change the second element of x to 0.5

# Array Operations on Vectors
1. Add a scalar value to all elements of v or scaling all elements of a vector
    ```
    r = vector + 2
    r2 = vector / 2
    ```
2. Adding two vectors of the same dimension
    ```
    r = v1 + v2
    ```
3. Some basic functions can be applied to vectors 
    ```
    vMax = max(vector)
    vSqrt = sqrt(vector)
    r = v1 .* v2
    sizev = size(vector)
    [mr, mc] = size[matrix]
        [~, mc] = size[matrix]
    [vmax, vid] = max(v)
    ```
    The first one returns the biggest element in vector
    The second one returns a new vector with the sqrt of each element from the original vector
    The thrird one gives a new vector with ri = v1i * v2i
    The forth one gives the size of the vector
    The fifth one gives mr = # of rows in the matrix and mc = # of columns in the matrix. You can skip saving the number of rows by using ~ to take up the space
    The sixth one gives vmax = maximum element in v and vid = index of the maximum element
4. Use the help button at the top right to access matlab documentation for how to use functions 

# Plot Vectors
1. A plot with v1 as x axis and v2 as y axis
    ```
    plot(v1, v2)
    ```
2. To plot several lines on the same plot
    ```
    plot(x1, y1)
    hold on
    plot(x2, y2)
    hold off
    ```
    hold off stop plot on the same axis
3. Plot with only one parameter
    ```
    plot(v1)
    ```
    x axis is automatic assumed to be 1 to n where dimension of v1 is n

# Annotating Plots
1. To add diagram title or axies titles to an existing plot
    ```
    title("Plot Title")
    ylabel("title for y axis")
    legend("a", "b")
    ```
    Notice the order of the legend does matter

# Table
1. To extract variables from a table, use dot notations
    ```
    vector = table.column2
    table.result = table.column1 .* table.column2
    ```
    The second line multiply each element from column 1 to column 2 and stored in the column named result. If result does not exist in the table, it is automatically created. 

# Logical Operators
1. Comparisons return 1 for true and 0 for false
2. You can compare each element of an array with a scalar. This returns an array of ones and zeros
    ```
    vector 1 < 4
    ```
    The output is called a logical array, the logical array can be used as an index for the array itself or other arrays
    ```
    vector2 = vector1(vector1 < 4)
    vector4 = vector3(vector1 < 4)
    ```
    First line gives a new array with only elements bigger than 4 in vector 1
3. Use "&" as and and "|" as or to combine logical comparisons

# If Statement
1. When a block of code is executed on conditions, use the following structure
    ```
    if x > 0.5
        y = 3
    else if x < 0.3
        y = 0
    else
        y = -1
    end
    ```
# For Loops
1. When a block of code is executed repeatedly with small changes use the following strucuture
    ```
    for c = 1:3
        disp(c)
    end
    ```
    This block runs three times


# Summary of MATLAB Onramp
## Basic Syntax
1. Example	Description
    - x = pi	Create variables and assign values with the equal sign (=). The left side (x) is the variable name, and the right side (pi) is its value.
    - y = sin(-5)	Provide inputs to a function using parentheses.
 
## Desktop Management
Function	Example	        Description
save	    save data.mat	Save your current workspace to a MAT-file.
load	    load data.mat	Load the variables in a MAT-file to the workspace.
clear	    clear	        Clear all variables from the workspace.
clc	        clc	            Clear all text from the Command Window.
format	    format long	    Change how numeric output appears in the Command Window.
 
## Array Types
Example	        Description
4	            scalar
[3 5]	        row vector
[1;3]	        column vector
[3 4 5; 6 7 8]	matrix
 
## Evenly Spaced Vectors
Example	            Description
1:4	                Create a vector from 1 to 4, spaced by 1, using the colon operator (:).
1:0.5:4	            Create a vector from 1 to 4, spaced by 0.5.
linspace(1,10,5)	Create a vector with 5 elements. The values are evenly spaced from 1 to 10.
 
## Matrix Creation
Example	        Description
rand(2)	        Create a square matrix with 2 rows and 2 columns.
zeros(2,3)	    Create a rectangular matrix with 2 rows and 3 columns of 0s.
ones(2,3)	    Create a rectangular matrix with 2 rows and 3 columns of 1s.
 
## Array Indexing
Example	        Description
A(end,2)	    Access the element in the second column of the last row.
A(2,:)	        Access the entire second row.
A(1:3,:)	    Access all columns of the first three rows.
A(2) = 11	    Change the value of the second element of an array to 11.
 
## Array Operations
Example	                Description
[1 2; 3 4] + 1
ans =
     2     3
     4     5	        Perform array addition.
[1 1; 1 1]*[2 2; 2 2]
ans =
     4     4
     4     4	        Perform matrix multiplication.
[1 1; 1 1].*[2 2; 2 2]
ans =
     2     2
     2     2	        Perform element-wise multiplication.
 
## Multiple Outputs
Example	                    Description
[xrow,xcol] = size(x)	    Save the number of rows and columns in x to two different variables.
[xMax,idx] = max(x)	    Calculate the maximum value of x and its corresponding index value.
 
## Documentation
Example	        Description
doc randi	    Open the documentation page for the randi function.
 
## Plots
Example	                        Description
plot(x,y,"ro--",LineWidth=5)	Plot a red (r) dashed (--) line with a circle (o) marker, with a heavy line width.
hold on	                        Add the next line to the existing plot.
hold off	                    Create new axes for the next plotted line.
title("My Title")	            Add a title to a plot.
xlabel("x")
ylabel("y")	                    Add labels to axes.
legend("a","b","c")	            Add a legend to a plot.
 
## Tables
Example	                                        Description
data.HeightYards	                            Extract the variable HeightYards from the table data.
data.HeightMeters = data.HeightYards*0.9144	    Derive a table variable from existing data.
 
## Logical Indexing
Example	            Description
[5 10 15] > 12	    Compare the elements of a vector to the value 12.
v1(v1 > 6)	        Extract all elements of v1 that are greater than 6.
x(x==999) = 1	    Replace all values in x that are equal to 999 with the value 1.
 
## Programming
Example	        Description
if x > 0.5
    y = 3
else
    y = 4
end	            If x is greater than 0.5, set y to 3. Otherwise, set y to 4.
for c = 1:3
    disp(c)
end	            The loop counter (c) progresses through the values 1:3 (1, 2, and 3).The loop body displays each value of c.
