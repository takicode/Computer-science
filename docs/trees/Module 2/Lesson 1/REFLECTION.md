## Tree 1
       A
      / \
      B   C
     / \ 
    D   E

Node	Children
A	2 ✅
B	2 ✅
C	0 ✅
D	0 ✅
E	0 ✅

Nobody has exactly one child.

✔ Full.

Now let's check the other properties.

Is it Perfect?

Definition:

Every internal node has 2 children ✅
Every leaf is on the same level ❌

Leaves:

C

is here:

Level 1

while

D E

are here:

Level 2

Different levels.

❌ Not perfect.

Is it Complete? Let's draw it by levels.

Level 0
A

Level 1
B     C

Level 2
D   E

Notice something.

The last level is filled from left to right.

There are no gaps.

✅ It is complete.

Is it Balanced?

Left subtree:

Height = 2

Right subtree:

Height = 1

Difference = 1

✅ Balanced.

So Tree 1 is:

Property	Answer
Full	✅
Perfect	❌
Complete	✅
Balanced	✅



🌳 Tree 2
        A
      /
     B
   /
  C

You answered:

Degenerate

✅ Correct.

Now let's check everything.

Full?

A has one child.

❌ Not full.

Perfect?

No.

Leaves are not on same level.

Internal nodes don't all have 2 children.

❌ Perfect

Complete?

This one surprises many people.

Think level by level.

At level 1, A is missing its right child, but there are still nodes below (C). That violates the completeness rule.

❌ Complete
 
Balanced?

Left height = 2

Right height = 0

Difference = 2

❌ Not balanced.

So:

Property	    Answer
Full	        ❌
Perfect     	❌
Complete    	✅
Balanced    	❌
Skewed      	✅


Tree 3
     A
   /   \
  B     C
 / \    / \
D  E    F  G

You answered:

Perfect

✅ Correct.

Now ask the other questions.

Full?

Every node has:

0 children
or 2 children

✅ Yes.

Complete?

Every level is completely filled.

A perfect tree is always complete.

✅ Yes.

Balanced?

Perfect trees are balanced.

✅ Yes.

Final table:

Property	Answer
Full	    ✅
Perfect 	✅
Complete	✅
Balanced	✅


## Engineering Lesson

Here's the key insight:

These types are not mutually exclusive.

Think of them like properties of a person.

Someone can be:

Nigerian,African,A software engineer at the same time.

Similarly, a tree can be:

Full, complete, balanced all at once.



