package Q7;

import d6.InterfaceC0621g;

/* loaded from: classes.dex */
public final class w implements InterfaceC0621g {

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f4974d;

    public w(ThreadLocal threadLocal) {
        this.f4974d = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && o6.j.a(this.f4974d, ((w) obj).f4974d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4974d.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f4974d + ')';
    }
}
