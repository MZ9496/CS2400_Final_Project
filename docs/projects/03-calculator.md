# 3. Expression Calculator

**Difficulty:** Easy

**Primary focus:** stacks, tokenization, parsing, precedence, error handling

## Project description

Build a calculator that accepts arithmetic expressions rather than only two numbers. The baseline should support integers or decimal values, parentheses, addition, subtraction, multiplication, and division. The application should explain invalid expressions clearly and must never silently return an incorrect result for malformed input or division by zero.

## Learning outcomes

- Tokenize user input into numbers, operators, and parentheses.
- Use stacks to convert infix expressions to postfix notation or to evaluate expressions directly.
- Encode operator precedence and associativity in a parser rather than scattered conditionals.
- Distinguish syntax errors from arithmetic errors and test both.
- Explain why stack operations make the parser efficient.

## Minimum requirements

1. Read an expression from the CLI and print the result with a documented numeric policy.
2. Support `+`, `-`, `*`, `/`, parentheses, whitespace, unary negative numbers, and decimal values or clearly state a narrower approved scope.
3. Respect precedence and left/right associativity.
4. Detect invalid tokens, missing operands, unbalanced parentheses, consecutive operators, and division by zero.
5. Show either the token list, postfix expression, or a short evaluation trace in a debug mode.
6. Include at least 20 automated tests that cover valid expressions and invalid input.

## Required data structures and algorithms

- Use at least one stack for operators and one stack for values, or use a documented equivalent based on a stack.
- Implement either the shunting-yard conversion followed by postfix evaluation or a recursive-descent parser. If recursive descent is used, explain where the stack appears conceptually and why it is appropriate.
- Do not use Java’s expression evaluator or execute the input as code.

## Detailed implementation instructions

1. Define token types. Preserve the original input so error messages can identify the problem location when practical.
2. Write a precedence table for operators. Decide whether exponentiation is included; if it is, document its associativity and add tests.
3. Separate tokenization, parsing/conversion, evaluation, and formatting. Each layer should be directly testable.
4. Decide how to format results and rounding. For example, use `BigDecimal` with a fixed scale, or use `double` and document the precision limitation.
5. Handle unary minus explicitly. Expressions such as `-3 * 2`, `5 + -2`, and `-(2 + 3)` should either work or be rejected with a documented reason.
6. Test precedence (`2 + 3 * 4`), grouping (`(2 + 3) * 4`), whitespace, decimals, nested parentheses, malformed expressions, and division by zero.
7. In `docs/COMPLEXITY.md`, let `t` be the number of tokens and show why conversion/evaluation is `O(t)` when each token is processed a constant number of times.

## Acceptance examples

- `2 + 3 * 4` evaluates to `14`, not `20`.
- `(2 + 3) * 4` evaluates to `20`.
- `8 / 0` returns a controlled error and does not terminate the program unexpectedly.
- `(2 + 3` reports an unbalanced parenthesis.

## Stretch goals

Variables, functions such as `sqrt`, exponentiation, an expression tree visualization, command history with undo, or a REPL that evaluates multiple expressions.
