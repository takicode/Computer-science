# Binary Search Tree

## Why Was the Binary Search Tree Invented?

Imagine you're building WhatsApp.

One day, your database contains:

10 users

Easy.

Then...

100 users

Still easy.

Then...

10 million users

Now searching becomes expensive.

Suppose usernames are stored like this:

Mike

James

Sarah

John

David

Alice

Grace

Peter

How do you find:

Grace

You start from the beginning.

Mike ❌

James ❌

Sarah ❌

John ❌

David ❌

Alice ❌

Grace ✅

Worst case?

You visit almost everything.

Time complexity:

O(n)
Can We Do Better?

Suppose I tell you:

"Arrange everything in order."

Now we have:

Alice

David

Grace

James

John

Mike

Peter

Sarah

Better.

Now we can use...

What algorithm?

Think

Don't answer immediately.

What searching algorithm works on sorted data?

Exactly.

Binary Search.

Suppose we want:

John

Binary Search says:

Look in the middle.

James

Is John greater?

Yes.

Ignore the left half.

Now search only here.

John

Mike

Peter

Sarah

Middle again.

Peter

Too large.

Ignore everything after Peter.

Only this remains.

John

Mike

Middle.

John

Found.

Instead of checking:

8

items...

We checked:

3

Time complexity:

O(log n)

Beautiful.

The Problem

Binary Search has one huge weakness.

Suppose the list is:

Alice

David

Grace

James

John

Mike

Peter

Sarah

Now insert:

Brian

Where?

Between:

Alice

David

Everything after David shifts.

Arrays don't like insertion.

Insertion becomes:

O(n)

Searching:

O(log n)

Insertion:

O(n)

Not good.

What About a Linked List?

Insertion?

Amazing.

O(1)

Searching?

Terrible.

O(n)
The Dream

Computer scientists asked:

Can we build something that gives us:

    Fast Search + Fast Insert

The answer became...

The Binary Search Tree.

The Big Idea

Instead of storing values like this:

10

20

30

40

50

60

70

Store them like this:

        40
       /  \
      20    60
     / \    / \
    10 30  50 70

Now think.

If I'm searching for:

50

Do I need to visit:

10

20

30

No.

Immediately.

Compare:

50

>

40

Go right.

Now:

50

<

60

Go left.

Now:

50

Found.

Visited:

40

60

50

Only three nodes.

Wait...

Why was I allowed to ignore the left subtree?

This is the heart of BSTs.

Because of one rule.

One beautiful rule.

The BST Property

Every node follows this law.

Everything on the left

<

Current Node

<

Everything on the right

Not just the immediate children.

Everything.

Example:

        40
       /  \
     20    60
    / \    / \
10 30 50 70

For node:

40

Everything here:

10

20

30

is smaller.

Everything here:

50

60

70

is larger.

Always.

This single rule makes searching incredibly efficient.

🌟 Engineering Insight

Notice something profound.

A normal binary tree has no meaning to the left and right children.

      50
     /  \
    2   99

Perfectly valid binary tree.

Or

      50
     /  \
    80   4

Still a valid binary tree.

A binary tree doesn't care.

But a BST does.

The left and right positions now have semantic meaning.

Left means "smaller."
Right means "larger."

That's what transforms a tree into a searchable data structure.

🧠 Think Like an Engineer

Imagine you're searching for 25.

        40
       /  \
     20    60
    / \    / \
10 30 50 70

At 40, you decide to go left.

Why is it safe to completely ignore the right subtree?

Because of the BST property.

Every value on the right subtree is greater than 40.

Since 25 is less than 40, it cannot possibly be there.

You aren't guessing.

You're using a guarantee provided by the data structure.

That's what makes algorithms fast: they exploit guarantees.

Exercises

Use this BST.

            50
          /    \
        30      70
       /  \    /  \
     20   40  60   80
1.

If you're searching for 60, list every node visited, in order.

2.

Search for 25.

Which nodes are visited before you conclude it doesn't exist?

3.

Why don't we search the right subtree of 50 when looking for 25?

Answer in your own words.

4.

Is this a valid BST?

        50
       /  \
     30    70
    / \
20 60

Why or why not?

5. ⭐ The Thinking Question

Which statement is more accurate?

A.

A BST is a binary tree.

B.

Every binary tree is a BST.

C.

Every BST is a binary tree, but not every binary tree is a BST.

Don't guess.

Reason it out.

📁 Repository Update

Create a new lesson:

docs/
└── trees/
└── lesson-15-binary-search-tree-introduction/
README.md

Document:

Why BST was invented.
Arrays vs Linked Lists vs BST.
The BST property.
Why searching is faster.
Your answers to today's exercises.
🌱 Final Thought

Today, we didn't learn an algorithm.

We learned why the algorithm is possible.

That's a subtle but important distinction.

Every fast algorithm is powered by an invariant, a rule that is always true.

For a BST, that invariant is:

Everything in the left subtree is smaller than the current node, and everything in the right subtree is larger.

From now on, every search, insertion, and deletion algorithm will rely on that single rule.

And once you truly trust that rule, BST algorithms begin to feel almost inevitable. 🌳