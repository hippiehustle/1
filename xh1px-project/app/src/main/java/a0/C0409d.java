package a0;

import o6.j;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7665a;

    public C0409d(String str) {
        this.f7665a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0409d) {
            return j.a(this.f7665a, ((C0409d) obj).f7665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7665a.hashCode();
    }

    public final String toString() {
        return this.f7665a;
    }
}
