package foo

fun foo(i: Int): String = "foo" + i
public fun foo(): Int = 4
public fun boo(): Int = 23
fun boo(i: Int): String = "boo" + i

trait T {
    public fun foo(): Int
    public fun boo(): Int
}

public class A : T {
    fun foo(i: Int): String = "A.foo" + i
    override fun foo(): Int = 42
    override fun boo(): Int = 2
    fun boo(i: Int): String = "A.boo" + i
}

// Helpers
native
fun String.replace(regexp: RegExp, replacement: String): String = noImpl

fun String.replaceAll(regexp: String, replacement: String): String = replace(RegExp(regexp, "g"), replacement)

native
class RegExp(regexp: String, flags: String)

//Testing

fun test(testName: String, ff: Any, fb: Any) {
    val f = ff.toString()
    val b = fb.toString().replaceAll("boo", "foo")

    if (f != b) throw Exception("FAILED on ${testName}:\n f = \"$f\"\n b = \"$b\"")
}

fun assertEquals<T>(expected: T, actual: T) {
    if (expected != actual) throw Exception("expected: $expected, actual: $actual")
}

fun box(): String {
    val a = A()

    test("foo()", { foo() }, { boo() })
    test("foo(Int)", { foo(1) }, { boo(1) })

    test("a.foo()", { a.foo() }, { a.boo() })
    test("a.foo(Int)", { a.foo(1) }, { a.boo(1) })

    assertEquals("foo3", foo(3))
    assertEquals(4, foo())
    assertEquals(23, boo())
    assertEquals("boo6", boo(6))

    assertEquals("A.foo3", a.foo(3))
    assertEquals(42, a.foo())
    assertEquals(2, a.boo())
    assertEquals("A.boo35", a.boo(35))

    return "OK"
}
