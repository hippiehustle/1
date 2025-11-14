package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Field;

/* renamed from: x6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810n extends AbstractC1813q implements InterfaceC1802f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f16264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810n(Field field, boolean z8, Object obj) {
        super(field, z8, false);
        o6.j.e(field, "field");
        this.f16264f = obj;
    }

    @Override // x6.AbstractC1813q, x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        ((Field) this.f16273a).set(this.f16264f, AbstractC0434i.W0(objArr));
        return Z5.y.f7506a;
    }
}
