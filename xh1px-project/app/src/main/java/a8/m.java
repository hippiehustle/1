package a8;

import java.util.List;
import n6.InterfaceC1162a;
import q4.X;

/* loaded from: classes.dex */
public final class m implements X7.f {

    /* renamed from: a, reason: collision with root package name */
    public final Z5.n f8292a;

    public m(InterfaceC1162a interfaceC1162a) {
        this.f8292a = new Z5.n(interfaceC1162a);
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        return f().a(str);
    }

    @Override // X7.f
    public final String b() {
        return f().b();
    }

    @Override // X7.f
    public final int c() {
        return f().c();
    }

    @Override // X7.f
    public final String d(int i4) {
        return f().d(i4);
    }

    @Override // X7.f
    public final X e() {
        return f().e();
    }

    public final X7.f f() {
        return (X7.f) this.f8292a.getValue();
    }

    @Override // X7.f
    public final boolean g() {
        return false;
    }

    @Override // X7.f
    public final List getAnnotations() {
        return a6.s.f7766d;
    }

    @Override // X7.f
    public final boolean h() {
        return false;
    }

    @Override // X7.f
    public final List i(int i4) {
        return f().i(i4);
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        return f().j(i4);
    }

    @Override // X7.f
    public final boolean k(int i4) {
        return f().k(i4);
    }
}
