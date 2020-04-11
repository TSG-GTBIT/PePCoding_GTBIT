#Students Chaining
##Statement

You are given square like chains of students. There may be multiple chains and chain with less number of students should be embedded
inside the chain having large number of students. Each student is having an ID(may not be unique). For ex -
1   2   3   4   5  6
7   8   9  10  11  12 
13 14  15  16  17  18
19 20  21  22  23  24
25 26  27  28  29  30
31 32  33  34  35  36

Here , 
chain1 -> 1 2 3 4 5 6 12 18 24 30 36 35 34 33 32 31 25 19 13 7 
chain2 -> 8 9 10 11 17 23 29 28 27 26 20 14 
chain3 -> 15 16 22 21

Input is given in the form of Two-D array in which one or more chains may be present.
You are given a number k. Each student have to move k steps in anticlockwise direction. Student is allowed to move in its own chain only. Print the final arrangement of Two-D array after all movements.

##