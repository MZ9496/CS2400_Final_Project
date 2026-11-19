# 4. Student Grade Checker

**Difficulty:** Easy

**Primary focus:** hash maps, aggregation, sorting, file I/O, validation

## Project description

Develop a grade-management application that stores synthetic student records and computes course results. A record may include a student ID, name, assignment scores, exam scores, and optional category weights. The application should support lookup, updates, reports, and transparent grade calculations without exposing real student information.

## Learning outcomes

- Store and retrieve records with a key-value data structure.
- Implement weighted averages and aggregate statistics correctly.
- Sort records by ID, name, total score, or letter grade using a documented algorithm.
- Validate score ranges, missing scores, duplicate IDs, and invalid weights.
- Practice file persistence and report generation with synthetic data.

## Minimum requirements

1. Add, update, view, and remove a student record by unique ID.
2. Record at least three assessment categories and calculate a weighted total.
3. Convert totals to letter grades using a documented grading scale.
4. Display a single-student report and a class summary containing average, minimum, maximum, and count.
5. Search by exact ID and by name keyword or prefix.
6. Sort a report by at least two criteria, including total score.
7. Save and load the gradebook using a documented file format.
8. Reject scores outside the permitted range and weights that do not satisfy the grading policy.

## Required data structures and algorithms

- Use a map keyed by student ID for primary record lookup.
- Use a list or array of records for report sorting and aggregation.
- Implement a sorting algorithm for at least one report rather than relying solely on a library sort.
- Implement the weighted-total algorithm and document its handling of missing assessments.

## Detailed implementation instructions

1. Write the grading policy before coding. State score range, category weights, rounding point, letter cutoffs, and treatment of missing work.
2. Keep the student ID stable. An update must not accidentally create a second record or leave a stale entry in another index.
3. Represent assessment scores so the program can report which category is missing. Do not use a magic sentinel that could be confused with a valid zero score.
4. Make class-summary calculations independent of the CLI. This makes the average and extrema easy to test.
5. Sort copies or report views so that generating a report does not corrupt the gradebook’s primary storage order.
6. Use only synthetic names/IDs in `data/`. Add tests for empty gradebooks, one student, duplicate IDs, missing assessments, invalid scores, weight totals, ties, and save/load round trips.
7. Analyze map lookup, record update, report sorting, class aggregation, search, save, and load. Define `n` as students and `a` as assessment categories.

## Acceptance examples

- A student with known category scores receives the documented weighted total and letter grade.
- A score of `-1` or a score above the maximum is rejected without changing the record.
- The class average is correct for an empty class, one student, and multiple students.
- Updating a student changes reports and lookup results exactly once.

## Stretch goals

Late penalties, dropped lowest score, CSV import validation, percentile reports, a tree-based sorted index, or role-based views using synthetic instructor/student accounts.
