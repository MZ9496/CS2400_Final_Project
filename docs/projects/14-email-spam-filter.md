# 14. Email Spam Filter

**Difficulty:** Hard

**Primary focus:** Bloom filters, hashing, tokenization, feature extraction, classification

## Project description

Develop an offline spam-filtering simulator using a labeled synthetic or public-domain email dataset. The filter should preprocess messages, use a Bloom filter or another hashed structure for fast candidate checks, and classify messages using documented rules or a lightweight model such as Naive Bayes. The project must explain false positives and false negatives and must not connect to a real mailbox by default.

## Learning outcomes

- Tokenize and normalize text while preserving a clear data-processing pipeline.
- Implement a Bloom filter and explain its probabilistic guarantees and false-positive behavior.
- Build a simple classifier and evaluate it with a confusion matrix.
- Choose hash functions and parameters using a reproducible experiment.
- Discuss privacy, dataset bias, adversarial messages, and safe deployment boundaries.

## Minimum requirements

1. Load labeled training and test messages from safe local fixtures.
2. Normalize subject/body text with documented tokenization and stop-word or stemming choices.
3. Implement a Bloom filter with configurable bit-array size and number of hash functions.
4. Use the Bloom filter for fast membership or feature screening, and clearly explain that it cannot prove a message is spam.
5. Implement a baseline classifier, such as a rule-based score or multinomial Naive Bayes.
6. Report accuracy plus precision, recall, false-positive count, and false-negative count.
7. Support a whitelist/allow-list or a review state for uncertain messages.
8. Test empty messages, repeated tokens, unseen tokens, known spam, known non-spam, and deliberately misleading examples.

## Required data structures and algorithms

- Use a bit array and multiple deterministic hash functions for the Bloom filter.
- Use maps/sets for token counts, vocabulary, and labels.
- Implement the selected classification calculation rather than calling a hosted model.
- Use a confusion-matrix accumulator to calculate evaluation metrics.

## Detailed implementation instructions

1. Do not commit real email addresses, message content, credentials, or personal data. Replace identifiers with synthetic values.
2. Choose `m` bits and `k` hash functions. Document the expected capacity and the false-positive trade-off.
3. Use independent-looking deterministic hashes or derive multiple positions from a documented double-hashing scheme. Test that the same token maps consistently.
4. For Naive Bayes, use smoothing so an unseen token does not force a zero-probability result. Perform calculations in log space when appropriate.
5. Separate training, validation, and test fixtures. Do not tune thresholds on the final test set without documenting it.
6. Report a confusion matrix and explain whether the application prioritizes precision or recall. A spam filter that marks legitimate mail as spam may be more harmful than one that sends uncertain messages to review.
7. Test the Bloom filter’s false positives explicitly and verify that inserted items are found under the chosen implementation.
8. Analyze tokenization, Bloom insert/query, model training, classification, and memory. Define `M` as total tokens, `D` as documents, and `m/k` as Bloom parameters.

## Acceptance examples

- Every inserted Bloom-filter token is reported present; non-inserted tokens may produce documented false positives but not false negatives under the implementation.
- The classifier produces a label and a review/uncertain result when configured to do so.
- Evaluation metrics are calculated from the test set rather than guessed from a few examples.
- Changing Bloom-filter parameters changes memory or measured false-positive behavior in a documented way.

## Stretch goals

Online learning, sender/domain features, model comparison, threshold tuning, adversarial token tests, or a streaming filter that processes one message at a time.
