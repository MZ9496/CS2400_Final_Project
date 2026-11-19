# 1. To-Do List

**Difficulty:** Easy

**Primary focus:** linked lists or dynamic arrays, sorting, searching, persistence, scheduling

## Project description

Build a command-line task manager that lets a user create, inspect, update, complete, prioritize, search, and delete tasks. Each task should have a stable identifier, title, description or notes, status, priority, and optional due date. The application should remain useful after it is closed by saving and loading a small local data file.

## Learning outcomes

- Model mutable records and select a list structure for dynamic task management.
- Compare linear search with an indexed lookup or sorted search.
- Implement sorting by priority and due date and explain the cost of each operation.
- Validate dates, priorities, duplicate IDs, and missing task titles.
- Separate the task-management core from the CLI and file persistence code.

## Minimum requirements

1. Add a task with a generated or validated unique ID.
2. List all tasks and filter by status, priority, or due-date range.
3. Mark a task complete and allow it to be reopened.
4. Update task fields and delete a task by ID.
5. Search by ID and by a case-insensitive title keyword.
6. Sort a view by priority, due date, or title using an algorithm implemented by the team.
7. Save tasks to a documented text format such as CSV or JSON and load them on startup.
8. Handle empty lists, missing IDs, malformed records, and invalid dates without crashing.

## Required data structures and algorithms

- Use a `List`-style structure as the primary task collection. A custom linked-list implementation is encouraged if linked lists are a current course topic.
- Implement one explicit sorting algorithm such as merge sort or quicksort; do not rely only on `Collections.sort` for the assessed sort.
- Implement a search method and document whether it is linear or uses a secondary index.
- Use a queue, priority queue, or a greedy rule for a “next task” view. Explain the choice.

## Detailed implementation instructions

1. Define a `Task` record/class and an enum for status and priority.
2. Decide whether IDs are generated sequentially or supplied by the user. Preserve IDs when saving and loading.
3. Keep mutation operations in a service or manager class. The CLI should call the manager rather than modify the collection directly.
4. Implement filtering as a new view or result list so that filtering does not silently delete tasks.
5. Make date comparisons deterministic by using `LocalDate` and document how tasks without due dates are ordered.
6. Write persistence code that can recover from a missing file by starting with an empty list. Reject malformed rows with a useful message.
7. Add tests for a new task, duplicate ID, update, completion toggle, delete, keyword search, sorting ties, empty input, and persistence round-trip.
8. In `docs/COMPLEXITY.md`, analyze add, remove, update, search, filter, sort, save, and load.

## Acceptance examples

- Adding three tasks and sorting by priority places urgent tasks first while preserving a documented tie rule.
- Searching for `exam` finds `Midterm exam review` regardless of capitalization.
- Deleting an unknown ID leaves the data unchanged and reports that no task was found.
- Saving and loading produces tasks equivalent to the original set.

## Stretch goals

Recurring tasks, reminders, undo/redo with a stack, dependency relationships, or a benchmark comparing a linked list with an indexed map.
