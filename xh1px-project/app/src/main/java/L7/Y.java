package L7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Y extends d0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(X x8) {
        super(true);
        C0154l c0154l;
        C0154l c0154l2;
        boolean z8 = true;
        N(x8);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0.f3211e;
        InterfaceC0153k interfaceC0153k = (InterfaceC0153k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0153k instanceof C0154l) {
            c0154l = (C0154l) interfaceC0153k;
        } else {
            c0154l = null;
        }
        if (c0154l != null) {
            d0 j = c0154l.j();
            while (!j.H()) {
                InterfaceC0153k interfaceC0153k2 = (InterfaceC0153k) atomicReferenceFieldUpdater.get(j);
                if (interfaceC0153k2 instanceof C0154l) {
                    c0154l2 = (C0154l) interfaceC0153k2;
                } else {
                    c0154l2 = null;
                }
                if (c0154l2 != null) {
                    j = c0154l2.j();
                }
            }
            this.f3196f = z8;
        }
        z8 = false;
        this.f3196f = z8;
    }

    @Override // L7.d0
    public final boolean H() {
        return this.f3196f;
    }

    @Override // L7.d0
    public final boolean J() {
        return true;
    }
}
