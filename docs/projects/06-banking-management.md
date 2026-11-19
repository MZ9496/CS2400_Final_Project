# 6. Banking Management System

**Difficulty:** Medium

**Primary focus:** records, maps, transaction queues, validation, consistency

## Project description

Create a safe, offline banking simulation. The application should model account creation, balance inquiry, deposits, withdrawals, and transfers between synthetic accounts. It must maintain transaction history and reject invalid operations. This is a data-structure exercise, not a real banking or payment system.

## Learning outcomes

- Combine maps, lists, queues, and immutable transaction records in one application.
- Maintain invariants such as nonnegative balances and balanced transfers.
- Design validation and failure handling for multi-step operations.
- Use sorting/searching to produce account and transaction reports.
- Discuss consistency, privacy, and why an educational simulation is not production financial software.

## Minimum requirements

1. Create an account with a unique synthetic account ID and owner label.
2. Deposit funds, withdraw funds, and transfer funds between two accounts.
3. Reject negative amounts, missing accounts, insufficient funds, self-transfers, and duplicate IDs.
4. Record every accepted transaction with an ID, timestamp or sequence number, type, amount, and participating accounts.
5. Display a balance and transaction history for an account.
6. Generate a report sorted by balance or transaction volume.
7. Save and load synthetic account and transaction data.
8. Process a batch of transactions through a queue and report successes and failures without losing order.

## Required data structures and algorithms

- Use a map keyed by account ID for account lookup.
- Use a queue for pending batch transactions or a transaction-processing pipeline.
- Use a list for an account’s history and an implemented sorting algorithm for at least one report.
- Define and enforce invariants: accepted transfers debit and credit the same amount, and an account cannot spend beyond its permitted balance.

## Detailed implementation instructions

1. Use `BigDecimal` for currency-like values or document a fixed-point integer policy. Never use binary floating-point silently for money calculations.
2. Separate command validation, account mutation, transaction recording, and persistence. A rejected transaction must not partially change an account.
3. Give every transaction a deterministic sequence number so tests do not depend on the system clock.
4. For transfers, validate both accounts and the amount before applying either balance change. Record one atomic transfer event or a clearly linked debit/credit pair.
5. Implement batch processing with a queue. The result should identify each input transaction, outcome, and error reason.
6. Use only synthetic accounts and amounts. Do not connect to a bank, payment provider, or real identity system.
7. Test deposits, exact-balance withdrawals, insufficient funds, transfers, duplicate IDs, malformed files, batch order, and save/load behavior.
8. Analyze account lookup, single transactions, batch processing, history retrieval, report sorting, and persistence. Define `a` as accounts, `t` as transactions, and `h` as history size.

## Acceptance examples

- A transfer of 25.00 from an account with 100.00 leaves 75.00 and credits the recipient 25.00.
- A failed transfer leaves both balances and the transaction history unchanged.
- Batch results preserve input order even if some transactions fail.
- Loading a saved simulation reproduces balances and transaction histories.

## Stretch goals

Undo using a stack of compensating events, scheduled payments, transaction rollback, account statements, role-separated views, or a benchmark comparing map lookup with list scanning.
