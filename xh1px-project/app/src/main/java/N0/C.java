package N0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C0202j f3564a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3565b;

    public C(C0202j c0202j) {
        this.f3564a = c0202j;
        this.f3565b = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C) {
                C c6 = (C) obj;
                C0202j c0202j = this.f3564a;
                if (c0202j != null && c0202j.equals(c6.f3564a)) {
                    return true;
                }
                Throwable th = this.f3565b;
                if (th != null && c6.f3565b != null) {
                    return th.toString().equals(th.toString());
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3564a, this.f3565b});
    }

    public C(Throwable th) {
        this.f3565b = th;
        this.f3564a = null;
    }
}
