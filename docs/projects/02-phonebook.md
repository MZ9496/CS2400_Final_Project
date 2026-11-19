# 2. Phonebook

**Difficulty:** Easy

**Primary focus:** arrays/lists, hashing, sorting, searching, persistence

## Project description

Create a phonebook application for storing and finding contact records. A contact may contain a name, one or more phone numbers, an email address, a category, and optional notes. The application must support fast lookup while still offering an alphabetized view and safe update/delete operations.

## Learning outcomes

- Represent records with one-to-many fields such as multiple phone numbers.
- Use a hash table or map for average constant-time lookup by a normalized key.
- Implement and compare a linear search, a sorted search, or a trie-based prefix search.
- Handle duplicate names, duplicate phone numbers, capitalization, punctuation, and missing fields.
- Explain the time and space trade-offs of keeping more than one index.

## Minimum requirements

1. Add a contact with a unique contact ID, name, at least one phone number, and optional email.
2. View one contact, list all contacts, and edit or delete a contact by ID.
3. Search by exact normalized phone number and by name prefix or keyword.
4. Sort a displayed view by name and by phone number using an implemented algorithm.
5. Prevent or explicitly handle duplicate phone numbers and duplicate contact IDs.
6. Save and load contacts from a local file using synthetic data.
7. Validate phone numbers and email strings sufficiently for the project’s documented assumptions.
8. Provide a CLI menu or a clearly documented alternative interface.

## Required data structures and algorithms

- Use a `HashMap` or a custom hash table for at least one exact lookup key.
- Maintain a list or dynamic array for ordered display, or explain an alternative.
- Implement a sorting algorithm such as merge sort or quicksort for the required ordered view.
- Implement a search method for name prefixes. A linear scan is acceptable for the baseline; a trie is a strong extension.

## Detailed implementation instructions

1. Normalize keys consistently. For example, strip non-digits from phone numbers and compare names case-insensitively while preserving the display form.
2. Define what counts as a duplicate. A duplicate phone number may be rejected, or the application may require the user to confirm reassignment; document the rule.
3. Keep the primary collection and hash index consistent after add, edit, and delete. Add an invariant to `docs/DESIGN.md`.
4. Decide how contacts with the same display name are distinguished. Search results must show IDs so the user can choose the intended record.
5. Implement sorting on a copy or view so that a search result does not unexpectedly reorder the underlying storage.
6. Save data in a format that can represent multiple phone numbers. Test a round trip with a contact containing two numbers and no email.
7. Test empty phonebooks, no search matches, duplicate input, prefix matches, capitalization differences, and index consistency after edits.
8. Analyze exact lookup, prefix search, add, edit, delete, sort, save, and load. Define `n` as contacts and `k` as the number of phone numbers or characters examined.

## Acceptance examples

- Looking up `(909) 555-0100` finds the same contact as `9095550100` if that normalization rule is documented.
- Editing a phone number updates both the displayed record and the exact-lookup index.
- Deleting a contact makes it unavailable through every search path.
- Sorting names is case-insensitive and has a deterministic tie rule.

## Stretch goals

Trie-based autocomplete, import/export with duplicate resolution, contact groups, favorites, or a benchmark comparing list scanning with hash lookup.
