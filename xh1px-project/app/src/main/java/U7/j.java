package U7;

import Q7.r;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f6207h;

    public j(long j, j jVar, int i4) {
        super(j, jVar, i4);
        this.f6207h = new AtomicReferenceArray(i.f6206f);
    }

    @Override // Q7.r
    public final int g() {
        return i.f6206f;
    }

    @Override // Q7.r
    public final void h(int i4, InterfaceC0622h interfaceC0622h) {
        this.f6207h.set(i4, i.f6205e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f4966f + ", hashCode=" + hashCode() + ']';
    }
}
