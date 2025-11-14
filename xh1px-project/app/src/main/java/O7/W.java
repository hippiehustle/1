package O7;

import L7.C0150h;
import P7.AbstractC0284a;
import P7.AbstractC0286c;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class W extends AbstractC0286c {

    /* renamed from: a, reason: collision with root package name */
    public long f4107a;

    /* renamed from: b, reason: collision with root package name */
    public C0150h f4108b;

    @Override // P7.AbstractC0286c
    public final boolean a(AbstractC0284a abstractC0284a) {
        U u8 = (U) abstractC0284a;
        if (this.f4107a >= 0) {
            return false;
        }
        long j = u8.f4100l;
        if (j < u8.f4101m) {
            u8.f4101m = j;
        }
        this.f4107a = j;
        return true;
    }

    @Override // P7.AbstractC0286c
    public final InterfaceC0617c[] b(AbstractC0284a abstractC0284a) {
        long j = this.f4107a;
        this.f4107a = -1L;
        this.f4108b = null;
        return ((U) abstractC0284a).v(j);
    }
}
