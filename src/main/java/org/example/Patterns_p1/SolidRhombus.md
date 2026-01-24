
# 🔷 SOLID RHOMBUS PATTERN (Java)

---

## ✅ 2-Line Definition

A parallelogram-shaped pattern made entirely of stars where **each row has fixed stars (n)** and **leading spaces decrease**.

It looks like a **tilted square**.

---

## ✅ Intuition (brain picture)

Imagine a square:

```
****
****
****
****
```
Now just **push each row right**:

```
   ****
  ****
 ****
****
```

Bas.
Square ko slant kar diya = Rhombus 😂

---

# ✅ Structure Rule (MOST IMPORTANT)

Let n = 4

For each row i:

```
spaces = n - i
stars  = n
```

👉 Stars constant
👉 Only spaces change

This is the whole game.

---

# ✅ Visual Breakdown

For n = 4

| Row (i) | Spaces | Stars |
| ------- | ------ | ----- |
| 1       | 3      | 4     |
| 2       | 2      | 4     |
| 3       | 1      | 4     |
| 4       | 0      | 4     |

---

# ✅ Dry Run Visualization

```
i=1 →    ****
i=2 →   ****
i=3 →  ****
i=4 → ****
```

---

# ✅ Loop Thinking (interview mindset)

Ask:

1. Rows? → n
2. What changes? → spaces
3. What constant? → stars

So:

```
outer → rows
inner1 → spaces
inner2 → stars
```

Simple life.

---

# ✅ Java Code Template (clean & reusable)

```java
public class SolidRhombus {

    public static void main(String[] args) {

        int n = 4;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= n; j++) {
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

Nested loops again.

---

# ✅ Memory Trick (super fast recall)

Just remember:

```
(n-i) spaces
n stars
```

Nothing else.

If you forget this → bhai focus kidhar tha 😭

---

# ✅ Common Mistakes

❌ writing stars = i (wrong, that’s triangle)
❌ using println inside star loop
❌ forgetting space loop
❌ mixing order (stars before spaces)

Correct order always:

```
spaces → stars
```

---

# ✅ Variations (practice these 🔥)

Very important for loop mastery:

1️⃣ Hollow rhombus
2️⃣ Number rhombus
3️⃣ Character rhombus
4️⃣ Double rhombus
5️⃣ Rotated rhombus
6️⃣ Print using recursion

---

# ✅ Why this matters in DSA

Solid rhombus builds:

✔ row-column thinking
✔ constant vs variable loops
✔ space math
✔ nested loops mastery

Helps later in:

👉 matrix problems
👉 2D arrays
👉 sliding window grids
👉 DP tables
👉 pattern-based questions

