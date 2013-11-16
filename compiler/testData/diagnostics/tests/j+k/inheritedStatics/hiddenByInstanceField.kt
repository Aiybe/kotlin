// FILE: base/Base.java
package base;

class Base {
    public static final int PUBLIC = 1;
}

// FILE: derived/Derived.java

package derived;

public class Derived extends base.Base {
    public String PUBLIC = "";
}

// FILE: test.kt

import base.*
import derived.*

fun test() {
    Base.PUBLIC: Int

    Derived.<!UNRESOLVED_REFERENCE!>PUBLIC<!>
    Derived().PUBLIC
}