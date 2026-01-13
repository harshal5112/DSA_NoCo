
# ⭐ STAR PATTERN – RIGHT TRIANGLE (DSA NOTES)

---

## 🔹 What is Star Pattern?

**Star Pattern problems are basic loop-based problems used to understand nested loops, control flow, and pattern logic in DSA.**
They build thinking for matrix, DP table, pyramid, and recursion problems.

---

## 🔹 Pattern Generated

For `n = 4`

```
*
* *
* * *
* * * *
```

---

## 🔹 Logic Used

| Loop                | Purpose                                      |
| ------------------- | -------------------------------------------- |
| Outer Loop (`i`)    | Controls number of rows                      |
| Inner Loop (`star`) | Controls number of stars printed in each row |
| `println()`         | Moves cursor to next row                     |

---

## 🔹 Algorithm

1. Take number of rows `n`.
2. Run outer loop from `1 → n`.
3. For each row `i`, print `i` stars using inner loop.
4. After inner loop, move to next line.

---

## 🔹 Code Explanation

```java
for (int i = 1; i <= n; i++) 
```

→ Runs for number of rows.

```java
for (int star = 1; star <= i; star++)
```

→ Prints stars equal to row number.

```java
System.out.print("* ");
```

→ Prints stars in same row.

```java
System.out.println();
```

→ Moves to next row.

---

## 🔹 Time & Space Complexity

| Type             | Value |
| ---------------- | ----- |
| Time Complexity  | O(n²) |
| Space Complexity | O(1)  |

---

## 🔹 Real-World Learning Benefit

* Builds foundation for:

    * Matrix traversal
    * DP table filling
    * Nested loop logic
    * Pyramid / Diamond / Hollow patterns

---

## 🔹 Variation Patterns

| Pattern Type      |
| ----------------- |
| Inverted Triangle |
| Full Pyramid      |
| Hollow Triangle   |
| Number Patterns   |
| Alphabet Patterns |

---

