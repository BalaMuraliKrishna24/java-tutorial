public class OperatorPrecedance {
    static double val1=20;
    static double val2 = 80;
    static double val3 = (val1+val2)*100;
    public static void main(String[] args) {
        boolean check = val3%40==0?true:false;
        if(check){
            System.out.println("got no reminder");
        }
    } 
}

/*
Java Operator Precedence Table
https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

Precedence	Operator	Type	Associativity
15	()
[]
·	Parentheses
Array subscript
Member selection
Left to Right
14	++
--	Unary post-increment
Unary post-decrement	Left to Right
13	++
--
+
-
!
~
( type )	Unary pre-increment
Unary pre-decrement
Unary plus
Unary minus
Unary logical negation
Unary bitwise complement
Unary type cast	Right to left
12	*
/
%	Multiplication
Division
Modulus	Left to right
11	+
-	Addition
Subtraction	Left to right
10	<<
>>
>>>	Bitwise left shift
Bitwise right shift with sign extension
Bitwise right shift with zero extension	Left to right
9	<
<=
>
>=
instanceof	Relational less than
Relational less than or equal
Relational greater than
Relational greater than or equal
Type comparison (objects only)	Left to right
8	==
!=	Relational is equal to
Relational is not equal to	Left to right
7	&	Bitwise AND	Left to right
6	^	Bitwise exclusive OR	Left to right
5	|	Bitwise inclusive OR	Left to right
4	&&	Logical AND
Left to right
3	||	Logical OR	Left to right
2	? :	Ternary conditional	Right to left
1	=
+=
-=
*=
/=
%=	Assignment
Addition assignment
Subtraction assignment
Multiplication assignment
Division assignment
Modulus assignment	Right to left
Larger number means higher precedence.
*/
