package v7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import t2.C1562a;

/* loaded from: classes.dex */
public class k implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15559d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1679b f15560e;

    /* renamed from: a, reason: collision with root package name */
    public final m f15561a;

    /* renamed from: b, reason: collision with root package name */
    public final C1678a f15562b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15563c;

    /* JADX WARN: Type inference failed for: r0v4, types: [v7.b, v7.k] */
    static {
        String substring;
        String canonicalName = k.class.getCanonicalName();
        o6.j.e(canonicalName, "<this>");
        int l02 = I7.m.l0(0, 6, canonicalName, ".");
        if (l02 == -1) {
            substring = "";
        } else {
            substring = canonicalName.substring(0, l02);
            o6.j.d(substring, "substring(...)");
        }
        f15559d = substring;
        f15560e = new k("NO_LOCKS", C1678a.f15545d);
    }

    public k(String str) {
        this(str, new C1562a(new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (!stackTrace[i4].getClassName().startsWith(f15559d)) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i4, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v7.i, v7.h] */
    public final i a(InterfaceC1162a interfaceC1162a) {
        return new h(this, interfaceC1162a);
    }

    public final e b(InterfaceC1163b interfaceC1163b) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC1163b, 1);
    }

    public final U1.c c(InterfaceC1163b interfaceC1163b) {
        return new U1.c(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC1163b, 4);
    }

    public N.f d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return A.j.r(sb, this.f15563c, ")");
    }

    public k(String str, m mVar) {
        C1678a c1678a = C1678a.f15546e;
        this.f15561a = mVar;
        this.f15562b = c1678a;
        this.f15563c = str;
    }
}
