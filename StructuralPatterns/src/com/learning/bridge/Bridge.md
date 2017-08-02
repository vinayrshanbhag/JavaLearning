When to use a bridge pattern 
----------------------------------

You want to avoid a permanent binding between an abstraction and implementation- especially when implementation may be selected 
or switched at run time.

Both the abstractions and their implementations should be extensible by subclassing

change in the implementations of an abstraction should not impact the clients - no recompilation of the code.

In C++, you want to hide the implementation for the .h file

Avoids proliferation of the classes.

Consequences of using the bridge
-----------------------------------
Decoupling interface and implementation- may be configured at runtime-may even be changed

Eliminates compile time dependency on implementation

Encourages layering -resulting in better system

Improved extensibility

Shields clients from implementation details.


Bridge vs other patterns
------------------------
Abstact factory can create and configure a particular Bridge.

Different from Adaptor pattern
1) Adaptor - making unrelated classes work together - usually applied to systems after the redesign.
2) Bridge- lets abstraction and implementation vary independently - used upfront in design.