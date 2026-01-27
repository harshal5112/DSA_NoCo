# 💎 Diamond Pattern

## Output (n = 4)

```
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
```

---

# ✅ Clean Professional Java Code

```java
package org.example.Patterns_p1;

import java.util.Scanner;

public class DiamondPattern {

    public static void printDiamond(int n) {

        // 🔺 Upper Half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 🔻 Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printDiamond(n);

        sc.close();
    }
}
```

---

# 📝 DSA Notes (Fast Revision Style)

Paste in README 👇

---

## ⭐ Diamond Pattern

### Core Idea

👉 **Pyramid + Reverse Pyramid**

Diamond = Upper triangle + Lower triangle

---

## Row Logic

| Part   | Formula       |
| ------ | ------------- |
| Spaces | `n - row`     |
| Stars  | `2 × row - 1` |

---

## Thinking Flow

Upper half:

```
stars ↑
spaces ↓
```

Lower half:

```
stars ↓
spaces ↑
```

---

## Memory Trick 🧠

```
Stars = odd numbers → 1,3,5,7...
```

OR

```
2*i - 1
```

Remember this → diamond solved instantly.

---

## Complexity

Time → O(n²)
Space → O(1)

---

## Why Important (real DSA benefit)

Teaches:

* Symmetry problems
* Mirror logic
* Two-phase loops
* 2D matrix visualization
* DP shape thinking

Used in:

* Pascal triangle
* Matrix problems
* Graphics/grid problems

