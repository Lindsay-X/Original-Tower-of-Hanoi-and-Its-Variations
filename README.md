# Original-Tower-of-Hanoi-and-Its-Variations
A Java code of the Original Tower of Hanoi, Adjacency Tower of Hanoi, and Exchange-Adjacency Tower of Hanoi used for 
a mathematical analysis of the most optimal method of solving the Tower of Hanoi and its variations.

<h3>Original Tower of Hanoi</h3>
<p>The game starts with the disks placed on the left-most peg descending in size from bottom to top (Gregg and Orozco). The goal of such a game is to move all the disks onto the third peg decreasing in size within the minimum number of moves under 3 rules:</p>
<ol>
  <li>Disks can only be moved one at a time</li>
  <li>Larger disks can’t go on top of smaller disks</li>
  <li>Only the disk on the top can be moved</li>
</ol>

<h3>Adjacency Tower of Hanoi</h3>
Additional rules to the Original: The disk can only be moved to the adjacent rod of the rod that the disk is on.

<h3>Exchange-Adjacency Tower</h3>
<p>New rules:</p>
<ol>
  <li>Larger disks can’t go on top of smaller disks</li>
  <li>Only the smallest disk can move normally</li>
  <li>The other disks can only move by swapping places with the smallest disk</li>
  <li>The disks can only be moved or swapped when they’re on top of the stack</li>
  <li>Disks can only move if the destined location is adjacent to the current location of the disk</li>
  <li>Disks can only swap if the 2 disks are on adjacent pegs</li>
</ol>
