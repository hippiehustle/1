package g0;

import e.AbstractC0627c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749s extends AbstractC0627c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11067a;

    public C0749s(AtomicReference atomicReference) {
        this.f11067a = atomicReference;
    }

    @Override // e.AbstractC0627c
    public final void a(Object obj) {
        AbstractC0627c abstractC0627c = (AbstractC0627c) this.f11067a.get();
        if (abstractC0627c != null) {
            abstractC0627c.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
