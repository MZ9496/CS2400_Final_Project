# 9. Crossword Puzzle Game

**Difficulty:** Medium

**Primary focus:** 2D arrays, tries, backtracking, constraint satisfaction, stacks

## Project description

Create a crossword puzzle generator and player. Given a word/clue list and a grid size, the application should place words so that intersecting letters agree, display the puzzle, accept guesses, and report completion. A baseline may use a curated fixture of words and clues; the generator does not need to reproduce newspaper-quality puzzles.

## Learning outcomes

- Model a grid and candidate placements as a constraint problem.
- Use a trie or prefix index to check candidate words efficiently.
- Implement recursive backtracking with undo behavior.
- Design heuristics such as most-constrained slot first or longest-word first.
- Validate user input and separate puzzle state from the answer key.

## Minimum requirements

1. Represent a rectangular grid and a word bank with clues.
2. Generate or load a puzzle containing at least five placed words with valid intersections.
3. Ensure crossing letters agree and words stay inside the grid.
4. Use backtracking to search for a placement when a greedy placement leads to a dead end.
5. Allow a player to enter guesses, reveal a clue or word according to a documented rule, and detect completion.
6. Provide a deterministic seed or fixture so tests and demonstrations are reproducible.
7. Reject duplicate words, invalid coordinates, incompatible crossings, and guesses that do not match the puzzle format.
8. Include tests for a solvable fixture, an unsatisfiable fixture, crossing conflicts, boundary placement, and completion.

## Required data structures and algorithms

- Use a 2D array or matrix for the grid.
- Use a trie, set, or indexed word structure for candidate lookup; a trie is recommended for prefix pruning.
- Implement recursive backtracking that places a word, recurses, and undoes the placement on failure.
- Use a stack or immutable snapshots for undo if the player interface supports undo.

## Detailed implementation instructions

1. Define a placement as word, row, column, and direction. Write a function that returns all legal placements for a word.
2. Check bounds, existing letters, adjacency rules, and at least one crossing when your puzzle rules require it.
3. Select the next slot with a documented heuristic. The “most constrained” choice usually reduces unnecessary search.
4. Record exactly which cells were changed by a placement so undo does not erase letters belonging to another word.
5. Keep the answer grid separate from the player grid. Do not reveal answers through debugging output in the normal mode.
6. Use a deterministic random seed when randomizing word order or candidate order.
7. Test a one-word puzzle, multiple crossings, no-solution input, duplicate word list, non-ASCII or unsupported characters, and a full solve.
8. Analyze candidate generation and worst-case backtracking. Define `R×C` as grid size, `W` as word count, and `L` as maximum word length.

## Acceptance examples

- Every crossing contains the same letter in both words.
- A failed placement restores the exact previous grid state.
- An unsatisfiable word bank returns “no solution” rather than an incomplete puzzle labeled valid.
- The player can fill the puzzle and receive a completion result only when all required cells are correct.

## Stretch goals

Multiple difficulty levels, clue validation, hint penalties, save/resume, undo/redo, puzzle scoring, or an interactive visualization of the backtracking search.
