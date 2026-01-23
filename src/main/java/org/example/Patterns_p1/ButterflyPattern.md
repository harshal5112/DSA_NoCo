
# 🦋 BUTTERFLY PATTERN (Java)

---

## ✅ 2-Line Definition

A star pattern where stars increase on both sides and spaces decrease in middle (upper half), then reverse happens (lower half), forming a butterfly shape.

Built using **nested loops + symmetry logic**.

---

## ✅ Core Intuition (MOST IMPORTANT)

Imagine:

👉 Left triangle
👉 Some spaces
👉 Right triangle (mirror)

Like:

```
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

So brain rule:

```
Stars ↑   Spaces ↓   Stars ↑
then reverse
```

---

# ✅ Structure Breakdown

Let n = 4

### Upper Half (1 → n)

For each row i:

```
stars = i
spaces = 2*(n-i)
stars = i
```

### Lower Half (n → 1)

Same but reverse.

---

# ✅ Visual Formula

For row i:

```
Left  stars  → i
Middle space → 2*(n-i)
Right stars  → i
```

---

# ✅ Loop Design Thinking (interview mindset)

Instead of randomly coding:

Ask:

1. Rows? → 2*n
2. Columns? → dynamic
3. What changes per row? → stars & spaces

So:

```
outer loop → rows
inner loops → stars + spaces
```

---

# ✅ Java Code Template (Clean & Interview Ready)

```java
public class ButterflyPattern {

    public static void main(String[] args) {

        int n = 4;

        // ===== Upper half =====
        for(int i = 1; i <= n; i++) {

            // left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            // right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ===== Lower half =====
        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

---

# ✅ Time & Space Complexity

| Type  | Value |
| ----- | ----- |
| Time  | O(n²) |
| Space | O(1)  |

Because nested loops.

---

# ✅ Memory Trick (1 sec recall hack)

Just remember:

```
i stars
2*(n-i) spaces
i stars
```

That’s it.
Whole butterfly done.

If you forget → you were daydreaming bro 😂

---

# ✅ Common Mistakes (VERY COMMON)

❌ using println instead of print inside loops
❌ wrong space formula
❌ forgetting lower half
❌ writing 4 loops when 3 enough
❌ off-by-one errors

---

# ✅ Variations (interview may twist)

Practice these:

1️⃣ Hollow butterfly
2️⃣ Number butterfly
3️⃣ Inverted butterfly
4️⃣ Character butterfly
5️⃣ Print using recursion

---

# ✅ Pattern Learning Benefit (why important)

Butterfly teaches:

✔ nested loops
✔ symmetry
✔ row-column thinking
✔ dry run skill
✔ math formula building

Which directly helps in:

👉 matrix problems

👉 DP grids

👉 2D arrays

👉 printing problems

👉 recursion patterns

