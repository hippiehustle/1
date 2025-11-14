package L7;

import n6.InterfaceC1165d;

/* renamed from: L7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0148f f3227b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1165d f3228c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3229d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3230e;

    public C0157o(Object obj, InterfaceC0148f interfaceC0148f, InterfaceC1165d interfaceC1165d, Object obj2, Throwable th) {
        this.f3226a = obj;
        this.f3227b = interfaceC0148f;
        this.f3228c = interfaceC1165d;
        this.f3229d = obj2;
        this.f3230e = th;
    }

    public static C0157o a(C0157o c0157o, InterfaceC0148f interfaceC0148f, Throwable th, int i4) {
        Object obj = c0157o.f3226a;
        if ((i4 & 2) != 0) {
            interfaceC0148f = c0157o.f3227b;
        }
        InterfaceC0148f interfaceC0148f2 = interfaceC0148f;
        InterfaceC1165d interfaceC1165d = c0157o.f3228c;
        Object obj2 = c0157o.f3229d;
        if ((i4 & 16) != 0) {
            th = c0157o.f3230e;
        }
        c0157o.getClass();
        return new C0157o(obj, interfaceC0148f2, interfaceC1165d, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0157o)) {
            return false;
        }
        C0157o c0157o = (C0157o) obj;
        if (o6.j.a(this.f3226a, c0157o.f3226a) && o6.j.a(this.f3227b, c0157o.f3227b) && o6.j.a(this.f3228c, c0157o.f3228c) && o6.j.a(this.f3229d, c0157o.f3229d) && o6.j.a(this.f3230e, c0157o.f3230e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4 = 0;
        Object obj = this.f3226a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        InterfaceC0148f interfaceC0148f = this.f3227b;
        if (interfaceC0148f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC0148f.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        InterfaceC1165d interfaceC1165d = this.f3228c;
        if (interfaceC1165d == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC1165d.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Object obj2 = this.f3229d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Throwable th = this.f3230e;
        if (th != null) {
            i4 = th.hashCode();
        }
        return i11 + i4;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3226a + ", cancelHandler=" + this.f3227b + ", onCancellation=" + this.f3228c + ", idempotentResume=" + this.f3229d + ", cancelCause=" + this.f3230e + ')';
    }

    public /* synthetic */ C0157o(Object obj, InterfaceC0148f interfaceC0148f, InterfaceC1165d interfaceC1165d, Throwable th, int i4) {
        this(obj, (i4 & 2) != 0 ? null : interfaceC0148f, (i4 & 4) != 0 ? null : interfaceC1165d, (Object) null, (i4 & 16) != 0 ? null : th);
    }
}
