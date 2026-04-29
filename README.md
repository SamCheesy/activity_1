# Assignment 1 – Failure Function (KMP)

## Environment

| Component | Version |
|---|---|
| Operating System | Fedora 43 |
| Programming Language | Java |
| JDK | OpenJDK 21 |
| IDE (optional) | IntelliJ IDEA / any text editor |

---

## How to Run

### 1. Compile the program

Open a terminal in the directory containing `Main.java` and run:

```bash
javac Main.java
```

### 2. Execute the program

```bash
java Main
```

### 3. Select an exercise

The program will prompt you to enter a number corresponding to the exercise you want to run:

- `1` → Computes the failure function for the string `ababababaab`  (`a b a b a b a a b`)
- `2` → Computes the failure function for the string `aaaaaa` (`a a a a a a`)
- `3` → Computes the failure function for the string `abbaaabb` (`a b b a a b b`)

The program prints the resulting failure function array, one value per line.

> To view a different exercise, re-run the program and choose a different option.

---

## Algorithm Explanation

### What is the Failure Function?

The **failure function** (also called the *prefix function*) is a core component of the Knuth-Morris-Pratt (KMP) string-matching algorithm. Given a pattern string `p` of length `m`, the failure function `f` is defined as:

> `f(j)` = the length of the longest proper prefix of the substring `p[0..j]` that is also a suffix of that same substring.

In other words, for each position `j` in the pattern, `f(j)` tells us how much of the pattern we have already matched and can reuse, in case of a mismatch during searching.

### What is it used for?

The failure function is used during the **lexical analysis** phase of a compiler — specifically for **token recognition**. When a compiler scans source code, it needs to match patterns (like keywords, identifiers, or operators) against the input text. The failure function allows this matching to proceed efficiently by avoiding redundant character comparisons.

### How the Algorithm Works (Figure 3.19 – Aho et al.)

1. Initialize `f(0) = 0` and `t = 0`.
2. For each position `i` from `1` to `m-1`:
   - While `t > 0` and `p[i] ≠ p[t]`, set `t = f(t-1)` (fall back using previously computed values).
   - If `p[i] == p[t]`, increment `t` and set `f(i) = t`.
   - Otherwise, set `f(i) = 0`.

This runs in **O(m)** time, where `m` is the length of the pattern.

### Example

For the pattern `a b a b a b a a b`:

| Index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|-------|---|---|---|---|---|---|---|---|---|
| Char  | a | b | a | b | a | b | a | a | b |
| f(i)  | 0 | 0 | 1 | 2 | 3 | 4 | 5 | 1 | 2 |

---

## References

Aho, Alfred V., et al. *Compilers: Principles, Techniques, & Tools*. 2nd ed. Pearson/Addison Wesley, 2007. Section 3.4.5, Figure 3.19, p. 137.
