package a6;

import java.util.Collection;

/* renamed from: a6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0438m extends AbstractC0437l {
    public static int d0(Iterable iterable, int i4) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i4;
    }
}
