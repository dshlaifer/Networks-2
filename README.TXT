Q 4. Removing extends Post removes the inheritance relationship in the class diagram, causing MessagePost
to appear as an independent class, adding it back restores the inheritance and subclass relationship.

Q 5. MessagePost extends Post, so it automatically inherits all public methods of Post.

Q 6. The subclass accesses the author name by calling the inherited public getUserName()
 method, demonstrating that non-private superclass methods are available without any special syntax.
 
Q 7. Stepping through the constructor shows that the superclass
 (Post) constructor runs first and initializes its fields before the subclass (MessagePost) initializes its own fields.
 
 Q 13. Testing the assignments in BlueJ confirms that objects of 
 subclasses can be assigned to superclass references, but not vice versa, and that sibling classes 
 are incompatible.
 
Q 14. Nothing needs to change in the NewsFeed class because it stores Post objects and uses
 polymorphism, allowing new Post subclasses to be added without modifying the news feed.
 
