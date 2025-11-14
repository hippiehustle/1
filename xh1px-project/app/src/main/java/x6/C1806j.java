package x6;

import java.lang.reflect.Field;

/* renamed from: x6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1806j extends AbstractC1809m implements InterfaceC1802f {

    /* renamed from: e, reason: collision with root package name */
    public final Object f16262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806j(Field field, Object obj) {
        super(field, false);
        o6.j.e(field, "field");
        this.f16262e = obj;
    }

    @Override // x6.AbstractC1809m, x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        return ((Field) this.f16273a).get(this.f16262e);
    }
}
