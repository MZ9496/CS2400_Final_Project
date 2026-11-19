# 10. Library Management System

**Difficulty:** Medium

**Primary focus:** CRUD, maps, trees, queues, search, sorting, persistence

## Project description

Develop a library circulation system that manages a catalog of books, members, checkouts, returns, reservations, and fines. The system should support librarian-style catalog operations and member-style search while keeping inventory and loan records consistent. Use synthetic books and members only.

## Learning outcomes

- Design multiple related record types and maintain relationships between them.
- Use maps or trees for catalog lookup and queues for reservation waitlists.
- Implement CRUD, checkout/return rules, due-date calculation, and fine calculation.
- Generate sorted and aggregated reports from persistent records.
- Test state transitions and invariants across several operations.

## Minimum requirements

1. Add, update, remove, and search books by ID, title, author, or another documented key.
2. Add and remove synthetic members and prevent duplicate member IDs.
3. Check out an available book to an eligible member and record a due date.
4. Return a book, calculate a documented overdue fine, and update availability.
5. Maintain a FIFO reservation queue for a checked-out book and notify or assign the next member when it returns.
6. Generate at least two reports, such as overdue loans and books by author/category.
7. Save and load the catalog, members, loans, and reservations.
8. Reject invalid transitions: unknown book/member, duplicate checkout, return by the wrong state, and duplicate reservation.

## Required data structures and algorithms

- Use a map or tree for primary book and member lookup.
- Use a queue for each title’s reservation waitlist.
- Use a list or map for active loans and an implemented sort for at least one report.
- Define invariants for book availability, active loans, and reservation membership.

## Detailed implementation instructions

1. Give books and members stable IDs. Separate a bibliographic record from a physical copy if your scope includes multiple copies.
2. Define policy constants: loan duration, maximum active loans, fine rate, grace period, and whether a member may reserve an available book.
3. Apply a checkout only after validating all rules. A failed operation must leave every related record unchanged.
4. When a return makes a book available, process the reservation queue according to the documented policy. Avoid duplicate queue entries.
5. Use `LocalDate` and inject a clock or pass a date into methods so due-date and fine tests are deterministic.
6. Store dates and IDs in the persistence format; do not rely on object memory addresses.
7. Test catalog search, checkout, return, fine boundaries, reservation order, member limits, missing records, and persistence round trips.
8. Analyze lookup, checkout/return, reservation enqueue/dequeue, report sorting, and persistence. Define `b`, `m`, `l`, and `r` for books, members, loans, and reservations.

## Acceptance examples

- A checked-out book cannot be checked out a second time.
- Two reservations are served in the order they were added.
- A return on the due date has no overdue fine under the documented policy.
- A failed checkout does not remove the book from the catalog or create a loan.

## Stretch goals

Multiple copies, ISBN search, trie autocomplete, hold expiration, role-based permissions, usage analytics, or a balanced tree benchmark against hash-based lookup.
