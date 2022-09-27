# ExerciseMathIsland
My friend Knuth and I always had one goal in common: to find the math island

The sailing instructions(input) consist of a sequence of actions defined by a letter and an integer
After looking for a few minutes, you find out what they probably mean:

- "N" means move North for the given value.
- "S" means move South for the given value.
- "E" means move East for the given value.
- "W" means move West for the given value.
- "L" means turn left by a set number of degrees.
- "R" means turn right by a set number of degrees.
- "F" means move forward in the direction the ship is facing.

The ship starts facing East. Only the actions “L” and “R” change the direction the ship faces.

For example, the following input:

- F10
- N3
- F7
- R90
- F11

F10 moves the ship 10 units East, stopping at East 10, North 0.

N3 moves the ship 3 units North, stopping at East 10, North 3.

F7 moves the ship 7 units East, stopping at East 17, North 3. 

R90 rotates the ship 90 degrees to the right, making it face South. Stays at East 17, North 3.

F11 moves the ship 11 units South, stopping at East 17, South 8.

At the end of the instructions, the distance to Manhattan from the ship is the sum of the absolute values of its position East/West and North/South from its initial position. The ship’s distance to Manhattan is 17 + 8 = 25.

## For the input given in the .txt, what is the distance to Manhattan from the ship’s final position?
