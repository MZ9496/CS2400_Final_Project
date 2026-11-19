# 8. Cash-Flow Minimizer

**Difficulty:** Medium

**Primary focus:** net balances, graphs, heaps, greedy settlement, optimization

## Project description

Build an expense-sharing tool that receives debts among people and produces a smaller settlement schedule. First compute each person’s net balance. Then match people who are owed money with people who owe money, using priority queues or another documented strategy. The tool should show the original obligations, the proposed payments, the number of transactions, and the limitations of the optimization method.

## Learning outcomes

- Transform a directed debt graph into net debtor/creditor balances.
- Use max-heaps or priority queues to choose settlement candidates efficiently.
- Implement a greedy algorithm and explain when it is or is not guaranteed to be optimal.
- Validate amounts, participant IDs, cycles, and conservation of total balance.
- Compare transaction count and total transfer amount before and after settlement.

## Minimum requirements

1. Accept synthetic obligations such as “A owes B 30.00.”
2. Compute a net balance for every participant and verify that all net balances sum to zero within the chosen numeric policy.
3. Produce a valid set of settlement payments that clears every net balance.
4. Use a priority queue, heap, or an equally justified structure to select debtors and creditors.
5. Report the number of original obligations and proposed settlement transactions.
6. Reject negative amounts, unknown participants, malformed records, and non-finite numeric input.
7. Test cycles, one debtor/multiple creditors, multiple debtors/one creditor, exact matches, zero net balances, and duplicate obligations.
8. State whether the algorithm is heuristic or optimal for the supported model. Do not claim global optimality without a proof or a clearly bounded search.

## Required data structures and algorithms

- Use a map from participant ID to net balance.
- Use max-heaps or priority queues for positive and negative balances, with deterministic tie-breaking.
- Implement the settlement loop and prove or test that it preserves the sum of balances.
- Represent the original obligations as a directed graph or edge list so the report can compare before/after structure.

## Detailed implementation instructions

1. Choose a sign convention and document it. For example, positive means the participant should receive money and negative means the participant must pay.
2. Aggregate obligations before settlement. If A owes B twice, either combine them or preserve both with an explicit reason.
3. At each step, match one debtor and one creditor for the smaller remaining amount. Emit a payment and reduce the remaining balances.
4. Never emit a payment with a zero or negative amount. Remove an entry from a heap only when its remaining balance is cleared.
5. Add a validator that replays the settlement schedule and checks that every participant ends with net zero.
6. Use synthetic expense data. Do not connect the project to payment services or handle real financial information.
7. Analyze net-balance construction, heap operations, settlement steps, and replay validation. Define `P` as participants and `D` as original debt edges.

## Acceptance examples

- The settlement schedule clears all net balances when replayed.
- A debt cycle such as A→B, B→C, C→A can reduce to no payment if the net balances are all zero.
- When a debtor owes less than a creditor is due, the debtor is cleared and the creditor remains in the queue with the remainder.
- The report distinguishes fewer transactions from lower total money moved; the total settled amount depends on the chosen netting model.

## Stretch goals

Compare greedy variants, solve a small exact minimum-transaction instance with backtracking or dynamic programming, include due dates or penalties, or visualize the original and settled graphs.
