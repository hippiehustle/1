package x6;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: x6.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794B implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1794B f16228a = new Object();

    @Override // x6.InterfaceC1803g
    public final List a() {
        return a6.s.f7766d;
    }

    @Override // x6.InterfaceC1803g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return false;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        Class cls = Void.TYPE;
        o6.j.d(cls, "TYPE");
        return cls;
    }
}
