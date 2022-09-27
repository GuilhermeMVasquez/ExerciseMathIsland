# ExerciseMathIsland
## Part 1
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

For the input given in the .txt, what is the distance to Manhattan from the ship’s final position?

## Part 2
Looking again at the instructions we realize that they were in fact referring to a waypoint that moves relative to the ship, that is if the ship moves the waypoint moves.

- "N" means move the waypoint North for the given value.
- "S" means move the waypoint South for the given value.
- "E" means move the waypoint East for the given value.
- "W" means move the waypoint West for the given value.
- "L" means turn the waypoint left by a set number of degrees.
- "R" means turn the waypoint right by a set number of degrees.
- "F" means move the waypoint forward in the direction the ship is facing.

The waypoint starts at East 10, North 1.

For example, the following input:

- F10
- N3
- F7
- R90
- F11

F10 moves the ship to the waypoint 10 times (a total of 100 units East and 10 units North), stopping the ship at East 100, North 10. The waypoint remains 10 units East and 1 North of the ship.

N3 moves the waypoint 3 units North, leaving it at East 10, North 4. The ship stays at East 100, North 10.

F7 moves the ship to the waypoint 7 times (a total of 70 units East and 28 units North), stopping the ship at 170 units East, North 38. The waypoint remains 10 units East, 4 units North of the ship. 

R90 rotates the waypoint 90 degrees to the right, moving it to 4 units East, 10 units South of the ship. The ship remains at East 170, North 38.

F11 moves the ship to the waypoint 11 times (a total of 44 units East and 110 units South), stopping at East 214, South 72. The waypoint remains 4 units East and 10 units South of the ship.

At the end of the instructions, the distance to Manhattan from the ship is the sum of the absolute values of its position East/West and North/South from its initial position. The ship’s distance to Manhattan is 214 + 72 = 286.

For the input given in the .txt, what is the distance to Manhattan from the ship’s final position?
