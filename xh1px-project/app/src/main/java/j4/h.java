package j4;

import f4.C0709b;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final C0709b f11930a;

    public h(C0709b c0709b) {
        this.f11930a = c0709b;
    }

    @Override // j4.i
    public final AbstractC1492c a() {
        return this.f11930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && o6.j.a(this.f11930a, ((h) obj).f11930a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11930a.hashCode();
    }

    public final String toString() {
        return "Trigger(uiCondition=" + this.f11930a + ")";
    }
}
