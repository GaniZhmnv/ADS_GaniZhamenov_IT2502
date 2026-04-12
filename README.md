GANI ZHAMENOV     IT 2502

Task 1. Print Digits of a Number
Write a recursive function that takes an integer as input and
prints every digit of the given number on a separate line.

<img width="739" height="960" alt="Снимок экрана 2026-03-21 181340" src="https://github.com/user-attachments/assets/0db9a0f8-16ff-45be-a94f-06ebc4c72977" />

I printed all the remainders from dividion of number.

Task 2. Average of Elements
Write a recursive function to calculate the sum of the
elements, then compute the average using the result.
<img width="1355" height="884" alt="Снимок экрана 2026-03-21 184450" src="https://github.com/user-attachments/assets/7ffc54d8-d25e-46e1-85ba-11a4ed7d4fe1" />
I found sum of those numbers using array and then divided them by the number of digits.

Task 3. Prime Number Check
Write a recursive function that checks whether a number n is
prime. A prime number is a number that is divisible only by 1 and
itself.
<img width="1215" height="850" alt="Снимок экрана 2026-03-21 185523" src="https://github.com/user-attachments/assets/ffa2db42-010a-4feb-8389-1564bdd49eee" />
I divide this number by every number between it and 1. If there is any remainder equal to 0 in the process of division, this number is not prime. Otherwise it's a prime number.

Task 4. Factorial
Write a recursive function that calculates n! (factorial).
<img width="1078" height="602" alt="Снимок экрана 2026-03-21 190151" src="https://github.com/user-attachments/assets/5b5ee682-adbc-4da9-8b55-bb36420c913c" />
Just find factorial, it's easy.

Task 5. Fibonacci Number
Write a recursive function to find the n-th Fibonacci number. 
<img width="1180" height="617" alt="Снимок экрана 2026-03-21 191453" src="https://github.com/user-attachments/assets/d61359ef-5ce0-4ad8-857a-33fbd3617434" />
Keep finding sum of fibonacci(n-1) and fibobacci(n-2), whereas fib(0) and fib(1) are equal to 0 and 1 respectively.

Task 6. Power Function
You are given numbers a and n. Write a recursive function that
returns: a^n
<img width="1179" height="604" alt="Снимок экрана 2026-03-21 191924" src="https://github.com/user-attachments/assets/d55f8fdd-525b-4bc5-9ba1-7cc053218509" />
It's easy too.

Task 7. Reverse Output
You are given n numbers. Write a recursive function that reads
and prints the numbers in reverse order without using another
array.
<img width="1252" height="672" alt="Снимок экрана 2026-03-21 192712" src="https://github.com/user-attachments/assets/e591650f-781f-49d7-9c89-352cb7bfcdaa" />
Digit outputing placed after the call of method "rev" so in the end those outputs will activate from the end to the start.

Task 8. Check Digits in String
You are given a string s. Write a recursive function that
checks whether the string contains only digits. Return "Yes" if
all characters are digits, otherwise return "No".
<img width="1100" height="741" alt="Снимок экрана 2026-03-21 193456" src="https://github.com/user-attachments/assets/83300976-035d-4a61-a216-e79f19160a51" />
It checks every char, and when i is equal to lenght of string.

Task 9. Count Characters in a String
Write a recursive function that counts the number of characters in a
given string. The function should return the total number of characters
in the string..
<img width="971" height="537" alt="Снимок экрана 2026-03-21 194351" src="https://github.com/user-attachments/assets/b25d4400-035d-438a-b159-03dd1c78204c" />
It counts chars until the end of the string.

Task 10. Greatest Common Divisor (GCD)
Write a recursive function that finds the GCD of two numbers
using the Euclidean Algorithm.
<img width="853" height="563" alt="Снимок экрана 2026-03-21 203159" src="https://github.com/user-attachments/assets/02192e7c-83b6-4448-a817-0d3ac06a56af" />

We find the GCD by repeating (replace the numbers with (b, a % b)), keep doing this until the second number becomes 0, then the first number is the answer.
