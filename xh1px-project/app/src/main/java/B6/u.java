package B6;

import a6.AbstractC0425A;
import a6.AbstractC0437l;
import f7.C0723c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n7.EnumC1170c;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f518a = AbstractC0425A.h0(Y6.f.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f519b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f520c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f521d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f522e;

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f523f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f524g;

    static {
        List<EnumC1170c> X8 = AbstractC0437l.X(EnumC1170c.BOOLEAN, EnumC1170c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC1170c enumC1170c : X8) {
            C0723c c0723c = enumC1170c.f13035g;
            if (c0723c != null) {
                String b4 = c0723c.f10797a.f().b();
                o6.j.d(b4, "asString(...)");
                a6.q.f0(linkedHashSet, Y6.f.f(b4, enumC1170c.f13033e + "Value()" + enumC1170c.c()));
            } else {
                EnumC1170c.a(15);
                throw null;
            }
        }
        f519b = AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(linkedHashSet, Y6.f.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), Y6.f.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), Y6.f.f("Double", "isInfinite()Z", "isNaN()Z")), Y6.f.f("Float", "isInfinite()Z", "isNaN()Z")), Y6.f.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), Y6.f.f("CharSequence", "isEmpty()Z"));
        f520c = Y6.f.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f521d = AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(AbstractC0425A.g0(Y6.f.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), Y6.f.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), Y6.f.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), Y6.f.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), Y6.f.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), Y6.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), Y6.f.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f522e = AbstractC0425A.g0(AbstractC0425A.g0(Y6.f.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), Y6.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), Y6.f.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC1170c enumC1170c2 = EnumC1170c.BOOLEAN;
        EnumC1170c enumC1170c3 = EnumC1170c.BYTE;
        List X9 = AbstractC0437l.X(enumC1170c2, enumC1170c3, EnumC1170c.DOUBLE, EnumC1170c.FLOAT, enumC1170c3, EnumC1170c.INT, EnumC1170c.LONG, EnumC1170c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = X9.iterator();
        while (it.hasNext()) {
            C0723c c0723c2 = ((EnumC1170c) it.next()).f13035g;
            if (c0723c2 != null) {
                String b9 = c0723c2.f10797a.f().b();
                o6.j.d(b9, "asString(...)");
                String[] a3 = Y6.f.a("Ljava/lang/String;");
                a6.q.f0(linkedHashSet2, Y6.f.f(b9, (String[]) Arrays.copyOf(a3, a3.length)));
            } else {
                EnumC1170c.a(15);
                throw null;
            }
        }
        String[] a4 = Y6.f.a("D");
        LinkedHashSet g02 = AbstractC0425A.g0(linkedHashSet2, Y6.f.f("Float", (String[]) Arrays.copyOf(a4, a4.length)));
        String[] a9 = Y6.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f523f = AbstractC0425A.g0(g02, Y6.f.f("String", (String[]) Arrays.copyOf(a9, a9.length)));
        String[] a10 = Y6.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f524g = Y6.f.f("Throwable", (String[]) Arrays.copyOf(a10, a10.length));
    }
}
