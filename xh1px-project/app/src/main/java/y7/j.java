package y7;

import C6.InterfaceC0007h;
import a6.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import w7.J;
import z6.C1882e;

/* loaded from: classes.dex */
public final class j implements J {

    /* renamed from: a, reason: collision with root package name */
    public final k f16534a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f16535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16536c;

    public j(k kVar, String... strArr) {
        o6.j.e(kVar, "kind");
        o6.j.e(strArr, "formatParams");
        this.f16534a = kVar;
        this.f16535b = strArr;
        String str = kVar.f16565d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f16536c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // w7.J
    public final boolean a() {
        return false;
    }

    @Override // w7.J
    public final InterfaceC0007h c() {
        l.f16567a.getClass();
        return l.f16569c;
    }

    @Override // w7.J
    public final Collection d() {
        return s.f7766d;
    }

    @Override // w7.J
    public final List e() {
        return s.f7766d;
    }

    @Override // w7.J
    public final z6.h o() {
        return (C1882e) C1882e.f16709f.getValue();
    }

    public final String toString() {
        return this.f16536c;
    }
}
