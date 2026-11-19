# 5. Plagiarism Detection System

**Difficulty:** Medium

**Primary focus:** text normalization, hashing, n-grams, string matching, similarity analysis

## Project description

Build an educational document-comparison tool that estimates similarity between text documents. The system should normalize text, create comparable units such as word shingles, compute a similarity score, and identify matching passages or suspicious overlaps. It must clearly state that a similarity score is not a final plagiarism judgment.

## Learning outcomes

- Preprocess text consistently and explain the effect of normalization choices.
- Use hashing to represent n-grams or shingles efficiently.
- Implement a string-matching or similarity algorithm and compare its trade-offs with an alternative.
- Process multiple documents without confusing a high-frequency common phrase with meaningful overlap.
- Report limitations, false positives, false negatives, and responsible use.

## Minimum requirements

1. Read at least two text documents from local files or an in-memory fixture set.
2. Normalize case and punctuation with documented rules; optionally remove stop words, but measure or discuss the effect.
3. Generate fixed-size word or character n-grams.
4. Use a set/map of hashes or another documented index to find shared shingles.
5. Report a similarity score and the top matching spans, shingles, or line ranges.
6. Compare at least three document pairs: identical, unrelated, and partially overlapping.
7. Include a warning that the tool provides evidence for review, not a definitive academic or legal conclusion.

## Required data structures and algorithms

- Use a set or map to index normalized shingles and count overlap.
- Implement one similarity measure such as Jaccard similarity, cosine similarity over term frequencies, or a documented n-gram score.
- Implement a matching method for showing overlap, such as a rolling hash, KMP, or a direct window comparison with a justified complexity analysis.
- Keep document IDs and source labels separate from text content so reports can name the compared files safely.

## Detailed implementation instructions

1. Define the unit of comparison: words, characters, lines, or tokens. Explain why that unit fits the educational goal.
2. Choose `k`, the n-gram length, and make it configurable. Test small documents where fewer than `k` tokens are available.
3. Normalize Unicode, whitespace, punctuation, and case consistently. Preserve an offset map if the report needs to highlight original passages.
4. Hash shingles using a deterministic method. If collisions are possible, explain how the implementation reduces false matches, for example by verifying the original shingles after a hash match.
5. Set and document a threshold only as a reporting aid. Do not call a document “plagiarized” solely because it exceeds the threshold.
6. Use synthetic documents authored for testing. Do not upload real student work or private documents.
7. Test identical text, reordered paragraphs, paraphrased text, common boilerplate, empty text, punctuation differences, and hash-collision safeguards.
8. Analyze preprocessing, index construction, pair comparison, memory usage, and report generation. Define `T` as total tokens and `k` as n-gram size.

## Acceptance examples

- A document compared with itself scores the maximum similarity under the chosen metric.
- Two unrelated synthetic documents score lower than a pair sharing a deliberately copied paragraph.
- Changing punctuation does not create a false difference when normalization says punctuation is ignored.
- The report includes matched evidence and the method’s limitations.

## Stretch goals

MinHash signatures, locality-sensitive hashing for many documents, a suffix array, a trie-based phrase index, or a benchmark comparing all-pairs comparison with an indexed candidate search.
