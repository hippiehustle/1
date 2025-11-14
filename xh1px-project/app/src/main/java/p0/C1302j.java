package p0;

import androidx.lifecycle.D;
import o6.InterfaceC1288g;

/* renamed from: p0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1302j implements D, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J1.a f13672d;

    public C1302j(J1.a aVar) {
        this.f13672d = aVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        return this.f13672d;
    }

    @Override // androidx.lifecycle.D
    public final /* synthetic */ void b(Object obj) {
        this.f13672d.m(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof D) && (obj instanceof InterfaceC1288g)) {
            return this.f13672d.equals(((InterfaceC1288g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
