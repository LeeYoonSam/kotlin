class A {
    <!WRONG_ANNOTATION_TARGET!>@ann<!> init {}
    <!WRONG_ANNOTATION_TARGET!>@<!UNRESOLVED_REFERENCE!>aaa<!><!> init {}
}

interface T {
    <!ANONYMOUS_INITIALIZER_IN_INTERFACE!><!WRONG_ANNOTATION_TARGET!>@ann<!> init {}<!>
    <!ANONYMOUS_INITIALIZER_IN_INTERFACE!><!WRONG_ANNOTATION_TARGET!>@<!UNRESOLVED_REFERENCE!>aaa<!><!> init {}<!>
}

annotation class ann