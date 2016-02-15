/*     / \____  _    _  ____   ______  / \ ____  __    _ _____
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  / /  _  \   Javaslang
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/  \__/  /   Copyright 2014-now Daniel Dietrich
 * /___/\_/  \_/\____/\_/  \_/\__\/__/___\_/  \_//  \__/_____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javaslang.control.Option;
import javaslang.control.Try;

/**
 * Represents a function with 8 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <T3> argument 3 of the function
 * @param <T4> argument 4 of the function
 * @param <T5> argument 5 of the function
 * @param <T6> argument 6 of the function
 * @param <T7> argument 7 of the function
 * @param <T8> argument 8 of the function
 * @param <R> return type of the function
 * @author Daniel Dietrich
 * @since 1.1.0
 */
@FunctionalInterface
public interface CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends λ<R> {

    /**
     * The <a href="https://docs.oracle.com/javase/8/docs/api/index.html">serial version uid</a>.
     */
    long serialVersionUID = 1L;

    /**
     * Creates a {@code CheckedFunction8} based on
     * <ul>
     * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html">method reference</a></li>
     * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#syntax">lambda expression</a></li>
     * </ul>
     *
     * Examples (w.l.o.g. referring to Function1):
     * <pre><code>// using a lambda expression
     * Function1&lt;Integer, Integer&gt; add1 = Function1.of(i -&gt; i + 1);
     *
     * // using a method reference (, e.g. Integer method(Integer i) { return i + 1; })
     * Function1&lt;Integer, Integer&gt; add2 = Function1.of(this::method);
     *
     * // using a lambda reference
     * Function1&lt;Integer, Integer&gt; add3 = Function1.of(add1::apply);
     * </code></pre>
     * <p>
     * <strong>Caution:</strong> Reflection loses type information of lambda references.
     * <pre><code>// type of a lambda expression
     * Type&lt;?, ?&gt; type1 = add1.getType(); // (Integer) -&gt; Integer
     *
     * // type of a method reference
     * Type&lt;?, ?&gt; type2 = add2.getType(); // (Integer) -&gt; Integer
     *
     * // type of a lambda reference
     * Type&lt;?, ?&gt; type3 = add3.getType(); // (Object) -&gt; Object
     * </code></pre>
     *
     * @param methodReference (typically) a method reference, e.g. {@code Type::method}
     * @param <R> return type
     * @param <T1> 1st argument
     * @param <T2> 2nd argument
     * @param <T3> 3rd argument
     * @param <T4> 4th argument
     * @param <T5> 5th argument
     * @param <T6> 6th argument
     * @param <T7> 7th argument
     * @param <T8> 8th argument
     * @return a {@code CheckedFunction8}
     */
    static <T1, T2, T3, T4, T5, T6, T7, T8, R> CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> of(CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> methodReference) {
        return methodReference;
    }

    /**
     * Lifts the given {@code partialFunction} into a total function that returns an {@code Option} result.
     *
     * @param partialFunction a function that is not defined for all values of the domain (e.g. by throwing)
     * @param <R> return type
     * @param <T1> 1st argument
     * @param <T2> 2nd argument
     * @param <T3> 3rd argument
     * @param <T4> 4th argument
     * @param <T5> 5th argument
     * @param <T6> 6th argument
     * @param <T7> 7th argument
     * @param <T8> 8th argument
     * @return a function that applies arguments to the given {@code partialFunction} and returns {@code Some(result)}
     *         if the function is defined for the given arguments, and {@code None} otherwise.
     */
    static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function8<T1, T2, T3, T4, T5, T6, T7, T8, Option<R>> lift(CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> partialFunction) {
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> Try.of(() -> partialFunction.apply(t1, t2, t3, t4, t5, t6, t7, t8)).getOption();
    }

    /**
     * Applies this function to 8 arguments and returns the result.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @param t4 argument 4
     * @param t5 argument 5
     * @param t6 argument 6
     * @param t7 argument 7
     * @param t8 argument 8
     * @return the result of function application
     * @throws Throwable if something goes wrong applying this function to the given arguments
     */
    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) throws Throwable;

    /**
     * Applies this function partially to one argument.
     *
     * @param t1 argument 1
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction7<T2, T3, T4, T5, T6, T7, T8, R> apply(T1 t1) throws Throwable {
        return (T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to two arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction6<T3, T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2) throws Throwable {
        return (T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to three arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction5<T4, T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3) throws Throwable {
        return (T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to 4 arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @param t4 argument 4
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction4<T5, T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) throws Throwable {
        return (T5 t5, T6 t6, T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to 5 arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @param t4 argument 4
     * @param t5 argument 5
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction3<T6, T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) throws Throwable {
        return (T6 t6, T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to 6 arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @param t4 argument 4
     * @param t5 argument 5
     * @param t6 argument 6
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction2<T7, T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) throws Throwable {
        return (T7 t7, T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Applies this function partially to 7 arguments.
     *
     * @param t1 argument 1
     * @param t2 argument 2
     * @param t3 argument 3
     * @param t4 argument 4
     * @param t5 argument 5
     * @param t6 argument 6
     * @param t7 argument 7
     * @return a partial application of this function
     * @throws Throwable if something goes wrong partially applying this function to the given arguments
     */
    default CheckedFunction1<T8, R> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) throws Throwable {
        return (T8 t8) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    @Override
    default int arity() {
        return 8;
    }

    @Override
    default CheckedFunction1<T1, CheckedFunction1<T2, CheckedFunction1<T3, CheckedFunction1<T4, CheckedFunction1<T5, CheckedFunction1<T6, CheckedFunction1<T7, CheckedFunction1<T8, R>>>>>>>> curried() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    @Override
    default CheckedFunction1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tupled() {
        return t -> apply(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8);
    }

    @Override
    default CheckedFunction8<T8, T7, T6, T5, T4, T3, T2, T1, R> reversed() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    @Override
    default CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> memoized() {
        if (isMemoized()) {
            return this;
        } else {
            final Object lock = new Object();
            final Map<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> cache = new HashMap<>();
            final CheckedFunction1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tupled = tupled();
            return (CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> & Memoized) (t1, t2, t3, t4, t5, t6, t7, t8) -> {
                final R result;
                synchronized (lock) {
                    result = cache.computeIfAbsent(Tuple.of(t1, t2, t3, t4, t5, t6, t7, t8), t -> Try.of(() -> tupled.apply(t)).get());
                }
                return result;
            };
        }
    }

    /**
     * Returns a composed function that first applies this CheckedFunction8 to the given argument and then applies
     * {@linkplain CheckedFunction1} {@code after} to the result.
     *
     * @param <V> return type of after
     * @param after the function applied after this
     * @return a function composed of this and after
     * @throws NullPointerException if after is null
     */
    default <V> CheckedFunction8<T1, T2, T3, T4, T5, T6, T7, T8, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> after.apply(apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

}