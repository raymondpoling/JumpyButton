# HomWworks

## Fix the bug in this project

Simple order of operations problem. Update midX, draw, and THEN modify the supporting values.

## Short Paper on Custom Views

Custom views are a tool useful for building custom interface components in three
basic ways:
1. Modifying Existing Components
2. Make Compound Components
3. Make Original Custom Components

### Modifying Existing Components
Existing components do a lot of things well, but if we would like to make it
just a little different, such as making text that shakes or other enhancements
to existing components, this is the way to do it. One only has to extend the
class, and provide their own modifications to the class to modify the look and
feel or minor behaviours.

### Make Compound Components
When the desired component is a combination of existing components, for example
the drop down menu which displays the selected text selected, and a list view
for selecting items (the example given, which is too good not to reference),
this is the way to do it. This is basically accomplished by creating a class to
either programatically, or via a mixture of programming and an XML layout
resource, build out the component.

### Making Original Components
This is as easy as extending View and overriding onDraw. From here a suite of
tools are available to make whatever component is desired. There is also a
measure method required for doing the math of the component, to ensure it
conforms to the layout specifications (or, if not, be clipped or whatever the
layout manager does in such circumstances).

