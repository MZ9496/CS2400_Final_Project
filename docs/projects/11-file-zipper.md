# 11. File Zipper

**Difficulty:** Medium

**Primary focus:** Huffman coding, binary trees, priority queues, bit/byte I/O

## Project description

Implement a small file-compression tool that can compress and decompress a file using an algorithm such as Huffman coding or run-length encoding. The decompressed output must match the original byte-for-byte. The application should report input size, compressed size, and whether the selected method helps for the given data.

## Learning outcomes

- Build a frequency table from bytes rather than characters alone.
- Use a priority queue to construct a binary Huffman tree.
- Generate prefix-free codes and serialize enough metadata to decode the file.
- Handle bit-level I/O, headers, empty input, and corrupted files.
- Compare compression ratio and runtime across different file contents.

## Minimum requirements

1. Compress one arbitrary local file into a documented custom format.
2. Decompress the custom format without relying on Java’s ZIP/GZIP implementation for the core algorithm.
3. Verify byte-for-byte equality between the original and decompressed files.
4. Handle empty files, one-symbol files, binary files, incompressible data, and corrupted/truncated archives.
5. Display input bytes, output bytes, compression ratio, and a success/failure message.
6. Include at least one implemented coding algorithm: Huffman coding is recommended; RLE is acceptable with instructor approval.
7. Include tests that compress/decompress synthetic text and random bytes.

## Required data structures and algorithms

- Use a frequency map or array for byte frequencies.
- Use a min-priority queue to construct the Huffman tree.
- Use a binary tree to map symbols to prefix codes and decode the bit stream.
- Implement a bit writer/reader or equivalent buffering layer and document padding behavior.

## Detailed implementation instructions

1. Read bytes, not Unicode characters, unless you explicitly restrict and justify the input domain.
2. Define a file header containing a magic value, version, original length, and enough tree/frequency metadata to decode. Reject an unknown magic value or version.
3. Handle the one-symbol case explicitly; a tree with one leaf still needs a decodable code.
4. Ensure codes are prefix-free. Build a code table for encoding and walk the tree for decoding.
5. Define how the final partial byte is padded and how the decoder knows when to stop. Original byte length is one reliable option.
6. Write decompressed output to a new path by default. Do not silently overwrite the source.
7. Add corruption tests by changing header bytes, truncating the stream, and changing padding or tree data.
8. Measure several file types. Explain why a compressed file can be larger than its input for small or high-entropy data.
9. Analyze frequency construction, tree construction, encoding, decoding, and auxiliary memory. Define `n` as input bytes and `σ` as the symbol alphabet size.

## Acceptance examples

- Compressing and decompressing an empty file succeeds with an empty output.
- A file containing all 256 byte values round-trips exactly.
- A truncated archive fails with a controlled error rather than producing silently corrupted output.
- The report distinguishes compression ratio from absolute file size.

## Stretch goals

Multi-file archiving, directory extraction, canonical Huffman codes, streaming compression, RLE/Huffman comparison, or a visual tree/code-table report.
