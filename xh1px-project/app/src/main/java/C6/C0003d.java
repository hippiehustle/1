package C6;

import f7.C0725e;
import java.util.List;

/* renamed from: C6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements T {

    /* renamed from: d, reason: collision with root package name */
    public final T f736d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0008i f737e;

    /* renamed from: f, reason: collision with root package name */
    public final int f738f;

    public C0003d(T t8, InterfaceC0008i interfaceC0008i, int i4) {
        this.f736d = t8;
        this.f737e = interfaceC0008i;
        this.f738f = i4;
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        w7.J B8 = this.f736d.B();
        o6.j.d(B8, "getTypeConstructor(...)");
        return B8;
    }

    @Override // C6.T
    public final v7.n D() {
        v7.n D7 = this.f736d.D();
        o6.j.d(D7, "getStorageManager(...)");
        return D7;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return this.f736d.K(interfaceC0012m, obj);
    }

    @Override // C6.T
    public final boolean Q() {
        return true;
    }

    @Override // C6.T
    public final boolean R() {
        return this.f736d.R();
    }

    @Override // C6.InterfaceC0007h, C6.InterfaceC0010k
    public final InterfaceC0007h a() {
        return this.f736d.a();
    }

    @Override // C6.T
    public final w7.X e0() {
        w7.X e02 = this.f736d.e0();
        o6.j.d(e02, "getVariance(...)");
        return e02;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return this.f736d.getAnnotations();
    }

    @Override // C6.T
    public final int getIndex() {
        return this.f736d.getIndex() + this.f738f;
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        C0725e name = this.f736d.getName();
        o6.j.d(name, "getName(...)");
        return name;
    }

    @Override // C6.T
    public final List getUpperBounds() {
        List upperBounds = this.f736d.getUpperBounds();
        o6.j.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // C6.InterfaceC0011l
    public final O h() {
        O h8 = this.f736d.h();
        o6.j.d(h8, "getSource(...)");
        return h8;
    }

    @Override // C6.InterfaceC0007h
    public final w7.z l() {
        w7.z l6 = this.f736d.l();
        o6.j.d(l6, "getDefaultType(...)");
        return l6;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return this.f737e;
    }

    public final String toString() {
        return this.f736d + "[inner-copy]";
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this.f736d.a();
    }

    @Override // C6.T, C6.InterfaceC0007h, C6.InterfaceC0010k
    public final T a() {
        return this.f736d.a();
    }
}
