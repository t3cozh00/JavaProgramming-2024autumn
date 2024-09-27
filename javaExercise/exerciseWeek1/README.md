You can find answers to these questions through a link with the exercises. These questions are created by another teacher for the Finnish Java course. When you look into the answers, "harj1" means the answer for question 1, and so on.

In addition, you can also look for Java programming exercises over the Internet. For example, here you find hundreds of exercises for beginners with answers: https://www.w3resource.com/java-exercises/

Exercises for arithmetic operations and using the console:

Answers here.

1. Ask the user for two integers. By using separate variables print the sum, product and quotient of the numbers to the console.

2. Ask the user for name and age. Print to the console "Hey <name>! You are <age> years old" (replace with the given information).

3. Use the variables given by the user in task 1 directly in the println method, so that the program prints both the invoice and the result. E.g. "3 + 2 = 5"

4. Write a program that asks for an amount in dollars and converts it to euros. Find the exchange rate online and define it as constant (keyword final).

5. Write a program that calculates a person's body mass index. Find the necessary formula online, and first, store the values ​​used in variables. Print the body mass index to the console. Use fractional number (floating point data type) variables.

6. Write a program that calculates and prints the area of ​​a rectangle, square and circle. Give the variables the values ​​of your choice. (Constant for Pi is defined in Math.PI)

7. Ask the user the number of apples. Print how many apples are left, when they are divided equally among five people (modulo operator).

8. Ask Matt how much money he has and how many children he has. Then Matt divides the money equally among the children to the nearest euro, but he keeps the remainder (cents) for himself. Print out how much money Matt has.

a. Modify the previous task in such a way that Matt keeps the amount of money that goes over 50 euros and splits the rest among the children equally. Print out how much money Matt now has.

9. Generate a random number between 0-100, but in such a way that the number is divisible by five. E.g. allowed random numbers are 0, 5, 10, 15, .., 100. Help with random numbers can be found for example here: https://www.geeksforgeeks.org/generating-random-numbers-in-java/

Exercises for logical expressions:

Answers here.

1. Which of the following statements are true:

5 == 6
5 > 6
4 <= 4
6 > 0
(5 == 6) || (6 == 6)
(5 > 6) && (7 > 5)
(4 <= 4) && (2< 1)
(6 > 0) && (1 == 0)

2. What condition should you use to test whether a number is between 0-10?

3. What condition should you use to test if the number is negative or greater than 100?

4. Matt's score is M, Sara's score is S and Tina's score is T. Make a logical expression that returns true if Sara's score is not greater than anyone's score, and also Tina's score is greater than Matt's score and no two scores must be the same.

For the following, answers here.

2. Ask the user for a score. If the score is less than 10, "Your result could be improved" is printed. Otherwise, "Good result!" is printed.

a. Change the program to ask for the scores of the two players. Print whose score was better or report a tie.

3. Ask the user about the account balance and the price of a product. Check whether the balance is sufficient to buy the product. If the balance is enough to buy the product, print out "Your money is enough to buy the product" to the console.

a. Modify the program to indicate if the balance is not enough. If so, print out "Your money is not enough to buy the product" and tell how much more money is needed.

4. Make a program that asks the user's age. Output depends on the age as follows:

a. 35-50 -> "You are middle-aged".
b. Under 18 -> "You are young".
c. Over 50 -> "You are old".
d. Otherwise -> "You are adult".

5. Write a program that asks the user how much money he has. If he has less than 10 euros, ask the user if he wants a loan. Answers by character 'y'/'n' are accepted. If the user wants to take out a loan (choice 'y'), the amount of loan is asked.

Exercises for repetition statements:

Answers here.

While statement:

1. Print the word "Welcome" three times.

2. Print numbers 1-3.

3. The multiplication table of five (1*5 ...9*5) is printed.

4. Print the even numbers between 0 and 20 using a while loop.

5. Ask the user for a number until he gives the value 0.

6. Ask the user for five numbers and print their sum.

7. Ask the user for a number. Questioning continues until the number is between 1-10.

8. Make a program that uses two nested while statements to print all multiplication tables. The outer while prints the multiplier 1-9 and the inner while multiplies it 1-9. (1*1, 1*2, ... , 9*8, 9*9)

Do-while statement:

1. Write a program that always multiplies the previous number by two (the initial value of the number is 2) and prints the result. Repetition is stopped when the user so wishes.

2. The user is asked for a number. Ask until the number is between 1-20. Check the number and if its not within that range, print out "Number must be between 1-20".

3. Ask the user for integers until the user gives the value 0.

4. Write a program with two nested while loops. The outer while repeats 3 times and the inner 4 times. The loops should print out iterations in the following way. Outer iteration at the beginning of each line and inner iteration within the line.

1 : 1 2 3 4

2 : 1 2 3 4

3 : 1 2 3 4

(Btw, nested while loops are generally not good programming style..)

For statement:

1. Write a for loop that prints the numbers 0-10.

2. Modify the previous task so that the body of for loop prints numbers 3-15.

3. Write a program that asks the user how many times to print "Hello world!" and then do it with for loop.

4. Write a for loop that prints the even numbers 0-20.

5. Use a for loop to print 200,000 characters '\*' to the console. Estimate how long the program takes to run. What is the most significant thing slowing down the program? (Edit: This exercise is rather old, maybe try several million instead..)

6. Write a program that asks the user how many bits are used. Then write a for loop statement that calculates powers of two according using each bit. So, for example, if the user gives 5 bits, then we calculate how much is 2^5, i.e. 2*2*2*2*2. (Edit: Have fun using large number of bits and large integer data types..)

7. Write a for statement with two counters. One starts from zero and increases by one at a time, the other starts from 200 and decreases by two. Print both counters in each round and stop the loops when the counters have passed each other.

8. Write a for loop that prints football jersey numbers 10-19 for ten players. After the number, print out additional id number given to each player, starting from 100 onwards with a step of 3. Below is an example:

Player 10: 100
Player 11: 103
Player 12: 106
...

9. For each of 10 players, generate five random numbers (between 0-8) for each of the three teams. How would you make such a program with three nested for loops. The output should be as follows:

Team 1:
Player 1 numbers: 5,6,8,4,6
Player 2 numbers: 4,6,2,7,5
...
Team 2:
Player 1: Numbers: 3,5,1,7,7
...
Team 3:
...
